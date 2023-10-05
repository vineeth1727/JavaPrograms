package One;

public class Stringoccurrence {

	public static void main(String[] args) {
		String str="Welcome to java world Good morning hyderabad";
		
		        char L1 = 'e';
		        char L2 = 'o';
		        
		        int a1=0;
		        int a2=0;
		        
		        for (int i = 0; i < str.length(); i++) {
		            char c = str.charAt(i);
		            if (c == L1) {
		                a1++;
		            }
		            if (c == L2) {
		                a2++;
		            }
		        }
		        
		        System.out.println(L1 + "-" + a1);
		        System.out.println(L2 + "-" + a2);
		    }
		

       
	}


