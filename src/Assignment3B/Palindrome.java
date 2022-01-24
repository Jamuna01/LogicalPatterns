//4. Palindrome
package Assignment3B;
import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = console.nextLine();
		String reverse = "";
		
		for(int i = (word.length()-1); i >=0; --i)
		{
			reverse =  reverse+word.charAt(i);
		}
		if(word.equalsIgnoreCase(reverse))
		{
			System.out.println("The given word " + word + " is palindrome!");
		}
		else
		{
			System.out.println("The given word " + word + " is not palindrome!");
		}
	}
}
