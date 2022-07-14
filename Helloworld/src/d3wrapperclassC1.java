
public class d3wrapperclassC1 {

	public static void main(String[] args) {

		int x = 2;
		// Auto-Boxing int to Integer
		Integer y = 1;
		Integer z = new Integer(5);

		// Auto-Boxing from Integer to int
		int newint = z;// Converting Automatically-Auto Boxing
		newint = z.intValue();// Converting explicitly from primitive to wrapper class

		short s = 3276;
		Short newshort = s;

	}

}
