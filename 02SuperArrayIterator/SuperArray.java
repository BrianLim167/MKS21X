public class SuperArray implements Iterable<String>{
    import java.util.Iterator;

    private int[] data;
    private int size;
  

  //0

  //constructor make an empty superArray should make size 0, 

  //but the data capacity 10.
    public SuperArray(){
	data = new int[10];
	size = 0;
    }
    public SuperArray(int size){
	data = new int[size];
	this.size = size;
    }
    public SuperArray(int[]ary){
	this(ary.length);
	data = new int[ary.length];
	for (int n=0 ; n<ary.length ; n++){
	    data[n] = ary[n];
	}
    }

    public int size(){
	return size;
    }


  //1

/**add the value n to the next available slot in the superArray.

 *this will change the size. This function should always work

 *And will resize the SuperArray if needed./*
 
 */
    public void add(int n){
	if(size==data.length){
	    grow();
	}
	data[size]=n;
	size++;
    }


  //2

/**Resize the data, by making a new array, then copying over elements, use this as your data.

*/


  private void grow(){
      int[]temp = new int[data.length*2+1];
      for (int n=0 ; n<data.length ; n++){
	  temp[n] = data[n];
      }
      data = temp;
  }

  //3

   /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
    *commas between... square bracket start/end and no comma at end.*/

  public String toString(){
      String ans="";
      ans += "[";
      for (int n=0 ; n<size ; n++){
	  if (n==size-1){
	      ans += " "+data[n];
	  }
	  else {
	      ans += " "+data[n]+",";
	  }
      }
      ans += "]";
      return ans;
  }

  //4

    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
    *(capacity is 10, but only 6 are used)
    *commas between... square bracket start/end and no comma at end.
    *unused slots should be printed as _ (underscores) */

    public String toStringDebug(){
	String ans="";
	ans += "[";
	for (int n=0 ; n<data.length ; n++){
	    if (n==data.length-1 && n>=size){
		ans += " _";
	    }
	    else if (n==data.length-1 && n<size){
		ans += " "+data[n];
	    }
	    else if (n>=size){
		ans += " _,";
	    }
	    else {
		ans += " "+data[n]+",";
	    }
	}
	ans += "]";
	return ans;
    }

    public int get(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }

    public void clear(){
	size = 0;
    }

    public boolean isEmpty(){
	return size == 0;
    }

    public int set(int index , int element){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	int ans = get(index);
	data[index] = element;
	return ans;
    }

    private int[] copy(){
	int[] ans = new int[data.length];
	for (int n=0 ; n<data.length ; n++){
	    ans[n] = data[n];
	}
	return ans;
    }
    
    private void shift(int index){
	for (int n=size-1 ; n>index ; n--){
	    set(n,get(n-1));
	}
    }
    
    public void add(int index , int element){
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	add(0);
	shift(index);
	set(index,element);
    }
    
    public int remove(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	int ans = get(index);
	for (int n=index ; n<size-1 ; n++){
	    set(n,get(n+1));
	}
	size--;
	return ans;
    }

    public int[] toArray(){
	int[]ans = new int[size];
	for (int n=0 ; n<size ; n++){
	    ans[n] = get(n);
	}
	return ans;
    }

    public int indexOf(int i){
	int ans = -1;
	for (int n=size-1 ; n>=0 ; n--){
	    if (get(n) == i){
		ans = n;
	    }
	}
	return ans;
    }
    public int lastIndexOf(int i){
	int ans = -1;
	for (int n=0 ; n<size ; n++){
	    if (get(n) == i){
		ans  = n;
	    }
	}
	return ans;
    }

    private void trimToSize(){
	int[]temp = new int[size];
	for (int n=0 ; n<size ; n++){
	    temp[n] = get(n);
	}
	data = temp;
    }
}
