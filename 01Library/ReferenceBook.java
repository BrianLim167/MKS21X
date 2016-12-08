public class ReferenceBook extends LibraryBook{
    private String collection;

    public ReferenceBook(String author, String title, String ISBN, int callNum){
	super(author,title,ISBN);
	setCallNum(callNum);
    }
    /**
    public int getCallNum(){
	return callNum;
    }

    public void setCallNum(int callNum){
	this.callNum = callNum;
    }
    **/
}
