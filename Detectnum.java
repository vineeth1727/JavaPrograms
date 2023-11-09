//Given an array where every element occurs three times, except one element which occurs only once.
 //Find the element that occurs once.

//Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3} Output: 2

package One;

public class Detectnum {

	public static void main(String[] args) {
		int[]arr={12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
		int count=0;
		int res = 0;
		int len=arr.length;
		for( int i=0;i<len;i++) {
			count=0;
			for(int j=0;j<len;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==3) {
				continue;
			}else if(count==1) {
				res=arr[i];
			}
		}
		System.out.println(res);
	}
}
