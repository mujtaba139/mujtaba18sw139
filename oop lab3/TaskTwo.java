import java.util.Scanner;
public class TaskTwo
{
  public static void main(String args[])
 {
  int a;
  int b;
  Scanner obj= new Scanner(System.in);
  System.out.print("Enter your bill units =");
  a= obj.nextInt();
  if (a<=50)
  { b= a*10;
    System.out.println(b);}
  else if(a>50 && a<=100)
  { b=a*15;
    System.out.println(b);}
  else if(a>100 && a<=200)
  { b=a*20;
    System.out.println(b);}
  else if(a>200 && a<=300)
  { b=a*25;
    System.out.println(b);}
  else if(a>300)
  { b=a*30;
    System.out.println(b);}
  }
}