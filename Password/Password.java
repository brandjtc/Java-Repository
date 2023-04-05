
public class Password {
	private String pwd;
	Password (String p){
		this.pwd=p;
	}
	public boolean validatePassword() {
		
		/*
		 * A password is valid if it contains 16 characters. 
		 * It has one uppercase character, one lower case character, one digit, one specical character,
		 * all conditions are met it's true. else false.
		 */	        int counter = 0;
	        for (int i = 0; i < pwd.length(); i++) {
	            if (!Character.isDigit(pwd.charAt(i)) && !Character.isLetter(pwd.charAt(i)) && !Character.isWhitespace(pwd.charAt(i))) {
	                counter+=1;
	            }
	            if(Character.isDigit(pwd.charAt(i))) {
	            	counter+=1;
	            }
	            if(Character.isUpperCase(pwd.charAt(i))) {
	            	counter+=1;
	            }
	            if(Character.isLowerCase(pwd.charAt(i))) {
	            	counter+=1;
	            }
	        }
	        if(counter==4)
	            return true;
	        else
	        	return false;
	        
	
	}
}