
public class BubbleSort implements ISorter {

    int numComparisons;
    int numAssignments;

    public BubbleSort() {
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
        return new SortStats("Bubble Sort",
                a.length,
                numComparisons,
                numAssignments,
                System.nanoTime() - startTime);
    }

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

    private void swap(int[] input, int index) {
        //swaps input[j] with the thing after it
        int temp = input[index];
        numAssignments++;
        input[index] = input[index + 1];
        numAssignments++;
        input[index + 1] = temp;
        numAssignments++;
    }
}
