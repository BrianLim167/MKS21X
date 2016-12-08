public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;

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
      _checkDigit = checkSum();
  }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){
      Barcode copy = new Barcode(_zip);
      copy._checkDigit = _checkDigit;
      return copy;
  }


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int sum=0;
      for (int index=0 ; index<_zip.length() ; index++){
	  sum += Integer.parseInt(_zip.substring(index,index+1));
      }
      return sum%10;
}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      String ans="";
      String code = _zip + _checkDigit;
      ans += code;
      ans += "  |";
      for (int index=0 ; index<code.length() ; index++){
	  char dig = code.charAt(index); 
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


// postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){
	String tCode = _zip + _checkDigit;
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
    
}

