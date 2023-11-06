package One;

public class djava {
	static  int v=1;
	static long fact(int n){
		v++;
		
		if(v == n ) return n;
		else  return v * fact(n);
		
	}
	
	public static void main(String[] args) {
		
		int n =5;
		System.out.println("res----->"+fact(n));
		
	}

}