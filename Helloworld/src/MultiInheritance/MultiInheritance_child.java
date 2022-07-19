package MultiInheritance;

public class MultiInheritance_child extends MultiInheritance_parent {
	MultiInheritance_child()
	{
		System.out.println("Child Constructor: " + this);
	}
	void c1()
	{
		System.out.println("We are inside Child method c1");
	}
}
