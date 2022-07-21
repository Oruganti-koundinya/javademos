package ThreadPriority;

public class MultiThreadPriority extends Thread{

	public static void main(String[] args) {
		
		MultiThreadPriority mp1 = new MultiThreadPriority();
		mp1.setName("mp1 Thread");
		//mp1.setPriority(MIN_PRIORITY);
		mp1.start();
		
		MultiThreadPriority mp2 = new MultiThreadPriority();
		mp2.setName("mp2 Thread");
		//mp2.setPriority(MAX_PRIORITY);
		mp2.start();
	}
	public void run()
	{
		System.out.println(currentThread().getName());
	}

}
