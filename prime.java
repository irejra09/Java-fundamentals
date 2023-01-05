
import java.util.*;
public class prime
{
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int flag = 0;
		if(n==0||n==1)
		{
		    System.out.print(n+" is not prime :(");
		}
		else 
		{
		    for(int i = 2;i<n-1;i++)
		    {
		        if(n%i==0)
		        {
		            System.out.print(n+" is not prime.");
		            flag=1;
		            break;
		        }
		    }
		}
		
		if(flag==0)
		{
		    System.out.print(n+" is prime.");
		}
	}
}
