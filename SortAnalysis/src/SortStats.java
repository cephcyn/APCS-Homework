
public class SortStats implements ISortStats {

    String algname;
    int numItems;
    int numComparisons;
    int numMoves;
    long numNanoseconds;

    public SortStats(String algname, int numItems, int numComparisons, int numMoves, long numNanoseconds) {
        this.algname = algname;
        this.numItems = numItems;
        this.numComparisons = numComparisons;
        this.numMoves = numMoves;
        this.numNanoseconds = numNanoseconds;
    }

    public String getAlgorithm() {
        return this.algname;
    }

    public int getNumItems() {
        return this.numItems;
    }

    public int getNumComparisons() {
        return this.numComparisons;
    }

    public int getNumMoves() {
        return this.numMoves;
    }

    public long getNumNanoseconds() {
        return this.numNanoseconds;
    }
}
