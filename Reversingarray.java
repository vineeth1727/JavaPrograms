package One;

public class Reversingarray {

	public static void main(String[] args) {
		int[]arr= {19,26,3,11,20,8,1,15,6,17};
		int len=arr.length;
		for(int i=0;i<len;i++) {
			int temp=arr[i];
			arr[i]=arr[len-1-i];
			temp=arr[i];
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
