
/**
 *
 * @author s-zhouj
 */
public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 9};
        int[] b = {-4, 2, 5, 19, 50, 61};
        int[] c = {-15, -10, -5, 0, 5};
        System.out.println(binarySearch(a, 9));
        System.out.println(binarySearch(b, -4));
        System.out.println(binarySearch(c, 0));
        System.out.println(binarySearch(a, 3));
        System.out.println(binarySearch(b, 70));
        System.out.println(binarySearch(c, 300));
    }

    public static int binarySearch(int[] a, int target) {
        return recursivePortion(a, target, 0, a.length);
    }

    private static int recursivePortion(int[] a, int target, int min, int max) {
        int mid = (min + max) / 2;
        if (min < max) {
            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target) {
                return recursivePortion(a, target, min, mid);
            } else {
                return recursivePortion(a, target, mid + 1, max);
            }
        }
        return -1;
    }
}
