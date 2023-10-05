package One;

public class palindromenum {

	public static void main(String[] args) {
		String str="31212121213";
		String revstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
       if(str.contentEquals(revstr)) 
       {
    	   System.out.println("palindrome");
       }
       else {
    	   System.out.println("not palindrome");
    	   
       }
	}

}
