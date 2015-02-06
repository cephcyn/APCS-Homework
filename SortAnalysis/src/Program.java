
import java.util.Random;

/**
 * The class that contains the main method, which is used to test and display
 * the feedback given by the other classes.
 *
 * @author Joyce
 */
public class Program {

    /**
     * Main method. Runs two different sets of tests, first applying each sort
     * algorithm to randomly-populated arrays of increasing length (0 to 4096 by
     * a factor of 2), then applying each algorithm on descending and ascending
     * arrays of length 4096.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] list;
        ISorter[] sorters = new ISorter[]{
            new BubbleSort(),
            new InsertionSort(),
            new MergeSort(),
            new SelectionSort()};
        String errormessage
                = "ERROR ERROR ERROR! THE SORTING ALGORITHM FAILED TO SORT CORRECTLY! YOU FAILED!!!";

        //set one (random init, varying length)
        for (int i = 1; i <= 4096; i *= 2) {
            list = new int[i];
            randomInit(list);
            for (int j = 0; j < sorters.length; j++) {
                int[] copylist = list.clone();
                System.out.println(displayStats(sorters[j].sort(copylist)));

                //if the sort didn't work, display error
                if (!Check.isInOrder(copylist)) {
                    System.out.println(errormessage);
                }
            }
        }

        //set two (custom init, fixed length)
        list = new int[4096];
        reverseInit(list);
        for (int j = 0; j < sorters.length; j++) {
            int[] copylist = list.clone();
            //sorting reverse
            System.out.println(displayStats(sorters[j].sort(copylist)));
            //if the sort didn't work, display error
            if (!Check.isInOrder(copylist)) {
                System.out.println(errormessage);
            }

            //sorting in order
            System.out.println(displayStats(sorters[j].sort(copylist)));
            //if the sort didn't work, display error
            if (!Check.isInOrder(copylist)) {
                System.out.println(errormessage);
            }
        }
    }

    /**
     * Populates the input array with randomly selected integers.
     *
     * @param a
     */
    private static void randomInit(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt();
        }
    }

    /**
     * Populates the input array with descending integers.
     *
     * @param a
     */
    private static void reverseInit(int[] a) {
        Random rand = new Random();
        int limit = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            limit -= rand.nextInt(1048576) + 1;
            a[i] = limit;
        }
    }

    /**
     * Method that displays the result of sorting (ISortStats) in a pretty way.
     *
     * @param a
     * @param alg
     * @return String
     */
    private static String displayStats(ISortStats alg) {
        return alg + "\n";
    }

    /**
     * Unused method (used in testing) that displays arrays in [element,
     * element] form.
     *
     * @param a
     * @return String
     */
    private static String printArray(int[] a) {
        String output = "[" + a[0];
        for (int i = 1; i < a.length; i++) {
            output += ", " + a[i];
        }
        output += "]";
        return output;
    }
}
