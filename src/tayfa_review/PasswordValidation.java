package tayfa_review;
/*
6. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise
returns false 
*/
public class PasswordValidation {

	public static void main(String[] args) {
		
		String password = "123abc#$%A";
		System.out.println(isValid2(password));
	}
	
	// String manipulation
	public static boolean isValid(String password) {
		
		if(password.length() < 6 || password.contains(" ")) {
			
			return false;
		}else {
			
			int upperCaseCount = 0;
			int lowerCaseCount = 0;
			int specialCharacterCount = 0;
			int digitCount = 0;
			
			for(int i=0; i < password.length(); i++) {
				
				if(password.charAt(i) >= 65 && password.charAt(i) <= 90)
					upperCaseCount++;
				if(password.charAt(i) >= 97 && password.charAt(i) <= 122)
					lowerCaseCount++;
				if(password.charAt(i) >= 33 && password.charAt(i) <= 47 
						|| password.charAt(i) >= 58 && password.charAt(i) <= 64
						|| password.charAt(i) >= 91 && password.charAt(i) <= 96
						|| password.charAt(i) >= 123 && password.charAt(i) <= 126)
						specialCharacterCount++;
				if(password.charAt(i) >= 48 && password.charAt(i) <= 57)
					digitCount++;
			}
			
			return upperCaseCount > 0 && lowerCaseCount > 0 &&
					specialCharacterCount > 0 && digitCount > 0; 
			
		}
		
	}
	
	// Regex, matches methods
	public static boolean isValid2(String password) {
		
		String upperCase = "(.*[A-Z].*)";
		String lowerCase = "(.*[a-z].*)";
		String number = "(.*[0-9].*)";
		String specialCharacters = "(.*[ -/, :-@].*)";
		
		boolean hasUpper = password.matches(upperCase),
				hasLower = password.matches(lowerCase),
				hasNumber = password.matches(number),
				hasSpecialCharacter = password.matches(specialCharacters),
				isValid = false;
		
		if(password.length() >= 6 && !password.contains(" "))
			if(hasUpper && hasLower && hasNumber && hasSpecialCharacter)
				isValid = true;
		
		return isValid;
	}

}
