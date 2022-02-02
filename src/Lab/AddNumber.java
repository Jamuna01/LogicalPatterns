package Lab;

public class AddNumber 
{
	public static void main(String[] args)
	{
//		int sum = 0;
//		for(int i= 1; i <= 10 ; i++)
//		{
//			sum = sum + i;
//		}
//		System.out.println("Sum is: " + sum);
		
		//using while loop
//		int k = 1;
//		int sum = 0;
//		while(k <=10)
//		{
//			sum += k;
//			k++;
//		}
//		System.out.println("sum is: "+ sum);
		
		//do while loop
		
		int k = 1;
		int sum = 0;
		do
		{
			sum += k;
			k++;
		}
		while(k <= 10);
		System.out.println("sum is: "+ sum);
	}
}
