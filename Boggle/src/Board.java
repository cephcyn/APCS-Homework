
import java.util.ArrayList;

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
    }

    public ArrayList<String> find() {
    }
    
    public String toString() {
    }
}
