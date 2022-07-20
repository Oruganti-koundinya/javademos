package Capsule;

public class Test {

	public static void main(String[] args) {
		
		//No encapsulation
		Student student = new Student();
		student.id = 168126;
		student.Name = "Lucky";
		student.Age = 21;
		student.CourseName = "JAVA FDS";
		student.DisplayDetails();
		
		
		//Write only
		BankAccount Bank = new BankAccount (100000);
		Bank.setAccountNumber(11804308);
		Bank.setAccountName("OK ENTERPRISES");
		Bank.DepositAmount(5000);
		Bank.WithdrawAmount(2000);
		Bank.DisplayDetails();
		
		//readonly
		Product product = new Product (135, "Iphone 13Pro", 74999);
		product.getId();
		product.getName();
		product.getCost();
		product.DisplayDetais();
	}

}
