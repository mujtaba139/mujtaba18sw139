import java.util.Scanner;
public class Task1
{
	public static void main(String args[])
	{
		String name="";
		int rollnum;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Name::");
		name=obj.nextLine();
		System.out.print("Enter rollnum::");
		rollnum=obj.nextInt();
		System.out.println(name+rollnum);
	    
	}
}