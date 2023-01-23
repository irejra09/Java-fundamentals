import java.util.*;
public class OneDarray {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int array[];
    array = new int[size];
    System.out.println("Enter the elements of the array:");
    for(int i = 0;i<size;i++)
    {
      array[i] = sc.nextInt();
    }

    System.out.println("The array elements are:");
    for(int i = 0;i<size;i++)
    {
      System.out.print(array[i]+" ");
    }

  }
}
