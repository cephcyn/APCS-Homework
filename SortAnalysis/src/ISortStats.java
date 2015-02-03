public interface ISortStats {
    String getAlgorithm();
    int getNumItems();
    int getNumComparisons();
    int getNumMoves();
    long getNumNanoseconds();
}
