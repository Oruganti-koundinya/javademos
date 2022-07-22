package SyncDemo;

public class DisplayMessage {
	
	public synchronized void sayHello(String name)
	{
		String tname = Thread.currentThread().getName();
		for (int i=0;i<=10;i++)
		{
			System.out.println(tname + ": " + i + " How are you " +name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
