package One;

public class AddofArrays {

	public static void main(String[] args) {
		int[][]a={{1,2,3},
				  {4,5,6},
				  {7,8,9}};
		int[][]b={{1,2,3},
				 {4,5,6},
				 {7,8,9}};
		int[][]t=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				t[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<t.length;i++) {
			for(int j=0;j<t.length;j++) {
				System.out.print(t[i][j]+",");
			}
			System.out.println();
		}
	}
}
