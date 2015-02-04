
public class InsertionSort implements ISorter {

    int numComparisons;
    int numAssignments;

    public InsertionSort() {
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

        return new SortStats("Insertion Sort",
                a.length,
                this.numComparisons,
                this.numAssignments,
                System.nanoTime() - startTime);
    }

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
