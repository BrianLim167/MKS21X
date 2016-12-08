public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private int callNum;

    abstract int getCallNum();
    
    abstract void setCallNum(int callNum);
    
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    abstract int compareTo(int otherCallNumber);
}
