package One;
import java.util.Scanner;

public class Salarypro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		double salary = sc.nextDouble();
		System.out.println("Enter Savings");
		double savings = sc.nextDouble();
		double taxableincome;
		double taxpayable;
		double salaryinhand;
		double annualincome=salary*12;
		double taxpermonth;
		if(savings<=100000) {
		    taxableincome = (annualincome)-savings;
		}else {
		    taxableincome=((annualincome)-(100000))+(savings-(100000));
			
		}
		if(taxableincome<=250000) {
			taxpayable=0;
		}else if(taxableincome<=500000) {
			taxpayable=taxableincome*5/100;
		}else if(taxableincome<=1000000) {
			taxpayable=taxableincome*20/100;
		}else {
			taxpayable=taxableincome*30/100;
		}
		taxpermonth=taxpayable/12;
		salaryinhand=salary-taxpermonth;
		
		System.out.println(annualincome);
		System.out.println(taxableincome);
		System.out.println(taxpayable);
		System.out.println(salaryinhand);
	}

}
