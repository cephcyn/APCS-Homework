
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Joyce Zhou
 */
public class Board {

    private static final String[] PREFIXES = {"RE-", "STR-", "UN-"};

    private WordList wordlist;
    private String[][] letters;

    public Board(WordList wordlist, int boardSize) {
        this.wordlist = wordlist;
        letters = new String[][]{{"T", "E", "A", "M"}, {"S", "Y", "F", "S"}, {"P", "A", "T", "E"}, {"G", "N", "I", "D"}};
        /* TODO: THIS PART ACTUALLY WORKS, BUT I HAVE TO TEST WITH A PREDEFINED BOARD        
         letters = new String[boardSize][boardSize];
         //fill array with letters
         for (int i = 0; i < letters.length; i++) {
         for (int j = 0; j < letters.length; j++) {
         letters[i][j] = wordlist.nextLetter();
         }
         }
         Random rand = new Random();
         //randomly put in a prefix (50% chance)
         if (rand.nextDouble() >= 0.5) {
         letters[rand.nextInt(letters.length)][rand.nextInt(letters.length)] = PREFIXES[rand.nextInt(PREFIXES.length)];
         }
         */
    }

    public ArrayList<String> find() {
        ArrayList<String> result = new ArrayList<String>();
        boolean[][] searched = new boolean[letters.length][letters.length];
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                find(result, searched, "", 0, i, j);
            }
        }
        Collections.sort(result, new WordComparator());
        return result;
    }

    private void find(ArrayList<String> foundwords, boolean[][] breadcrumbs, String sofar, int letterssearched, int row, int column) {
        //square has to be in bounds
        //and unsearched
        //and fewer letters than maxlength
        //and cannot be a prefix unless it's the first letter
        if ((row >= 0 && row < letters.length)
                && (column >= 0 && column < letters.length)
                && (breadcrumbs[row][column] == false)
                && (letterssearched < wordlist.getLongestWordLength())
                && (letterssearched == 0 || letters[row][column].length() == 1)) {
            //mark changes
            breadcrumbs[row][column] = true;
            String testingletter = letters[row][column];
            if (testingletter.length() > 1) {
                testingletter = testingletter.substring(0, testingletter.length() - 1);
            }
            //test current word
            if (wordlist.contains(sofar) && !foundwords.contains(sofar)) {
                foundwords.add(sofar);
            }
            //run eight tests
            find(foundwords, breadcrumbs, sofar + testingletter, letterssearched + testingletter.length(), row + 1, column);
            find(foundwords, breadcrumbs, sofar + testingletter, letterssearched + testingletter.length(), row + 1, column + 1);
            find(foundwords, breadcrumbs, sofar + testingletter, letterssearched + testingletter.length(), row, column + 1);
            find(foundwords, breadcrumbs, sofar + testingletter, letterssearched + testingletter.length(), row - 1, column + 1);
            find(foundwords, breadcrumbs, sofar + testingletter, letterssearched + testingletter.length(), row - 1, column);
            find(foundwords, breadcrumbs, sofar + testingletter, letterssearched + testingletter.length(), row - 1, column - 1);
            find(foundwords, breadcrumbs, sofar + testingletter, letterssearched + testingletter.length(), row, column - 1);
            find(foundwords, breadcrumbs, sofar + testingletter, letterssearched + testingletter.length(), row - 1, column + 1);
            //undo changes
            breadcrumbs[row][column] = false;
        }
    }

    public String toString() {
        String output = "";
        //print row
        for (int i = 0; i < letters.length; i++) {
            //print letter
            for (int j = 0; j < letters.length; j++) {
                output += spaceLetters(letters[i][j]);
            }
            output += "\n";
        }
        return output;
    }

    private String spaceLetters(String letter) {
        String output = letter;
        //find the longest letter and space it such (accounting for prefixes)
        int longest = 0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (letters[i][j].length() > longest) {
                    longest = letters[i][j].length();
                }
            }
        }
        //space the letter
        while (output.length() <= longest) {
            output += " ";
        }
        return output;
    }
}
