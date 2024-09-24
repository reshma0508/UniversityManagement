package com.codegnan.exceptions;


class TooYoungException extends Exception{
	public TooYoungException(String message) {
		super(message);
	}
}
class TooOldException extends Exception{
	public TooOldException(String message) {
		super(message);
	}
}

public class CustomizedException {
public void checkEligibilty(int age)throws TooYoungException,TooOldException{
	if(age<18) {
		throw new TooYoungException("Marriage Cannot Approves : age is below 18 years");
	}else if(age>60) {
		throw new TooOldException("Your Age is already crossed the marriage age...Marriage cannot Approved ");

	}else {
		System.out.println("Marriage Approved! details will be processed soon...");
	}
}
	public static void main(String[] args) {
		CustomizedException checker= new CustomizedException();
		try {
			checker.checkEligibilty(20);
			//checker.checkEligibilty(65);

			//
			checker.checkEligibilty(16);

			
		}catch(TooYoungException e) {
			e.printStackTrace();
		}catch(TooOldException e) {
			e.printStackTrace();
		}

	}

}
