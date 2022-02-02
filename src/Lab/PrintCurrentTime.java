//5. Write a Java program that prints the current time in GMT.
package Lab;

import java.util.Date;

public class PrintCurrentTime 
{
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println("Today is " + date);
	}
}
