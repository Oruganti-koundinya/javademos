package anoclass;

public class MyConnection implements Iconnection{

	@Override
	public void connect(String ConnectionDetails) {
		System.out.println("Successfully established connection with the server---" + ConnectionDetails);
	}

}
