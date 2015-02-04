
public class SortStats implements ISortStats {

    private String algname;
    private int numItems;
    private int numComparisons;
    private int numMoves;
    private long numNanoseconds;

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
    
    public String toString() {
        return 
                "Algorithm      : " + getAlgorithm() + "\n" + 
                "NumItems       : " + getNumItems() + "\n" + 
                "NumComparisons : " + getNumComparisons() + "\n" + 
                "NumMoves       : " + getNumMoves() + "\n" + 
                "NumNanoseconds : " + getNumNanoseconds();

    }
}
