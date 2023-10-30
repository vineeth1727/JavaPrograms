package One;

public class Stringnewoccurrence {

	public static void main(String[] args) {
		
		 String str="hi this is vineeth welcome to my world";
		  int count1=0;
		  
		  for(int i=0;i<str.length();i++)
		  {
		  if(str.charAt(i)=='t') {
		  count1=count1+1;
		  System.out.println(count1+" "+str.charAt(i));
		  }
		  }
		  }
	}

