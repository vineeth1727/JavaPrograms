package One;
import java.util.Scanner;
public class MaxMinvalues {

	public static void main(String[] args) {
		int max=0,min=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a,b,c ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			if(a > b) {
				max=a;
				min=b;
			}
			else {
				max=b;
				min=a;
			}
			
			if(c > max) {
				max=c;
			}
			if(c < min) {
				min=c;
			}
		}
		System.out.println("max---->"+max);
		System.out.println("min---->"+min);
		
		
		
		
	}



	}


