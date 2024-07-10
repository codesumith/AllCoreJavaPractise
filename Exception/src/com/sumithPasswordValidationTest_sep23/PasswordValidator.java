package com.sumithPasswordValidationTest_sep23;
public class PasswordValidator {
	
	public static boolean validatePassword(String password) throws InvalidPasswordException
	{
		boolean validate =false;
		
		int upper=0;
		int lower=0;
		int digit=0;
		int specialChar=0;
		
		for(int i=0;i<password.length();i++)
		{
			
	
			if(password.charAt(i)==32)
			{
				throw new InvalidPasswordException("Password must not contain any spaces.");
			}
			
			else if(Character.isUpperCase(password.charAt(i)))    upper++;
			
			else if(Character.isLowerCase(password.charAt(i)))    lower++;
			
			else if(Character.isDigit(password.charAt(i)))        digit++;
			
			else	specialChar++;
			
		}
		
		int totalCharacters=upper+lower+digit+specialChar;
		
		 if(totalCharacters<8&&upper==0)  throw new InvalidPasswordException("Password must be at least 8 characters long and contain at least one uppercase letter.");
		
		 
		 
		 else if(upper==0&&specialChar==0)  throw new InvalidPasswordException("Password must contain at least one uppercase letter and one special symbol.");
			
		 else if(totalCharacters<8) throw new InvalidPasswordException("Password must be at least 8 characters long.");
			
		 else if(specialChar==0)   throw new InvalidPasswordException("Password must contain at least one special symbol.");
			
		 else if(lower==0&&specialChar==0)  throw new InvalidPasswordException("Password must contain at least one lowercase letter and one special symbol.");
				
		 else if(upper==0)   throw new InvalidPasswordException("Password must contain at least one uppercase letter.");
				
		 else if(lower==0)   throw new InvalidPasswordException("Password must contain at least one lowercase letter");
		
		 else if(digit==0)   throw new InvalidPasswordException("Password must contain at least one digit");
		
		 
		 
		 else  validate=true;
		 
		 
		 
		 return validate;
		
	}

}
