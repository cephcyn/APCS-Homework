
/**
 * Interface for the SortStats class.
 *
 * @author Joyce
 */
public interface ISortStats {

    /**
     * Abstract method that returns the name of the sorting algorithm.
     *
     * @return String
     */
    String getAlgorithm();

    /**
     * Abstract method that returns the length of the sorted array.
     *
     * @return int
     */
    int getNumItems();

    /**
     * Abstract method that returns the number of times that elements of the
     * array were compared to each other.
     *
     * @return int
     */
    int getNumComparisons();

    /**
     * Abstract method that returns the number of times that elements of the
     * array were stored in temporary variables or other sections of the array.
     *
     * @return int
     */
    int getNumMoves();

    /**
     * Abstract method that returns the amount of nanoseconds it took to sort
     * the array.
     *
     * @return long
     */
    long getNumNanoseconds();
}
