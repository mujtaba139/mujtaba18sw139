import java.util.Scanner;
public class Task3
{
  public static void main(String args[])
  {
    int n, sum=0;
    Scanner obj= new Scanner(System.in);
    System.out.print("Enter number =");
    n =obj.nextInt();
    int i=n;
    while(i>=1)
      { sum=sum+i;
        i--;
      }
        System.out.print(sum);
   }
}
