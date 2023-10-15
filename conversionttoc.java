package One;
import java.util.Scanner;

public class conversionttoc {

	public static void main(String[] args) {
		
		
		        try (Scanner sc = new Scanner(System.in)) {
					System.out.print("Enter temperature in Fahrenheit: ");
					double fahrenheit1 = sc.nextDouble();

					
					double celsius = (fahrenheit1 - 32) * 5 / 9;

					System.out.println("Temperature in Celsius: " + celsius);
				}
		    }
		


	}


