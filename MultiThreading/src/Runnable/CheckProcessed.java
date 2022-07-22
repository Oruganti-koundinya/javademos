package Runnable;

public class CheckProcessed implements Runnable{

	@Override
	public void run() {
		String sname = Thread.currentThread().getName();
		System.out.println(sname + "Processed the Checks.");
	}

}
