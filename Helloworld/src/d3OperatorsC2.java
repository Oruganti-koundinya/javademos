
public class d3OperatorsC2 {

	public static void main(String[] args) {
		int result = 3 + 6;
		System.out.println("Value of 3 + 6 =" + result);
		
		result = result - 2;
		System.out.println("Value of result = " + result);
		
		result = result * 3;
		System.out.println("Value of result = " + result);
		
		result = result / 6;
		System.out.println("Value of result = " + result);
		
		result = result % 2;
		System.out.println("Value of result = " + result);
		
		result++;
		++result;
		
		result += 2;
		System.out.println("Value =" + result);
		
		result -= 3;
		System.out.println("Value =" + result);
		
		result *= 5;
		System.out.println("Value =" + result);
		
		//Prefix and Postfix
		int i= 3;
		int a= ++i; //Prefix precedence where first value of i is incremented and assigned to a
		int b= i++; //Postfix precedence where first value of i is assigned to b and increments value of i
		System.out.println("Value of i=" + i);
		System.out.println("Value of a=" + a);
		System.out.println("Value of b=" + b);
		

	}

}
