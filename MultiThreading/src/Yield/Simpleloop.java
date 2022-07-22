package Yield;

public class Simpleloop implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<=10; i++)
		{
			String sname = Thread.currentThread().getName();
			System.out.println(sname + ": "+i);
		}
		
	}

}
