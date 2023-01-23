import java.util.*;
public class JaggedArray {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the numbe of rows:");
    int rows = sc.nextInt();
    int jagarray[][]= new int[rows][];
    for(int i=0; i<jagarray.length; i++)
    {
      jagarray[i]= new int[i+1];
    }

    int count = 0;
    for(int i=0; i<jagarray.length; i++)
    {
      for(int j=0; j<jagarray[i].length; j++)
      {
        jagarray[i][j]= count;
        count++;
      }
    }

    //Printing the jagged array elements
    for(int temp[]: jagarray)
    {
      for(int each : temp)
      {
        System.out.print(each + " ");
      }
      System.out.println(" ");
    }
  }
}
