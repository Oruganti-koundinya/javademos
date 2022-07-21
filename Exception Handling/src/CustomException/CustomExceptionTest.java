package CustomException;

public class CustomExceptionTest {

	public static void main(String[] args) {
		CustomExceptionTest obj = new CustomExceptionTest();
		try {
			int withDrawAmount = 5000;
			System.out.println("Withdrawing: " + withDrawAmount);
			obj.withdrawFromATM(withDrawAmount, 4538);
			System.out.println("Amount Withdrawn");
		} catch (InsufficientFundException In) {
			System.out.println("Exception Occurred! : " + In.getMessage()); //getMessage() is a in Built method
		}
	}
	
	void withdrawFromATM(int withDrawAmount, int accountNumber) {
		int balance = getBalanceFromAccount(accountNumber);
		if (withDrawAmount > balance) {
			throw new InsufficientFundException("No more additional Funds in Account");
		}
	}
	
	int getBalanceFromAccount(int accountNumber) {
		return 1000;

	}

}
