package polymorphism;
public class Compiletimepolymorphism {

	public static void main(String[] args) {
		Compiletimepolymorphism obj = new Compiletimepolymorphism();
		obj.add(20,56);
		obj.add(10,20,30);
		obj.add(2.5f,6.5f);

	}
	//methods are always has to be assigned outside main method.
	void add(int a , int b)
	{
		int result = a+b;
		System.out.println("Result = " + result);
	}
	void add(float a, float b)
	{
		float result = a+b;
		System.out.println("Result = " + result);
	}
	void add(int a, int b,int c)
	{
		int result = a+b+c;
		System.out.println("Result = " + result);
	}

}
