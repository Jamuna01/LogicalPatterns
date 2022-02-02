
/*
 * WAP to take size of an array, fill elements to the array by the input.
 * and calculate sum of array elements and display it.
 */
package Lab;

import java.util.Scanner;

public class SizeOfArray
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size array: ");
		int size = console.nextInt();
		int[] arr = new int[size];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; ++i)
		{
			System.out.println("enter number " + (i + 1) + ": ");
			 arr[i] = console.nextInt();
			 sum = sum + arr[i];
		}
		System.out.println("sum is: " + sum);
		int j;
		System.out.println();
		System.out.print("Entered numbers are: ");
		for(j = 0; j < arr.length; ++j)
		{
			System.out.print(arr[j] + " ");
		}
		
		
		
	}
	
}
