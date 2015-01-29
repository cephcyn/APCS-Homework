
import java.util.Random;

public class BubbleSort {

    public static void initializeSort(int[] input) {
        Random rand = new Random();
        for (int i = 0; i < input.length; i++) {
            input[i] = rand.nextInt();
        }
    }

    public static int bubbleSort(int[] input) {
        int numswaps = 0;
        for (int i = input.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (input[j] > input[j + 1]) {
                    swap(input, j);
                    numswaps++;
                }
            }
        }
        return numswaps;
    }

    private static void swap(int[] input, int index) {
        //swaps input[j] with the thing after it
        int temp = input[index];
        input[index] = input[index + 1];
        input[index + 1] = temp;
    }

    public static void main(String[] args) {
        int[] list;
        for (int i = 1; i <= 1000; i *= 10) {
            list = new int[i];
            initializeSort(list);
            int swapcount = bubbleSort(list);
            //print the list
            System.out.print("[" + list[0]);
            for (int j = 1; j < list.length; j++) {
                System.out.print(", " + list[j]);
            }
            System.out.println("]");
            //print the number of counts
            System.out.println(swapcount + " swaps");
        }
    }
}
