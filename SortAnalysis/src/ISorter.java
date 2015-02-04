
/**
 * The interface that all of the sorting algorithms implement, allowing single
 * array to store them all.
 *
 * @author Joyce
 */
public interface ISorter {

    /**
     * Abstract method that sorts the members of given array a. Returns an
     * object of type ISortStats that contains the statistics relevant to the
     * sorting.
     *
     * @param a
     * @return ISortStats
     */
    ISortStats sort(int[] a);
}
