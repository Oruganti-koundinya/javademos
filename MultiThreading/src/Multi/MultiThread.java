package Multi;

public class MultiThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		MultiThread mt = new MultiThread();
		mt.start();
		
		for (int j=0; j<=200;j++)
		{
			System.out.println("j: " + j + "\t");
			Thread.sleep(500);
		}
	}
		public void run()
		{
			for (int i=0;i<=200;i++)
			{
				System.out.println("i: " +i + " \t");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			}
}

