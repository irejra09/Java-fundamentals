import java.util.*;
public class Splitfunction {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String txt = "Java is a good programming language";
    String line[] = txt.split(" ");
    for(String str: line)
    {
      System.out.print(str+",");
    }
  }
}
