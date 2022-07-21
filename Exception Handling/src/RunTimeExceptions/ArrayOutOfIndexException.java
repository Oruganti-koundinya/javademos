package RunTimeExceptions;
import java.util.*;
public class ArrayOutOfIndexException {

	public static void main(String[] args) {
		
		int arr[]= {10,20,25};
		System.out.println("Elements of array are :");
		System.out.println("Length of array :" + arr.length);
		try
		{
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i<=arr.length; i++)
		{
			System.out.print(arr[i] +" " );
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Out Of Bounds Exception Occured");
		}
	}

}
