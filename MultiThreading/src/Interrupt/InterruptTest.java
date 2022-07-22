package Interrupt;

public class InterruptTest {

	public static void main(String[] args) {
		
		String sname = Thread.currentThread().getName();
		System.out.println(sname + ": Start");
		Thread w1 = new Thread(new Worker());
		w1.setName("W1");
		w1.start();
		
		try {
			Thread.sleep(3000);
			w1.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(sname + ": End");
		
	}
	
}
