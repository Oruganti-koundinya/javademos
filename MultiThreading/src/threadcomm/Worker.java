package threadcomm;

public class Worker implements Runnable{

	private int total;
	
	public int getTotal()      //getter method to access private non-static variable.
	{
		return total;
	}
	
	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + "Calculation Begin :");
		synchronized (this)  //imposes lock to worker thread by using this keyword.
		{
			for(int i =0; i<100;i++)
			{
				total +=i;
			}
			System.out.println(tname +"Calculation Completed notify...");
			this.notify();      //this notifies main method back to get ready for the task.
		}
		System.out.println(tname + "Calculation Ended");
	}
}
