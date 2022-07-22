package Interrupt;

public class Worker implements Runnable{
	
	boolean isAwake = true;
	
	void setAwake()
	{
		isAwake = true;
	}
	void setAsleep()
	{
		isAwake = false;
	}

	@Override
	public void run() {
		String sname = Thread.currentThread().getName();
		System.out.println(sname + ": Start");
		for (int i=1; i<=10; i++) {
			System.out.println(sname + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(sname + ": Interrupted");
				break;
			}
		}
		System.out.println(sname + ": End");
	}

}
