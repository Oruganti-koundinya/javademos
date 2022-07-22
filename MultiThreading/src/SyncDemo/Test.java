package SyncDemo;

public class Test {

	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname + "Main Method Started :");
		
		DisplayMessage dm = new DisplayMessage();
		
		Thread t1 = new Thread(new Worker(dm, "Koundi"));
		t1.setName("T1");
		
		Thread t2  = new Thread(new Worker(dm, "Chaitu"));
		t2.setName("T2");
		
		Thread t3 = new Thread(new Worker(dm, "kittu"));
		t3.setName("T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(tname + "Main Method ended :");
	}

}
