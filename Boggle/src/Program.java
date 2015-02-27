
import java.util.ArrayList;

/**
 *
 * @author Joyce Zhou
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("Welcome to Boggle, by Joyce Zhou.");
        WordList wordlist = new WordList("WordList.txt", 3, Integer.MAX_VALUE);
        Board board = new Board(wordlist, 4);
        System.out.println(board);
        System.out.println(formatWordList(board.find()));
    }

    public static String formatWordList(ArrayList<String> words) {
        String output = "Found " + words.size() + " word(s). \n";
        if (words.size() > 0) {
            int currentWordLength = 0;
            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).length() != currentWordLength) {
                    currentWordLength = words.get(i).length();
                    output += "\n" + currentWordLength + " letter words \n";
                }
                output += words.get(i) + "\n";
            }
        }
        return output;
    }
}
