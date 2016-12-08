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
	//System.out.println(new Barcode(""));
	//System.out.println(new Barcode("23"));
	//System.out.println(new Barcode("9999999"));
	//System.out.println(new Barcode("ABCDE"));
	//System.out.println(new Barcode("0000;"));
	//System.out.println(new Barcode("q"));
	System.out.println(a.compareTo(a));
	System.out.println(a.compareTo(new Barcode("02345")));
    }
}
