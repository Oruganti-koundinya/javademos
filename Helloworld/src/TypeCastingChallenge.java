
public class TypeCastingChallenge {

	public static void main(String[] args) {
		String input = "69";
		
		int i = Integer.parseInt(input);
		int I = Integer.valueOf(input);
		float f = Float.parseFloat(input);
		byte b = Byte.parseByte(input);
		char c = (char)Integer.parseInt(input);
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(f);
		System.out.println(b);
		System.out.println(c);
		
		

	}

}
