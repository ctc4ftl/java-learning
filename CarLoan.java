public class CarLoan {
	
	public static void main(String[] args) {
		
		//Declare initial variables.
		int carLoan = 10000;
		int loanLength = 3;
		int interestRate = 5;
		int downPayment = 2000;
		
		//Qualify the input.
		if (loanLength <= 0 || downPayment <= 0) {
			System.out.println("Error! You must take out a valid loan.");
		} else if (downPayment >= carLoan) {
			System.out.println("The car can be paid for in full.");
			
		//Declare calculation variables and perform calculation(s).
		} else {
		int remainingBalance = (carLoan - downPayment);
		int months = (loanLength * 12);
		int monthlyBalance = (remainingBalance / months);
		int interest = ((monthlyBalance * interestRate) / 100);
		int monthlyPayment = (monthlyBalance + interest);
		
		//Print results.
		System.out.println(monthlyPayment);
		
		}
		
	}
	
}