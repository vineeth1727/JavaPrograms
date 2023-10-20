package One;

public class Areandperimeterofrectangle {

	public static void main(String[] args) {
		int l=3;
		int b=6;
		int A=l*b;
		int P=2*(l+b);
		
		if(A<P) {
			System.out.println("Area is less than perimeter of this rectangle");
		}
		if(A>P) {
			System.out.println("Area is greater than perimeter of this rectangle");
		}	else
			System.out.println("Area is equal to perimeter of this rectangle");
  }
}
