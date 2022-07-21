package RunTimeExceptions;

public class StringparserException {

	public static void main(String[] args) {
		try
		{
			String str = "Hello";
			int i = Integer.parseInt(str);
			System.out.println("Int type of str is :" + i);
		}
		catch (RuntimeException e)
		{
			System.out.println("Exception Occured !");
		}
		System.out.println("Continue with you logic...");
	}

}
