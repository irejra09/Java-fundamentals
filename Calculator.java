import java.util.Scanner;

public class Calculator 
{
	public static void main(String args[])
	{
		// declare here
		int a,b,res;
		char choice;
		Scanner S=new Scanner(System.in);
		char ch;
		do
		{
			// prepare menu for the user to see multiple operations.
			System.out.println("\n\nMain Menu : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Remainder\n");
			
			// enter the choice
			System.out.print("Enter your choice : ");
			
			// read the input choice value.
			choice=S.next().charAt(0);
			
			// this loop will calculate different the operations value at different dofferent values.
			switch(choice)
			{ 
			    case '1':System.out.print("Enter two numbers : ");
			    a=S.nextInt();
			    b=S.nextInt();	
			    res=a+b;
			    System.out.println("Result : " +res);
			    break;
			     
			     case '2':System.out.print("Enter two numbers : ");
				 a=S.nextInt();
				 b=S.nextInt();	
				 res=a-b;
				 System.out.println("Result : " +res);
				 break;
				    
			     case '3':System.out.print("Enter two numbers : ");
				 a=S.nextInt();
				 b=S.nextInt();	
				 res=a/b;
				 System.out.println("Result : " +res);
				 break;
				    
			     case '4':System.out.print("Enter two numbers : ");
				 a=S.nextInt();
				 b=S.nextInt();	
				 res=a*b;
				 System.out.println("Result : " +res);
				 break;
				 
				 case '5':System.out.print("Enter two numbers : ");
				 a=S.nextInt();
				 b=S.nextInt();	
				 res=a%b;
				 System.out.println("Result : " +res); 
				 
				 default : System.out.println("Wrong Choice.....\n");
				 break;
			}
			System.out.print("Do you want to continue?(y/n):");
			ch = S.next().charAt(0);
			
	    }
	  while(ch=='y');
	}
}