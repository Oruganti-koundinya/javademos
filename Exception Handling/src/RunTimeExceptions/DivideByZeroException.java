package RunTimeExceptions;

import java.util.*;

public class DivideByZeroException {

	public static void main(String[] args) {
		
		int a, b, c, d;
		try 
		{
			System.out.println("Enter number to be operated:");
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			c = a/b;
			d = a%b;
			System.out.println(a + "/" + b + "=" + c +"Reminder =" + d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division By Zero Error is occured");
		}
		System.out.println("Other Programming Logic Continues...");

	}

}
