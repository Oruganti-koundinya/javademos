package UsingArrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[] = {78,34,21,11};
		int sum =0;
		int Sum =0;
	/*	for(int i=0;i<=a.length;i++)
		{
			sum +=a[i];
			System.out.println("Sum Of The Array = " + sum);
		}*/
		for (int element : a) {
			Sum+=a[element];
			System.out.println("hey" +Sum);
		}
	}

}
