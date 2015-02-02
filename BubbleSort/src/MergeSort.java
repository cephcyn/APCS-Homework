
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
    }

    void sort(int[] a) {
        if (a.length > 1) {
            //split into left and right
            int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);

            //sort each subarray
            sort(left);
            sort(right);

            //merge the two subarrays
            merge(a, left, right);
        }
    }

    void merge(int a[], int[] left, int[] right) {
        int il = 0;
        int ir = 0;

        for (int i = 0; i < a.length; i++) {
        }
    }
}
