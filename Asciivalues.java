package One;

public class Asciivalues {

	public static void main(String[] args) {
		String str = "ascii VALUES IN jAVA";
		char ch;
		String res="";
		for(int i=0;i<str.length();i++) {
			
		
		 ch = str.charAt(i);
		

		if(ch >=65 && ch <=90) {
			res=res+(char)(ch+32);
			
		}
		else if(ch >=97 && ch <=122) {
			res=res+(char)(ch-32);
		}
		else {
			res=res+ch;
		}
		}
          System.out.println(" "+res);
	}

}
