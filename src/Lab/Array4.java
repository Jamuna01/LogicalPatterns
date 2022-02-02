//4. How to check if two arrays are equal or not?(length and position must be same)
package Lab;

public class Array4
{
	public static void main(String[] args)
	{
		int[] ar1  = {1, 2, 3, 4, 5};
		//int[] ar2 = {1, 2, 3, 4, 5};
		int[] ar2 = {1, 2, 3, 4, 5, 6, 8,9};
		
		if(ar1.length != ar2.length)
		{
			System.out.println("Arrays are not equal!");
			return;
		}
		
		for(int i = 0; i<ar1.length; ++i)
		{
			if(ar1[i] != ar2[i])
			{
				System.out.println("Arrays are not equal..");
			}
		}
		System.out.println("Arrays are equal..");
	}
}
