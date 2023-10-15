package One;
import java.util.Scanner;

public class daysyearsmonths {

	public static void main(String[] args) {
		

		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter the number of days: ");
		        int totalDays = sc.nextInt();

		      
		        int years = totalDays / 365;
		     
		        int remainingDays = totalDays % 365;
		        
		        int months = remainingDays / 30;
		        
		        remainingDays = remainingDays % 30;

		      
		        System.out.println("Years: " + years);
		        System.out.println("Months: " + months);
		        System.out.println("Days: " + remainingDays);

		        sc.close();
		    }
		}


	


