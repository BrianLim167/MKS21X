import java.util.Arrays;
public class Sorts{
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    public static String name(){
	return "10.Lim.Brian"; 
    }

    private static void swap(int[]data,int fI,int sI){
	int temp = data[fI];
	data[fI] = data[sI];
	data[sI] = temp;
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){
	for (int ind=0 ; ind<data.length ; ind++){
	    int low = ind;
	    for (int o=ind ; o<data.length ; o++){
		if (data[o] < data[low]) {
		    low = o;
		}
	    }
	    swap(data,ind,low);
	}
    }

    public static void insertionSort(int[]data){
	for (int indSort=1 ; indSort<data.length ; indSort++){
	    int num = data[indSort];
	    int ind;
	    for (ind=indSort ; ind>0 && num<data[ind-1] ; ind--){
		data[ind]=data[ind-1];
	    }
	    data[ind] = num;
	}
    }

    public static void bubbleSort(int[]data){
        for (int indSorted=data.length ; indSorted>=0 ; indSorted--){
	    boolean swapped=false;
	    for (int indSwap=0 ; indSwap<indSorted-1 ; indSwap++){
		if (data[indSwap]>data[indSwap+1]){
		    swap(data,indSwap,indSwap+1);
		    swapped=true;
		}
	    }
	    if (!swapped){
		return;
	    }
	}
    }
}
