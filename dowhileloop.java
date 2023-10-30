package One;

public class dowhileloop {

	public static void main(String[] args) {
		 int num=19;
		 int power=32;
		 int v=1;
		 int product=1;
		 
		 
		 do{
			product=num*product;
			v++;
		 }while(v<=power);
			 System.out.println(product);
	}

}
