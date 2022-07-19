package Super;

public class child extends parent {
	
	int c,d;
	child (int a , int b)
	{
		super (52, 63);
		this.a = c;
		this.b = d;
	}
	child (int a, int b, int c, int d)
	{
		super (a, b);
		this.a = c;
		this.b = d;
	}
	void DisplayDetails()
	{
		System.out.println("Parent a:" +a);
		System.out.println("Parent b:" +b);
		System.out.println("Child c:" + c);
		System.out.println("Child d:" + d);
	}

}
