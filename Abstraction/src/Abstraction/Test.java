package Abstraction;

public class Test {

	public static void main(String[] args) {
		
		BMW3series three = new BMW3series();
		three.Accelerate();
		three.CommonFunctionality();
		
		BMW5series five = new BMW5series();
		five.Accelerate();
		five.CommonFunctionality();

	}

}
