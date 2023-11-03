package One;

public class lastrepno {

	public static void main(String[] args) {
		String str="10339093414";
		char[]strArr=str.toCharArray();
		char eachchar;
		int count=0;
		char lastrepno=' ';
		for(int i=0;i<strArr.length;i++) {
			eachchar=strArr[i];
			count=0;
		
			for(int j=0;j<strArr.length;j++) {
				if(eachchar==strArr[j]) {
					count++;
 				}
			}
			if(count>1) {
				lastrepno=eachchar;
			}
		}
		System.out.println("last rep no:"+lastrepno);
		}
}

				
