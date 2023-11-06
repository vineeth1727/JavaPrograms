package One;

public class firstnonrep {

	public static void main(String[] args) {
		String str="Swiss";
		str=str.toUpperCase();
		char[]strArr=str.toCharArray();
		char eachchar;
		char nonrep=' ';
		//int k=2;
		//int count=0;
		boolean ispre=false;
		for(int i=0;i<strArr.length;i++) {
			eachchar=strArr[i];
			ispre=false;
			for(int j=i+1;j<strArr.length;j++) {
				if(eachchar==strArr[j]) {
					ispre=true;
					break;
				}//if
			}//for j
			if(ispre==false) {
				//count++;
				//if(count==k) {
				nonrep=eachchar;
				break;
			}
		}//for i
		System.out.println(nonrep);

	}
}

