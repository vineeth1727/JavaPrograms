package One;

public class djava {

	static long fact(int n){
		
		if(n == 1 ) return 1;
		else {
			if(n%2==0)return fact(n-1);
			return n+fact(n-1);
		}
			
		
	}
	
	public static void main(String[] args) {
	
		
		int n =10;
		System.out.println("res----->"+fact(n));
		
	}

}