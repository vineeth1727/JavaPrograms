package One;
import java.util.Scanner;

public class Heathyweight {

	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		double weight,height,Conversion,Devineformula,
		Actualweight,Actualheight,Targetweight=0,Lw,Gw;
		double oneinch=0.0254;
		double onemeter=39.37;
		double onefeet=12;
		String Status,gender;
		boolean isGender;
		System.out.println("Enter Gender");
		gender=sc.nextLine();
		System.out.println("Enter Weight");
		weight=sc.nextDouble();
		System.out.println("Enter Height");
		height=sc.nextDouble();
		
		double BMI=weight/((height*oneinch)*(height*oneinch));
		
		System.out.println("Current Weight="+weight+"kgs");
		System.out.println("BMI="+BMI);
		
		if(BMI<18.5) {
			System.out.println("Status=Underweight");
		}
			else if(BMI<24.9) {
				System.out.println("Status=Normal");
			}
				else if(BMI<29.9) {
					System.out.println("Status=Overweight");
				}
					else {
						System.out.println("Status=Obese");
					}
		
		if(gender.equalsIgnoreCase("male")) {
				if(height>60) {
					Actualheight=height-60;
					Devineformula=Actualheight*2.3;
					Targetweight=50+Devineformula;
					System.out.println("Target Weight ="+Targetweight);
				}else {
					Actualheight=height;
					Conversion=height/onefeet;
					Targetweight=Conversion*10;
					System.out.println("Target Weight ="+Targetweight);
				}
		}else if(gender.equalsIgnoreCase("female")) {
			if(height>60) {
				Actualheight=height-60;
				Devineformula=Actualheight*2.3;
				Targetweight=45.5+Devineformula;
				System.out.println("Target Weight ="+Targetweight);
			}else {
				Actualheight=height;
				Conversion=height/onefeet;
				Targetweight=Conversion*9.1;
				System.out.println("Target Weight ="+Targetweight);
			}
			
		}
			
			if(weight>Targetweight) {
				Lw=weight-Targetweight;
				System.out.println("As per your BMI you should decrease your weight upto "+Lw+" kgs");
			}else {
				Gw=Targetweight-weight;
			System.out.println("As per your BMI you should increase your weight upto "+Gw+" kgs");
			}
			
			
			
		
	}
	
}


