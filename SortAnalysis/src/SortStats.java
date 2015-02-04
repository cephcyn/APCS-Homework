
/**
 * The class that is returned by each sorting algorithm to report its stats.
 *
 * @author Joyce
 */
public class SortStats implements ISortStats {

    private String algname;
    private int numItems;
    private int numComparisons;
    private int numMoves;
    private long numNanoseconds;

    /**
     * Constructor for the SortStats class, puts the input variables into the
     * appropriate fields.
     *
     * @param algname
     * @param numItems
     * @param numComparisons
     * @param numMoves
     * @param numNanoseconds
     */
    public SortStats(String algname, int numItems, int numComparisons, int numMoves, long numNanoseconds) {
        this.algname = algname;
        this.numItems = numItems;
        this.numComparisons = numComparisons;
        this.numMoves = numMoves;
        this.numNanoseconds = numNanoseconds;
    }

    /**
     * The name of the sort for which the SortStat was created for (Bubble sort,
     * merge sort, etc.)
     *
     * @return String
     */
    public String getAlgorithm() {
        return this.algname;
    }

    /**
     * The length of the array that the sorting algorithm processed.
     *
     * @return int
     */
    public int getNumItems() {
        return this.numItems;
    }

    /**
     * The number of times that two elements of the array were compared to each
     * other.
     *
     * @return int
     */
    public int getNumComparisons() {
        return this.numComparisons;
    }

    /**
     * The number of times that parts of an array were assigned to temporary
     * variables or to other sections of the array.
     *
     * @return int
     */
    public int getNumMoves() {
        return this.numMoves;
    }

    /**
     * The number of nanoseconds that it took to sort the array.
     *
     * @return long
     */
    public long getNumNanoseconds() {
        return this.numNanoseconds;
    }

    /**
     * Returns a properly formatted output with the variables. There is no line
     * break at the end.
     *
     * @return String
     */
    public String toString() {
        return "Algorithm      : " + getAlgorithm() + "\n"
                + "NumItems       : " + getNumItems() + "\n"
                + "NumComparisons : " + getNumComparisons() + "\n"
                + "NumMoves       : " + getNumMoves() + "\n"
                + "NumNanoseconds : " + getNumNanoseconds();

    }
}
