import java.util.Scanner;
public class Task1
{
 public static void main(String args[])
 {
  String a, b;
  Scanner obj= new Scanner(System.in);
  System.out.print("Enter Your Name : ");
  a=obj.nextLine();
  System.out.print("Enter Your Roll Number :");
  b= obj.nextLine();
  System.out.println("Name :" +a);
  System.out.println("Roll Number :" +b);
 }
}