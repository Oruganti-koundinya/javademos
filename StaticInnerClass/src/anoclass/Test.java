package anoclass;

public class Test {

	public static void main(String[] args) {
		Iconnection newcon = new Iconnection()
				{

					@Override
					public void connect(String ConnectionDetails) {
						System.out.println("New connection established using annonymous class -" + ConnectionDetails);
					}
					
				};
				newcon.connect("ProductionServer");
				
				
				Thread t1 = new Thread(new Runnable() {
					@Override
					public void run() {
						System.out.println("Anonymous worker in a separate thread");
					}
				});
				t1.start();
	}

}
