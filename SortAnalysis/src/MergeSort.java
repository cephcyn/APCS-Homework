
import java.util.Arrays;

/**
 * Class that contains methods necessary to sort a given array with the merge sort algorithm.
 * @author Joyce
 */
public class MergeSort implements ISorter {

    int numComparisons;
    int numAssignments;

    /**
     * Constructor for the MergeSort class, sets all fields to zero.
     */
    public MergeSort() {
        this.numComparisons = 0;
        this.numAssignments = 0;
    }

    /**
     * Sorts the given array a. This method uses actualsort() to do the sorting work,
     * as merge sort uses recursion. Since variable tracking is reset per-call of this method,
     * a separate method is necessary.
     * @param a
     * @return SortStats
     */
    public ISortStats sort(int[] a) {
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
    
    /**
     * Sorts the given array a. This method calls itself, therefore it is necessary
     * to put it separately from sort().
     * @param a 
     */
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

    /**
     * Joins the two sorted arrays left and right into the larger array a, reading
     * the header of each array to put its contents into a as appropriate.
     * @param a
     * @param left
     * @param right 
     */
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
