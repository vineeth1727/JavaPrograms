package One;
import java.util.Scanner;
public class Marksgrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		 char result=((marks>90)&&(marks<=100))?'A':'B';{
			 result=((marks>=60)&&(marks<=74))?'C':'F';
		 }
		 System.out.println("Grade "+result);
	}

}
