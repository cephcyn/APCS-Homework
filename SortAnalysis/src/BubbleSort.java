
/**
 * Class that contains methods necessary to sort a given array with the bubble
 * sort algorithm.
 *
 * @author Joyce
 */
public class BubbleSort implements ISorter {

    int numComparisons;
    int numAssignments;

    /**
     * Constructor for the BubbleSort class, sets # of comparisons and # of
     * assignments to zero.
     */
    public BubbleSort() {
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

        return new SortStats("Bubble Sort",
                a.length,
                numComparisons,
                numAssignments,
                System.nanoTime() - startTime);
    }

    /**
     * Sorts the input array a. Only called by the sort() method.
     *
     * @param a
     * @returns void
     */
    private void actualsort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                numComparisons++;
                if (a[j] > a[j + 1]) {
                    swap(a, j);
                }
            }
        }
    }

    /**
     * Swaps input[index] with input[index + 1].
     *
     * @param input
     * @param index
     */
    private void swap(int[] input, int index) {
        int temp = input[index];
        numAssignments++;
        input[index] = input[index + 1];
        numAssignments++;
        input[index + 1] = temp;
        numAssignments++;
    }
}
