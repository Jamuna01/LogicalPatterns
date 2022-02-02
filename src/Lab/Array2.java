//2. How to merge two arrays?

package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 
{
	public static void main(String[] args) 
	{
		 int ar1[] = {90, 80, 60, 2};
		 int ar2[] = {77, 64, 23};
	
		 int[] ar3 = new int[ar1.length + ar2.length];
		 
		 for(int i = 0; i<ar1.length; ++i)
		 {
			 ar3[i] = ar1[i];
			 
			 //System.out.println("ar3 " + ar3[i]);
		 }
		 
		 for(int j = 0; j<ar2.length; ++j)
		 {
			 ar3[j + ar1.length] = ar2[j];
			 
			//System.out.println("ar3 " + ar3[j]);
		 }
		// System.out.print(Arrays.toString(ar3) );
		 
		 for( int x: ar3)
		 {
			 System.out.print( x + " ");
		 }
	}
}
