package One;

public class covertingtobinaryandreplacing {

	public static void main(String[] args) {
		int n=23,p=1,r,bn=0,res=0,p2=1;
		while(n!=0) {
			r=n%2;
			n=n/2;
			if(r==0)r=1;
			else if(r==1)r=0;
			res=res+r*p2;
			bn=bn+r*p;
			p=p*10;
			p2=p2*2;
		}
		System.out.println(bn);
		System.out.println(res);
	}

}
