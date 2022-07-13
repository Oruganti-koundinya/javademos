
public class charstr {

	public static void main(String[] args) {
		// String literal
		String name= "Oruganti Koundinya";
		System.out.println("Name :"+ name);
		System.out.println("Length Of String is" + name.length());
		
		String S1= new String("how are you feeling Today?");
		System.out.println( name + "," + S1 );
		
		char[] c = {'H','e','l','l','o'};
		String S2= new String(c);
		System.out.println(S2 + "," + name + "," + S1);
		
		//byte b[]=("92","95","97");
		//String S3= new String(b);
		//System.out.println(S3);
		
		System.out.println("Index or position of k=" + name.indexOf('K'));
		System.out.println("Index or position of space is:" + name.indexOf(" "));
		System.out.println("Character at position 11 is :" + name.charAt(11));
		System.out.println("Position of Second a is :" + name.indexOf('a', 5));
		System.out.println("Substring of name is:" + name.substring(8));
		System.out.println("Substring from name is :" + name.substring(0, 8));
		String[] S4= name.split(" ");
		System.out.println(S4[0]);
		System.out.println(S4[1]);
		System.out.println("Name in uppercase is:" + name.toUpperCase());
		System.out.println("Name in Loweracse is:" + name.toLowerCase());
		//System.out.println("Replace Z with Y is :" + name.replace('z', 'y'));
		
		
	
		

	}

}
