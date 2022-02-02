// 1, 3, 5, 7, 9 up to 50 - odd 
package patterns;

public class Pattern8
{

	public static void main(String[] args) {
		
	
	for(int i = 0; i <50; ++i)
	{
		if(i%2==0)
		{
			i = i + 1;
			System.out.print(i + " ");
		}
	}
	}
}
