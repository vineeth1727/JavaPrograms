package One;

interface PrimeNumber{
	  
	  void isPrime(int num);
	  
}

public class primefunctional {

	public static void main(String[] args) {
		
		PrimeNumber pn= (num)->{
			int count=0;
			  for(int i=1;i<=num;i++) {
				  if(num%i==0) {
					  count++;
				  }
			  }
			  if(count==2) {
				  System.out.println("true");
			  }else {
				  System.out.println("false");
		}	
	};
	pn.isPrime(21);

}
}
