import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int fact = 1;
		int i = 1;
		if(n==0||n==1)
		{
			System.out.print("The factorial is 1");
		}
		else
		{
			while(i<=n)
			{
				fact = i*fact;
				i++;
			}
			System.out.print("Factorial of "+n+" is "+fact);
		}
	}
}
