import java.util.Scanner;
public class Task6{

    public static void main(String[] args) {
    
     Scanner in = new Scanner(System.in);
     int array[] = new int[] {2,7,13,5,9};
     int val = in.nextInt();
     int check = 100;

     for(int i=0; i<5; i++)
     {
       if(array[i] == val)
       {
        System.out.println(val + "found at index " + i);
        check = 50;
         break;  
       }
      }   
      
     if( check == 100)
     {
       System.out.println("Value Not Found In The Array");
     }
  }
}