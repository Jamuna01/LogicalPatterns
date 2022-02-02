//2. Write a program to print prime numbers 1 to 100 between
package Assignment3B;

public class PrimeNumber {
	public static void main(String[] args)
	{
		int i, j, count = 0;
		
		System.out.println("Prime numbers from 1 to 100: \n");
		for(i = 2; i <= 100; i++)
		{ 
			for(j = 1; j <=i; j++ )
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(i + " ");
			}
			count = 0;
		}
	}
}
