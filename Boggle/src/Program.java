
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
        System.out.println(board.find());
    }
}
