import java.util.Arrays;
public class Driver{
    public static void main(String[]args){
	int[]a = {0,8,5,7,4,6,3,2,9,1};
	int[]b = {0,8,5,7,4,6,3,2,9,1};
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(a.selectionSort()));
	System.out.println(Arrays.toString(b.insertionSort()));
	
    }
}
