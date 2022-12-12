public class BiggestOfThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find the biggest of three numbers..");
        System.out.println("Enter three numbers..");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int c = sc.nextInt();

        if(a>b&&a>c)
        {
            System.out.println(a+" is the biggest..");
        }
        else if(b>a&&b>c)
        {
            System.out.println(b+" is the biggest..");
        }
        else if(c>a&&c>b)
        {
            System.out.println(c+" is the biggest..");
        }
        else if(a==b&&b==c)
        {
            System.out.println("All are equal..");
        }
    }
}
