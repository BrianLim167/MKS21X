import java.util.Arrays;
public class Driver{
    public static void main(String[]args){
	int[]a = {0,1,8,8,6,5,2,7,9,3,4,7,6,3,0,2,4,9,1,5};
	System.out.println(Arrays.toString(a));
	System.out.println();
        
	int[]b = {0,1,8,8,6,5,2,7,9,3,4,7,6,3,0,2,4,9,1,5};
	Sorts.selectionSort(b);
	System.out.println(Arrays.toString(b));
	
	int[]c = {0,1,8,8,6,5,2,7,9,3,4,7,6,3,0,2,4,9,1,5};
	Sorts.insertionSort(c);
	System.out.println(Arrays.toString(c));
	
	int[]d = {0,1,8,8,6,5,2,7,9,3,4,7,6,3,0,2,4,9,1,5};
	Sorts.bubbleSort(d);
	System.out.println(Arrays.toString(d));
    }
}
