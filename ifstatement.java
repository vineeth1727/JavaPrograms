package One;

public class ifstatement {

	public static void main(String[] args) {
		String action="Cricket match between ind vs pak started";
		boolean raining= true;
		
		if(raining) {
			action="Match abonded due to rain";
		}
		System.out.println(action);
	}

}
