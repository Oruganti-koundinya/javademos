package collections;

import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {
		
		int a[] = {40,10,7,15};
		System.out.println("Before Sort :");
		
		for (int i : a) 
		{
			System.out.println(i + " ") ;
		}
		System.out.println();
		
		int result = Arrays.binarySearch(a, 10);
		System.out.println("Found 10 at: " + result);
		
		Arrays.sort(a);
		System.out.println("After Sort :");
		for (int i : a) 
		{
			System.out.println(i + " ") ;
		}
		int result1 = Arrays.binarySearch(a, 40);
		System.out.println("Found 40 at: " + result1);
	}
}
