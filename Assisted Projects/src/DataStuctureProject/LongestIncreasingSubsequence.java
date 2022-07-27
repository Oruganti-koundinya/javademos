package DataStuctureProject;
import java.util.Scanner;

class LongestIncreasingSubsequence{
	private static int length(int[] a) 
	{
		int[] LIS = new int[a.length];
		int num = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) 
		{
			LIS[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j] && LIS[i] < LIS[j] + 1) 
				{
					LIS[i] = LIS[j] + 1;
				}
			}
			if (num < LIS[i]) 
			{
				num = LIS[i];
			}
		}
		return num;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements for Longest Increasing Subsequence :");
		int n = sc.nextInt();
		System.out.println("Enter array of " +n +"elements to LIS :");
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Longest Increasing Subsequence = " + length(a));
	}
}
