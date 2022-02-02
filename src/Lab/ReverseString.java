package Lab;

import java.util.Arrays;

public class ReverseString
{
	public static void main(String[] args)
	{
		String[] names = {"JavaSE", "JavaEE", "JavaME", "Angular", "React"};
		
//		for(int i = names.length - 1; i >= 0; --i)
//		{
//			System.out.print( names[i] + " ");
//		}
		int size = names.length;
		String[] reverse = new String[size];
		
		for(int i = 0; i <size; ++i)
		{
			reverse[size - i - 1] = names[i];
		}
		System.out.println("Original: " + Arrays.toString(names));
		System.out.println("Reverse: " + Arrays.toString(reverse));
	}
}
