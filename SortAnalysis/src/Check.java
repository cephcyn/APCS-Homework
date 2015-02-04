
/**
 * A static class used to check if the input array is sorted.
 *
 * @author Joyce
 */
public class Check {

    /**
     * Returns true or false based on if input array a is sorted from lowest to
     * highest.
     *
     * @param a
     * @return boolean
     */
    public static boolean isInOrder(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
