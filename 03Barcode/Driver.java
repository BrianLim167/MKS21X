public class Driver{
    public static void main(String[]args){
	Barcode a = new Barcode("12345");
	System.out.println(a);
	System.out.println(a.clone());
	System.out.println(new Barcode("67890"));
	System.out.println(new Barcode("08451"));
	System.out.println(new Barcode("00042"));
	System.out.println(new Barcode("00167"));
	System.out.println(new Barcode("10101"));
    }
}
