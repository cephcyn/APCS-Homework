
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Joyce Zhou
 */
public class Board {

    WordList wordlist;
    String[][] letters;

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
        //randomly put in a prefix
        String[] prefixes = {"RE-", "STR-", "UN-"};
        letters[rand.nextInt(letters.length)][rand.nextInt(letters.length)] = prefixes[rand.nextInt(prefixes.length)];
    }

    public ArrayList<String> find() {
    }

    public String toString() {
    }
}
