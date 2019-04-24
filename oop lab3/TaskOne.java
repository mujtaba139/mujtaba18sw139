import java.util.Scanner;
public class TaskOne
{
  public static void main(String args[])
  {
   int a;
   int b;
   int c;
   Scanner obj= new Scanner (System.in);
   System.out.print("Enter marks of C++ =");
   a=obj.nextInt();
   System.out.print("Enter marks of Data Structure =");
   b=obj.nextInt();
   System.out.print("Enter marks of Operating System =");
   c=obj.nextInt();
   double percent=((a+b+b)*100)/300;
   System.out.println("Your percentage=" +percent);
   if (percent>90)
   {System.out.println("Grade A+");}
   else if(percent>80 && percent<=90)
   {System.out.println("Grade A");}
   else if(percent>70 && percent<=80)
   {System.out.println("Grade B");}
   else if(percent>60 && percent<=70)
   {System.out.println("Grade C");}
   else if(percent<60)
   {System.out.println("Fail");}
  }
}