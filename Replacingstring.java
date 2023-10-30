package One;

public class Replacingstring {

	public static void main(String[] args) {
		String data = "welcome to india."
				+ " India is very Beautiful culture  country."
				+ "I am Living In hyderabad";
		data = data.replace(".", ":");
		
		String[] lines = data.split(":");
		String[] words;
		char firstChar;
		String newLine="  ";
		for(int i=0;i<lines.length;i++) {
			lines[i] = lines[i].trim();
			words = lines[i].split(""); 
			newLine=" ";
			
			for(int j=0;j<words.length;j++) {
				if( (j==0) && (words[j].length() > 0) ) {
					firstChar=words[j].charAt(0);
					firstChar = toUpperChar(firstChar);
					words[j] = firstChar + words[j].substring(1);
				}
				else if( words[j].length() > 0 ){
					firstChar=words[j].charAt(0);
					firstChar = toLowerChar(firstChar);
					words[j] = firstChar + words[j].substring(1);
					
				}
				newLine = newLine+""+words[j];
			}
			System.out.println(newLine);
			
			
		}
			
	}
	
	public static char toUpperChar(char ch) {
		char res=' ';
		if( (ch>=97) &&(ch<=122)){
			res = (char)(ch -32);
			
		}
		else if( (ch>=65) &&(ch<=90)){
			res = ch;
		} 
		return res;
	
	}
	
	
	public static char toLowerChar(char ch) {
		char res=' ';
		
		if( (ch>=97) &&(ch<=122)){
			res = ch;
			
		}
		else if( (ch>=65) &&(ch<=90)){
			res = (char)(ch + 32);
		} 
		return res;
		
	}
	
	}


