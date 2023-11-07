package One;

public class additionofarray {

	public static void main(String[] args) {
		int[] n= {10,20,-30,4,5,6};
		
		// res ->15
		System.out.println(addarr(n,n.length-1));
		}

	private static int addarr(int[] n, int size) {
		if(size==0) return n[0];
		else return n[size]+addarr(n,size-1);
	}

	}


