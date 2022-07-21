package Single;

public class SingleThread {

	public static void main(String[] args) {
		SingleThread st = new SingleThread();
		st.printNumbers();
		
		for (int j =0; j<=200;j++)
		{
			System.out.print("j:" +j +"\t");
		}
	}

	private void printNumbers() {
		for (int i=1;i<=200;i++)
		{
			System.out.print("i:" +i + "\t" );
		}
	}

}
