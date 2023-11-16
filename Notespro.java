package One;
//import java.util.Scanner;

public class Notespro {

	public static void main(String[] args) {
		int note=158388;
		int n5 = 0,n2 = 0,n1 = 0,n500=0,n100=0,n50=0,n20=0,n10=0;
		if(note>=500) {
			n500=note/500;
			note=note%500;
		}
		if(note>=100) {
			n100=note/100;
			note=note%100;
		}
		if(note>=50) {
			n50=note/50;
			note=note%50;
		}
		if(note>=20) {
			n20=note/20;
			note=note%20;
		}
		if(note>=10) {
			n10=note/10;
			note=note%10;
		}
		if(note>=5) {
			n5=note/5;
			note=note%5;
		}
		if(note>=2) {
			n2=note/2;
			note=note%2;
		}
		if(note>=1) {
			
			n1=1;
		}
		System.out.println(n500);
		System.out.println(n100);
		System.out.println(n50);
		System.out.println(n20);
		System.out.println(n10);
		System.out.println(n5);
		System.out.println(n2);
		System.out.println(n1);
		
	}
}
