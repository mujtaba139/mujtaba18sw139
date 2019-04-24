import java.util.Scanner;
public class TaskFour
{  
  public static void main(String args[])
  {
   int a, b, c;
   char ch;
   Scanner obj = new Scanner(System.in);
   System.out.print("Enter first number =");
   a= obj.nextInt();
   System.out.print("Enter second number =");
   b = obj.nextInt();
   System.out.print("Enter any mathematical operator =");
   ch = obj.next().charAt(0);
   if (ch == '+')
   { c=a+b;
     System.out.println(c);}
   else if (ch == '-')
   { c=a-b;
     System.out.println(c);}
   else if (ch == '*')
   { c=a*b;
     System.out.println(c);}
   else if (ch == '/')
   { c=a/b;
     System.out.println(c);}
  }
}