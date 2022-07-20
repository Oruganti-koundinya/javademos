package Interfaces;

public class RuntimeTest {

	public static void main(String[] args) {
		
		//Upcasting - Implicit
		AppleLaptop al = new MacbookAir();
		al.start();
		al.shutdown();
		
		//Downcasting - Explicit
		Macbook macb = new MacbookAir();
		MacbookAir Air =  (MacbookAir) macb;
		
		Macbook pro =  new MacbookPro();
		MacbookPro obj = (MacbookPro) pro;
		obj.prosmethod();
	}
}
