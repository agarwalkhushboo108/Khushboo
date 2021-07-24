package Pattern;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		int i,j,n;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5-i; j++)
			{
				System.out.print(" ");
			}
			
			for(n=1; n<=i; n++) 
			{
				System.out.print("*");
			}
		System.out.println();
		
		}
	}
}
