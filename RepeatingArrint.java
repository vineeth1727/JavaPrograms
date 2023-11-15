package One;

public class RepeatingArrint {

	public static void main(String[] args) {
		int[]arr= {2,3,5,3,1,20,8,3,21,4};
		int len=arr.length;
		int max=0;
		int maxrep=0;
		
		for(int i=0;i<len;i++) {
			int count=0;
			for(int j=1;j<len;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}//if
			}//j
			if(count>max) {
				 max=count;
				 maxrep=arr[i];
			}//if
		}//i
		System.out.println(maxrep+" "+max);
	}

}
