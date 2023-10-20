package One;

public class Examinationprogram {

	public static void main(String[] args) {
		int A=57;
		int B=40;
		
		if(A>=55 && B>=45) {
			System.out.println("Student has passed in the examination");
			
		}if((A>=45 && A<55) && B>=55) {
			System.out.println("Student has passed in the examination(with B percentage)");
			
		}if(A>=65 && B<45) {
			System.out.println("Student should re-appear the examination in B");
			
		}else
			System.out.println("Student has failed in the examination");
		}
	}


