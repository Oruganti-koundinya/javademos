
public class d3LoopingstatementsC4 {

	public static void main(String[] args) {
		
		for(int i=22; i<=98; i+=2)
		{
			System.out.println(i);
		}
		int sum =0;
		int count =0;
		for(int i=1; i<=100; i++)
		{
			if(i%3==0 & i%5==0)
			{
				sum += i;
				count ++;
			}
			if(count == 5)
			{
				break;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Sum = " + sum);
		System.out.println("Total numbers that satisfies criteria are :" + count);

	}

}
