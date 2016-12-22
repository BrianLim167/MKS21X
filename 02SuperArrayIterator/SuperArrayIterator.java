public class SuperArrayIterator implements Iterator<String>{
    import java.util.Iterator;

    private SuperArray list;
    private int element;

    public SuperArrayIterator(SuperArray list){
	this.list = list;
    }

    public boolean hasNext(){
	return element < list.size();
    }
    public String next(){
	if (hasNext()){
	    return list.get(element);
	    element++;
        }
    }
}
