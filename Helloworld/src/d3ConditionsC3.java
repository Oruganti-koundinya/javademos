
public class d3ConditionsC3 {

	public static void main(String[] args) {
		boolean bool = true;
		
		if(bool==true)
		{
			System.out.println("The boolean value is true");
		}
		else
		{
			System.out.println("The boolean value is false");
		}
		
		int a,b,c;
		a=5;
		b=3;
		c=9;
		
		//AND OPERATIONS
		System.out.println("a>b Logical AND a>c" + (a<b && ++a>c));
		System.out.println("Value of a after operation = " + a);
		System.out.println("a>b Bitwise AND a>c" + (a<b & ++a>c));
		System.out.println("Value of a after operation = " + a);
		
		//OR OPERATIONS
		System.out.println("a>b Logical OR a>c" + (a>b || ++a>c));
		System.out.println("Value of a after operation = " + a);
		System.out.println("a>b Bitwise OR a>c" + (a>b | ++a>c));
		System.out.println("Value of a after operation = " + a);
		
		boolean mybool = false;
		if(mybool = false)
		{
			System.out.println("mybool is X");
		}
		else
		{
			System.out.println("mybool is Y");
		}
		

	}

}
