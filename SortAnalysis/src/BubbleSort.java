
public class BubbleSort implements ISorter {
    
    public BubbleSort() {
    }

    public SortStats sort(int[] a) {
        //init sortstat variables
        int numAssignments = 0;
        int numComparisons = 0;
        long startTime = System.nanoTime();
        //actual sort alg
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                numComparisons++;
                if (a[j] > a[j + 1]) {
                    swap(a, j);
                    //each swap uses three assignments
                    numAssignments += 3;
                }
            }
        }
        return new SortStats("Bubble Sort", 
                a.length, 
                numComparisons, 
                numAssignments, 
                System.nanoTime() - startTime);
    }

    private static void swap(int[] input, int index) {
        //swaps input[j] with the thing after it
        int temp = input[index];
        input[index] = input[index + 1];
        input[index + 1] = temp;
    }
}
