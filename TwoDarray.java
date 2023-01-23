import java.util.*;
public class TwoDarray {
  public static void main(String[] args)
  {
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter the number of rows of the array:");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns of the array:");
    int columns = sc.nextInt();
    int array[][] = new int[rows][columns];
    for(int i = 0; i < rows; i++)
    {
      for(int j = 0; j < columns; j++)
      {
        array[i][j] = sc.nextInt();
      }
    }
    System.out.println("The array elements are: ");
    /* for(int i = 0; i < array.length; i++)
    {
      for(int j = 0; j < array[i].length; j++)
      {
        System.out.print(array[i][j]+" ");
      }
      System.out.println("");
    } */
    for(int temp[] : array)
    {
      for(int i : temp)
      {
        System.out.print(i+" ");
      }
      System.out.println(" ");
    }
  }
}
