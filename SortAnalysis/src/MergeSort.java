
import java.util.Arrays;

public class MergeSort implements ISorter {

    int numComparisons;
    int numAssignments;

    public MergeSort() {
        this.numComparisons = 0;
        this.numAssignments = 0;
    }

    public SortStats sort(int[] a) {
        //init sortstat variables (this is separate so that variable tracking works)
        this.numComparisons = 0;
        this.numAssignments = 0;
        long startTime = System.nanoTime();
        
        //call the actual sort alg
        actualsort(a);
        
        return new SortStats("Merge Sort",
                a.length,
                this.numComparisons,
                this.numAssignments,
                System.nanoTime() - startTime);
    }

    private void actualsort(int[] a) {
        if (a.length > 1) {
            //split into left and right
            int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
            numAssignments += a.length / 2;
            int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
            numAssignments += a.length - a.length / 2;

            //sort each subarray
            actualsort(left);
            actualsort(right);

            //merge the two subarrays
            merge(a, left, right);
        }
    }

    private void merge(int a[], int[] left, int[] right) {
        int il = 0;
        int ir = 0;

        for (int i = 0; i < a.length; i++) {
            //if the left array is used up
            if (il >= left.length) {
                a[i] = right[ir];
                ir++;
                numAssignments++;
                //if the right array is used up
            } else if (ir >= right.length) {
                a[i] = left[il];
                il++;
                numAssignments++;
                //if the left header is smaller
            } else if (left[il] <= right[ir]) {
                a[i] = left[il];
                il++;
                numComparisons++;
                numAssignments++;
                //if the right header is smaller
            } else {
                a[i] = right[ir];
                ir++;
                numComparisons++;
                numAssignments++;
            }
        }
    }
}
