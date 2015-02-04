
/**
 * Class that contains methods necessary to sort a given array with the
 * selection sort algorithm.
 *
 * @author Joyce
 */
public class SelectionSort implements ISorter {

    int numComparisons;
    int numAssignments;

    /**
     * Constructor for the SelectionSort class, initializes all fields to 0.
     */
    public SelectionSort() {
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
    public ISortStats sort(int[] a) {
        //init sortstat variables (this is separate so that variable tracking works)
        this.numComparisons = 0;
        this.numAssignments = 0;
        long startTime = System.nanoTime();

        //call the actual sort alg
        actualsort(a);

        return new SortStats("Selection Sort",
                a.length,
                this.numComparisons,
                this.numAssignments,
                System.nanoTime() - startTime);
    }

    /**
     * Sorts the input array a using selection sort method. This is only called
     * by sort().
     *
     * @param a
     */
    private void actualsort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minindex = i;
            for (int currentread = i; currentread < a.length; currentread++) {
                numComparisons++;
                //get the index of the minval
                if (a[currentread] < a[minindex]) {
                    minindex = currentread;
                }
            }
            swap(a, i, minindex);
        }
    }

    /**
     * Swaps a[i] with a[min].
     *
     * @param a
     * @param i
     * @param min
     */
    private void swap(int[] a, int i, int min) {
        //swaps a[i] with a[min]
        int temp = a[i];
        numAssignments++;
        a[i] = a[min];
        numAssignments++;
        a[min] = temp;
        numAssignments++;

    }
}
