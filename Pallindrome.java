import java.util.Scanner;
public class Pallindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int newn = n;
		int sum = 0;
		int rem = 0;
		while(n!=0)
		{
			rem = n%10;
			sum = sum*10 + rem;
			n=n/10;
		}
		if(sum==newn)
		{
			System.out.print("The number you entered is pallindrome");
		}
		else
		{
			System.out.print("The number you entered is not pallindrome");
		}

	}
}