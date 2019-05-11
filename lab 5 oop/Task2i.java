import java.util.Scanner;
public class Task2i
{ 
 int a[];
	int x;
	 public void populateArray()
	 {
	  
	  Scanner obj= new Scanner(System.in);
	  System.out.print("Enter any 5 Elemnets of array :");
	  for(x=0; x<=5; x++)
	  {
	   x=obj.nextInt();
	  }
	 }
	 public void showValues()
	 {
	  for(int x=0; x<=5; x++)
	  {
		  if((x%2)==0)
	  
	  {System.out.println("Even elements are:" +x);}
	  else 
	  {System.out.println("Odd elements are:" +x);}
	 }
	}
}
  
 