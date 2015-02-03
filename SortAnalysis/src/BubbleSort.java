
public class BubbleSort implements ISorter {

    public SortStats sort(int[] a) {
        int numswaps = 0;
        long startTime = System.nanoTime();
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j);
                    numswaps++;
                }
            }
        }
        
    }

    private static void swap(int[] input, int index) {
        //swaps input[j] with the thing after it
        int temp = input[index];
        input[index] = input[index + 1];
        input[index + 1] = temp;
    }
}
