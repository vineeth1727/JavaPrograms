package One;

public class Duplicatenum {

	public static void main(String[] args) {
		int[] num= {10,10,20,30,70,20,20,20,20,50,10,76,10};
		int len =num.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(num[i]==num[j]) {
					for(int k=j;k<len-1;k++) {
						num[k]=num[k+1];
						}
					len= len -1;
					j--;
					}
				}
			}
		
	
	for(int i=0;i<len;i++) {
		System.out.print(num[i]+" ");
	}
	}

}