/**
 *
 * @author s-zhouj
 */
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        
    }
    public int binarySearch(int[] a, int target) {
        
    }
    public int oldBinarySearch(int[] a, int target) {
        int min = 0, max = a.length - 1;
        while(min <= max) {
            int index = (max + min) / 2;
            if (target == a[index]) {
                return index;
            } else if (target > a[index]) {
                min = index + 1;
            } else {
                max = index - 1;
            }
        }
        return -1;
    }
}
