package One;

public class palindromecomchar {

	public static void main(String[] args) {
		String str = "932123454321239";
		boolean isPoly = true;
		for(int l=0,r=str.length()-1;l<str.length()/2;l++,r--) {
			if(str.charAt(l) != str.charAt(r)) {
				isPoly = false;
				break;
			}
		}
		if(isPoly == true) System.out.println("Palindrome");
		else System.out.println("not palindrome");

	}

}
