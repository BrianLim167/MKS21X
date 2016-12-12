public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      if (zip.length() != 5){
	  throw new IllegalArgumentException("zip must have a length of 5");
      }
      for (int index=0 ; index<zip.length() ; index++){
	  if(!Character.isDigit(zip.charAt(index))){
	      throw new IllegalArgumentException("zip must contain only digits");
	  }
      }
      _zip = zip;
  }

// postcondition: computes and returns the check sum for _zip
  private static int checkSum(String zip){
      int sum=0;
      for (int index=0 ; index<zip.length() ; index++){
	  sum += Integer.parseInt(zip.substring(index,index+1));
      }
      return sum%10;
}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      String ans="";
      ans += _zip;
      ans += checkSum(_zip);
      ans += "  ";
      ans += toCode(_zip);
      return ans;
  }

// postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	String tCode = _zip + checkSum(_zip);
	int tSum=0;
	for (int index=0 ; index<tCode.length() ; index++){
	    tSum += Integer.parseInt(tCode.substring(index,index+1))
		*Math.pow(10,tCode.length()-index-1);
	}
	String oCode = other._zip + other._checkDigit;
	int oSum=0;
	for (int index=0 ; index<oCode.length() ; index++){
	    oSum += Integer.parseInt(oCode.substring(index,index+1))
		*Math.pow(10,oCode.length()-index-1);
	}
	return tSum-oSum;
    }

    public static String toCode(String zip){
	if (zip.length() != 5){
	  throw new IllegalArgumentException("zip must have a length of 5");
        }
        for (int index=0 ; index<zip.length() ; index++){
	  if(!Character.isDigit(zip.charAt(index))){
	      throw new IllegalArgumentException("zip must contain only digits");
	  }
        }
	String num = zip + checkSum(zip);
	ans += "|";
	for (int index=0 ; index<num.length() ; index++){
	  char dig = num.charAt(index); 
	  if (dig=='0'){
	      ans += "||:::";
	  }else if (dig=='1'){
	      ans += ":::||";
	  }else if (dig=='2'){
	      ans += "::|:|";
	  }else if (dig=='3'){
	      ans += "::||:";
	  }else if (dig=='4'){
	      ans += ":|::|";
	  }else if (dig=='5'){
	      ans += ":|:|:";
	  }else if (dig=='6'){
	      ans += ":||::";
	  }else if (dig=='7'){
	      ans += "|:::|";
	  }else if (dig=='8'){
	      ans += "|::|:";
	  }else if (dig=='9'){
	      ans += "|:|::";
	  }
      }
      ans += "|";
      return ans;
    }
	
    
    public static String toZip(String code){
	if (code.length != 32){
	    throw new IllegalArgumentException("code must be 32 chars long");
	    return "zip";
	}
    }
}

