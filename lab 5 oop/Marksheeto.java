import java.util.Scanner;
public class Marksheeto
{
 public static void main(String args[])
 {
  Scanner obj= new Scanner(System.in);
  System.out.println("Enter Marks of OOP, LAAG and DCLD resp=");
  int oop=obj.nextInt();
  int laag=obj.nextInt();
  int dcld=obj.nextInt(); 
  Marksheeti M= new Marksheeti(oop, laag, dcld);
  int Marksheeti =M.Marks();
  M.Percent();
  M.Grade();
  M.Show();
 }
}