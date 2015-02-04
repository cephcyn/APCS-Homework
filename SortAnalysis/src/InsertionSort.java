
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
        for (int i = 0; i < a.length; i++) {
            int newindex = 0;
            while (a[newindex] < a[i] && newindex < i) {
                numComparisons++;
                newindex++;
            }
            insertvalue(a, newindex, i);
        }
    }

    private void insertvalue(int[] a, int newindex, int insertindex) {
        //inserts the given indx-value to the given point,
        //then shifts everything after it down one slot,
        //consuming the insertindex value

        int temp = a[insertindex];
        numAssignments++;
        for (int i = newindex; i < insertindex; i++) {
            a[i + 1] = a[i];
            numAssignments++;
        }
        a[newindex] = temp;
        numAssignments++;
    }

}
