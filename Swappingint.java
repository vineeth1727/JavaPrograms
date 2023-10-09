package One;
import java.util.Scanner;
public class Swappingint {

			public static void main(String[] args) {
						
						try (Scanner sc = new Scanner(System.in)) {
							System.out.println("enter a,b");
							
							int a = sc.nextInt();
							int b = sc.nextInt();
							int t;
							
							System.out.println("Before Swapping....");
							System.out.println("a--->"+a);
							System.out.println("b--->"+b);
							
							t=a;
							a=b;
							b=t;
							
							System.out.println("After Swapping....");
							System.out.println("a--->"+a);
							System.out.println("b--->"+b);
						}
							
					
			}

	}


