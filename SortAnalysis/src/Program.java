
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        int[] list;
        ISorter[] sorters = new ISorter[]{
            new BubbleSort(),
            new InsertionSort(),
            new MergeSort(),
            new SelectionSort()};

        System.out.println("Test Set One:");
        System.out.println();
        //set one (random init, varying length)
        for (int i = 1; i <= 4096; i *= 2) {
            list = new int[i];
            randomInit(list);
            for (int j = 0; j < sorters.length; j++) {
                System.out.println(testAlgorithm(list.clone(), sorters[j]));
            }
        }

        System.out.println("Test Set Two:");
        System.out.println();
        //set two (custom init, fixed length)
        list = new int[4096];
        reverseInit(list);
        for (int j = 0; j < sorters.length; j++) {
            int[] copiedlist = list.clone();
            //sorting reverse
            System.out.println(printArray(copiedlist));
            System.out.println(testAlgorithm(copiedlist, sorters[j]));
            //sorting in order
            System.out.println(printArray(copiedlist));
            System.out.println(testAlgorithm(copiedlist, sorters[j]));
        }
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
            limit -= rand.nextInt(1048576) + 1;
            a[i] = limit;
        }
    }

    private static String testAlgorithm(int[] a, ISorter alg) {
        return alg.sort(a) + "\n";
    }

    private static String printArray(int[] a) {
        String output = "[" + a[0];
        for (int i = 1; i < a.length; i++) {
            output += ", " + a[i];
        }
        output += "]";
        return output;
    }
}
