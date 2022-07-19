package Chaining;

public class Parent {
	int x;
	Parent()
	{
		this(23);
		System.out.println("Parent Constructor with No Arguments");
	}
	Parent(int x)
	{
		this.x = x;
		System.out.println("Parent Constructor with One Argument");
	}

}
