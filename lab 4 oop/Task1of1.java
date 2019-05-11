import java.util.Scanner;
public class Task1of1
{
  public static void main(String args[])
  {
    int rows;
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter number of rows of half pyramid=");
    rows =obj.nextInt();
    for(int i=1; i<=rows; ++i)
     { for(j=1; j<=i; ++j)
      { System.out.print("*");
      }
      System.out.println();
     }
   }
}
