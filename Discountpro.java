package One;

public class Discountpro {

	public static void main(String[] args) {
		
		final int GST=18;
		final int Shoesdiscount=12;
		final int Grocerydiscount=8;
		final int Provisionsdiscount=10;
		final int Carddiscount=5;
		
		double shoesprice = 2340;
		double groceriesprice = 1378;
		double provisionsprice = 1100;
		
		boolean isMember=true;
		
		shoesprice +=   (GST * shoesprice)/100 - (Shoesdiscount * shoesprice)/100;
		 
		if(isMember) {

			groceriesprice -= (Grocerydiscount * groceriesprice)/100;
			provisionsprice -= (Provisionsdiscount * provisionsprice)/100;
			
		}
		
		double totalprice = shoesprice + groceriesprice + provisionsprice;
		
		boolean isCard=true;
		if(isCard) {
			 totalprice -= (Carddiscount * totalprice)/100;
		}
		totalprice= Math.round(totalprice);
		
		System.out.println("Total Price:"+ totalprice);
		

	}

}
