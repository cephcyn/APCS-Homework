
/**
 * Class that contains methods necessary to sort a given array with the
 * insertion sort algorithm.
 *
 * @author Joyce
 */
public class InsertionSort implements ISorter {

    int numComparisons;
    int numAssignments;

    /**
     * Constructor for the InsertionSort class, initializes all fields to 0.
     */
    public InsertionSort() {
        this.numComparisons = 0;
        this.numAssignments = 0;
    }

    /**
     * Sorts the given array a. This method uses actualsort() to do the sorting
     * work, to be consistent with MergeSort (which uses recursion, so a
     * separate method is necessary).
     *
     * @param a
     * @return SortStats
     */
    public SortStats sort(int[] a) {
        //init sortstat variables (this is separate so that variable tracking works)
        this.numComparisons = 0;
        this.numAssignments = 0;
        long startTime = System.nanoTime();

        //call the actual sort alg
        actualsort(a);

        return new SortStats("Insertion Sort",
                a.length,
                this.numComparisons,
                this.numAssignments,
                System.nanoTime() - startTime);
    }

    /**
     * Sorts the contents of int array a from smallest to largest.
     *
     * @param a
     */
    private void actualsort(int[] a) {
        for (int sorting = 1; sorting < a.length; sorting++) {
            int temp = a[sorting];
            int dest;
            numComparisons++;
            for (dest = sorting; dest > 0 && a[dest - 1] > temp; dest--) {
                a[dest] = a[dest - 1];
                numComparisons++;
                numAssignments++;
            }
            a[dest] = temp;
            numAssignments++;
        }
    }
}
