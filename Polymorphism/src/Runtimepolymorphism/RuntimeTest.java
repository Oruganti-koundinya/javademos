package Runtimepolymorphism;

public class RuntimeTest {

	public static void main(String[] args) {
		Macbook pro = new MacbookPro();
		pro.start();
		pro.shutdown();
		
		Macbook air = new MacbookAir();
		air.start();
		air.shutdown();
		
		//MacbookPro pro = new MacbookPro();
		//operate (pro);
		
		//MacbookAir air = new MacbookAir();
		//operate(air);

	}
	//static void operate(Macbook mac)
	//{
	//	mac.start();
	//	mac.shutdown();
	//}

}
