package Runnable;

public class RunnableTest {

	public static void main(String[] args) throws InterruptedException {
		
		CheckProcessed cp = new CheckProcessed();
		Thread t = new Thread(cp);
		t.setName("t1 :");
		t.start();
		
		t.join();
		System.out.println("Main Thread ended");
	}

}
