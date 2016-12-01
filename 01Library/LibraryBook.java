public abstract class LibraryBook extends Book implements Comparable{
    private String callNum;
    
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    abstract int compareTo(int otherCallNumber);
}
