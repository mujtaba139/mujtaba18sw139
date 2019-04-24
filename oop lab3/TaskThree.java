import java.util.Scanner;
public class TaskThree
{  public static void main(String args[])
  {
   boolean bool = false;
   char c;
   Scanner obj = new Scanner(System.in);
   System.out.print("Enter any character =");
   c = obj.next().charAt(0);
   switch(c) {
   case 'A': 
   case 'E': 
   case 'I': 
   case 'O': 
   case 'U': 
   case 'a': 
   case 'e':
   case 'o': 
   case 'u':  bool = true; }
   if (bool == true)
   { System.out.println("It is a  Vowel");}
   else 
   { System.out.println("It is a Consonant");}
  }
}