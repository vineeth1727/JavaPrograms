package One;

public class multipleifstatement {

	public static void main(String[] args) {
		int years=4;
		int leaves=43;
		int incentive=0;
		
		if(years>=5 && (leaves>=0 && leaves<=30)) {
			incentive=50000;
		}
		if(leaves<=60) {
			incentive=20000;
		}
		if(years<5) {
			incentive=0;
		}
		System.out.println(incentive);
		}

}
