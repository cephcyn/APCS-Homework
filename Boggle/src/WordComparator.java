
import java.util.Comparator;

/**
 *
 * @author Joyce Zhou
 */
public class WordComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }

}
