package practice;

public class PasswordValidation {
	
	/**
	Write a return method that can verify if a password is valid or not. 
	Requirements:
	1. Password MUST be at least have 6 characters and should not contain space 
	2. PassWord should at least contain one upper case letter
	3. PassWord should at least contain one lower case letter
	4. Password should at least contain one special characters
	5. Password should at least contain a digit
	If all requirements above are met, the method returns true, 
	otherwise returns false
	*/
	public static void main(String[] args) {
		String password = "123abc#$%A";
		System.out.println(isPasswordValid(password));
		System.out.println(isPasswordValid2(password));
	}
	
	// String manipulations
	public static boolean isPasswordValid(String password) {
		
		if(password.length() < 6 || password.contains(" "))
			return false;
		
		else {
		
			int upperCaseCount = 0;
			int lowerCaseCount = 0;
			int specialCharactersCount = 0;
			int digitCount = 0;
			
			for(int i=0; i < password.length(); i++) {
				
				if(password.charAt(i) >= 65 && password.charAt(i) <= 90 )
					upperCaseCount++;
				
				if(password.charAt(i) >= 97 && password.charAt(i) <= 122 )
					lowerCaseCount++;
				
				if( password.charAt(i) >= 33 && password.charAt(i) <= 47
					|| password.charAt(i) >= 58 && password.charAt(i) <= 64
					|| password.charAt(i) >= 91 && password.charAt(i) <= 96
					|| password.charAt(i) >= 123 && password.charAt(i) <= 126)
					specialCharactersCount++;
				
				if(password.charAt(i) >= 48 && password.charAt(i) <= 57)
					digitCount++;
			}
			
			return upperCaseCount > 0 && lowerCaseCount > 0
				   && specialCharactersCount > 0 && digitCount > 0;
		}
	}
	
	// Using matches method
	// Muhtar's way
	public static boolean isPasswordValid2(String password) {
		
		String lowerCase = "(.*[a-z].*)";
		String upperCase = "(.*[A-Z].*)";
		String digits = "(.*[0-9].*)";
		String specialCharacters = "(.*[ -/, :-@].*)";
		
		boolean hasLowerCase = password.matches(lowerCase),
				hasUpperCase = password.matches(upperCase),
				hasDigits = password.matches(digits),
				hasSpecialCharacters = password.matches(specialCharacters),
				valid = false;
		
		if(password.length() >= 6 && !password.contains(" "))
			if(hasLowerCase && hasUpperCase && hasDigits 
				&& hasSpecialCharacters)
				valid = true;
				
		return valid;
	}
}
