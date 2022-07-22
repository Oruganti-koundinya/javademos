package Yield;

public class YieldTest {

	public static void main(String[] args) {
		
		Simpleloop sl = new Simpleloop();
		Thread t1 = new Thread(sl);
		t1.setName("t1");
		t1.start();
		
		Simpleloop SL = new Simpleloop();
		Thread t2 = new Thread(SL);
		t2.setName("t2");
		t2.start();
		
		String sname = Thread.currentThread().getName();
		for (int i=0; i<=10; i++)
		{
			System.out.println(sname +": " + i);
		}

	}

}
