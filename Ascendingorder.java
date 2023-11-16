package One;

public class Ascendingorder {

	public static void main(String[] args) {
		int[]arr= {22,4,19,17,1,29,5,2};
		int len=arr.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+",");
		}
	}

}
