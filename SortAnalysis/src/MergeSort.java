
import java.util.Arrays;

public class MergeSort implements ISorter {

    public MergeSort() {
    }

    public SortStats sort(int[] a) {
        //init sortstat variables
        int numComparisons = 0;
        int numAssignments = 0;
        long startTime = System.nanoTime();
        //actual sort alg
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
        return new SortStats("Merge Sort",
                a.length,
                numComparisons,
                numAssignments,
                System.nanoTime() - startTime);
    }

    private static void merge(int a[], int[] left, int[] right) {
        int il = 0;
        int ir = 0;

        for (int i = 0; i < a.length; i++) {
            //if the left array is used up
            if (il >= left.length) {
                a[i] = right[ir];
                ir++;
                //if the right array is used up
            } else if (ir >= right.length) {
                a[i] = left[il];
                il++;
                //if the left header is smaller
            } else if (left[il] <= right[ir]) {
                a[i] = left[il];
                il++;
                //if the right header is smaller
            } else {
                a[i] = right[ir];
                ir++;
            }
        }
    }
}
