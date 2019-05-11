import java.util.Scanner;
public class Task2
{ 
  public static void main(String args[])
  {
   int table, start, end;
   int result;
   Scanner obj = new Scanner(System.in);
   System.out.print("Enter table=");
   table= obj.nextInt();
   System.out.print("Enter starting point of table =");
   start = obj.nextInt();
   System.out.print("Enter ending point of table =");
   end= obj.nextInt();
   for(int i=start; i<=end; i++)
   { while(start<=end)
     {
        result= table*start;
        System.out.println(result);
        start++;
     }
     System.out.println();
   }
   }
}
   