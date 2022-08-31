package Practice_projects;

public class TypeCasting {

	public static void main(String[] args) {
		
		char c = 'K';
		System.out.println("Value of c :" +c);
		
		//Implicit casting
		// In Implicit conversion we are converting smaller data type into larger one
		//So, we can convert without casting data type in value space.
		int i = c;
		System.out.println("Value of char in Integer :" +i);
		
		long l = c;
		System.out.println("Value of char in long :" +l);
		
		double d = c;
		System.out.println("Value of char in double :" +d);
		
		//Explicit Type casting
		//In Explicit type casting we are converting a larger data type into smaller ones
		//So, there will be a data loss as we can observe in case 4.
		float f =(float) c;  //1
		System.out.println("Value of char in float :" +f);
		
		byte b = (byte) c;  //2
		System.out.println("Value of char in bytes :" +b);
		
		short s = (short) c;  //3
		System.out.println("Value of char in short :" +s);
		
		double df = 97.678;
		int a = (int) df;  //4
		System.out.println("Value of double in int is :" +a);
		


	}

}
