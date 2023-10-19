// If the employee has worked for 5 or more years, incentive == 50k if leaves 0-30
// 60>= leaves >=31: incentive==20k
// if no of years<5, 0 bonus/incentive

package One;

public class Nestedifstatement {

	public static void main(String[] args) {
		int years = 7;
		int leaves = 70;
		int incentive;

		if (years >= 5) {

			if (leaves >= 0 && leaves <= 30) {
				incentive = 50000;
			}

			else if (leaves <= 60) {
				incentive = 20000;
			}

			else {
				incentive = 0;
			}
		} else {
			incentive = 0;
		}
		System.out.println("Incentive amount:" + incentive);
	}

}
