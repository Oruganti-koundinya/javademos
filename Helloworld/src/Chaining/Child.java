package Chaining;

public class Child extends Parent {
	
	Child()
	{
		System.out.println("Child Constructor with No Arguments");
	}
	Child(int x)
	{
		super(x);
		System.out.println("Child Constructor with One Argument");
	}

}
