package One;

public class Wordchange {

	public static void main(String[] args) {
		
			String data = "welcome to india."
					+ " India is very Beautiful culture  country."
					+ "I am Living In Hyderabad";
			data = data.replace('.', ':');
			String[] lines = data.split(":");
			String[] words;
			char firstChar;
			String updatedData = "";
			for(int i=0;i<lines.length;i++) {
				lines[i] = lines[i].trim();
				words = lines[i].split(" ");
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
					if(( words[j].length() > 0 ) &&(words[j].equalsIgnoreCase("country")) ) {
						words[j] = "city";
						
					}
					if(( words[j].length() > 0 ) &&(words[j].equalsIgnoreCase("india")) ) {
						words[j] = "Hyderabad";
						
					}
					updatedData = updatedData+" "+words[j];
				}
				updatedData = updatedData +".";
				
				
				
			}
			
			System.out.println(data.replace(':', '.'));
			
			
			System.out.println(updatedData);
			
			
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
