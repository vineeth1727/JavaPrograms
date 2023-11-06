package One;

public class ArrayExamples {

	public static void main(String[] args) {
		int sum = 0;
		int count=0;
		int[] data= {1,5,7,-1};int k=6;
		String[] ePair = new String[data.length];
		int eIndex=0;
		String[] gPair = new String[data.length];
		int gIndex = 0;
		for(int i=0;i<data.length;i++) {// 1
			for(int j=i+1;j<data.length;j++) {
				 sum=data[i]+data[j];
				 if(k==sum) {
					  count++;
						 String	res="("+data[i]+","+data[j]+")";
						 ePair[eIndex++] = res;
							//System.out.println("Number of pairs"+count+"The combinations are"+res);
					 
				 }// if
				 else  if(k> sum) {
					   String	res=data[i]+","+data[j];
						 gPair[gIndex++] = res;
							//System.out.println("Number of pairs"+count+"The combinations are"+res);
					 
				 }// if
			}// j
	}// i
		for(int i=0;i<eIndex;i++){
			System.out.print(ePair[i]+" ");	
		}
		System.out.println("total = pairs===>"+count);
		for(int i=0;i<gIndex;i++){
			System.out.print(gPair[i]+" ");	
		}
		
}
}
