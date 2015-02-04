
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        int[] list;
        ISorter[] sorters = new ISorter[]{
            new BubbleSort(),
            new InsertionSort(),
            new MergeSort(),
            new SelectionSort()};

        //set one (random init, varying length)
        for (int i = 1; i <= 4096; i *= 2) {
            list = new int[i];
            randomInit(list);
            for (int j = 0; i < sorters.length; i++) {
                System.out.println(testAlgorithm(list, sorters[j]));
            }
        }

        //set two (custom init, fixed length)
    }

    private static void randomInit(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt();
        }
    }

    private static void reverseInit(int[] a) {
        Random rand = new Random();
        int limit = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            a[i] = limit;
            limit -= rand.nextInt(4096);
        }
    }

    private static String testAlgorithm(int[] a, ISorter alg) {
        int[] list = a.clone();
    }

    private static String formatArray(int[] a) {
        String out = "[" + a[0];
        for (int i = 1; i < a.length; i++) {
            out += ", " + a[i];
        }
        out += "]";
        return out;
    }
}
