package RunTimeExceptions;

public class NullpointerException {

	public static void main(String[] args) {
		
		try
		{
			String str = null;
			System.out.println("str = " +str);
			System.out.println("Length of str = " + str.length());
		}
		catch(RuntimeException e)
		{
			System.out.println("Exception Occured !");
		}
		System.out.println("COntinue with more logic...");
	}

}
