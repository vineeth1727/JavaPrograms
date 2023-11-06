package One;

public class Maxnum {

	public static void main(String[] args) {
		int[][] v= {{1,4,8,9},{3,27,0,2},{4,3,19,8}};
		int max=v[0][0];
		for (int i=0;i<v.length;i++) {
			for(int j=0;j<v.length;j++) {
				if(max<v[i][j]) {
					max=v[i][j];
				}//if
				
			}//j
		}//i
		System.out.println(max);

	}

}
