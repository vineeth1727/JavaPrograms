package One;

public class switchstatement {

	public static void main(String[] args) {
		String option="v";
		 switch(option) {
		 case "i":
			 System.out.println("!!!");
		 case "k":
			 System.out.println("@@@");
		 case "m":
			 System.out.println("###");
		 case "o":
			 System.out.println("$$$");
		 case "v":
			 System.out.println("The default is not going to print because of break statement");
			 break;
		 default :
			 System.out.println("Error");
		 }

	}

}
