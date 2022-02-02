/*
 * 11. Write a java program to test whether a given double/float value is finite 
 * floating-point value or not.
 */
package Lab;

public class Question11 
{
	public static void main(String[] args)
	{
		int x = 10;
		
		double a = 10/0;
		System.out.println(a); // arithmetic exception
		
		double b = 10/0.0;
		System.out.println(b); //infinity
		
		double c = -10/0.0;
		System.out.println(c); //-infinity
		
		double d = 0.0/0.0;
		System.out.println(d); //NaN
		
	}
}
