
/**
 *
 * @author s-zhouj
 */
public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5};
        System.out.println(binarySearch(a, 2));
    }

    public static int binarySearch(int[] a, int target) {
        return recursivePortion(a, target, 0, a.length);
    }

    private static int recursivePortion(int[] a, int target, int min, int max) {
        int mid = (min + max) / 2;
        if (a.length != 1) {
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                return recursivePortion(a, target, min, mid);
            } else {
                return recursivePortion(a, target, mid, max);
            }
        }
        return -1;
    }
}
