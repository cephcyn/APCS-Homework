
import java.util.Comparator;

/**
 *
 * @author Joyce Zhou
 */
public class WordComparator implements Comparator<String> {
    
    public int compare(String s1, String s2) {
        if (s2.length() != s1.length()) {
            return s2.length() - s1.length();
        } else {
            return s1.compareTo(s2);
        }
    }
    
}
