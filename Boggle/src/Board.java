
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Joyce Zhou
 */
public class Board {

    private WordList wordlist;
    private String[][] letters;

    public Board(WordList wordlist, int boardSize) {
        this.wordlist = wordlist;
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
            String[] prefixes = {"RE-", "STR-", "UN-"};
            letters[rand.nextInt(letters.length)][rand.nextInt(letters.length)] = prefixes[rand.nextInt(prefixes.length)];
        }
    }

    public ArrayList<String> find() {
        return new ArrayList<String>(5);
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < letters.length; i++) {
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
        while (output.length() < longest) {
            output += " ";
        }
        return output;
    }
}