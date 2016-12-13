public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
    return "10.Lim.Brian"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
      for (int i=0 ; i<data.length ; i++){
	  int low = i;
	  for (int o=i ; o<data.length ; o++){
	      if (data[o] < low) {
		  low = o;
	      }
	  }
	  swap(data,i,low);
      }
  }

    private static void swap(int[]data,int fI,int sI){
	int temp = data[fI];
	data[fI] = data[sI];
	data[sI] = temp;
    }

}
