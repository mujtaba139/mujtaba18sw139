import java.util.Scanner;
public class Task3of1
{
  public static void main(String args[])
  {
    int space, rows;
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter number of rows of pyramid=");
    rows =obj.nextInt();
    for(int i=1, k=0; i<=rows; ++i, k=0)
     { for(space=1; space<=rows-i; ++space)
      { System.out.print(" ");}
      while(k!=2*i-1)
      { System.out.print("*");
      ++k;
      }
      System.out.println();
     }
   }
}












