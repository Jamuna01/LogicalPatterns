//3. Write a program to print fibonacci series
package Assignment3B;

public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		int i = 0, j = 1, k = 0, l = 10;
		
		while(k <= l)
		{
			System.out.print(i + " ");  
			int temp = j + i; 
			j = i; 
			
			i = temp; 
			
			k = k + 1;
		}
	}
}
