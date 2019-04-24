class Task2
{
  public static void main(String args[])
  {  
     int a=38;
     int b=59;
    System.out.println("Relational Operators");
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a>=b);
    System.out.println(a<=b);
    System.out.println(a==b);
    System.out.println(a!=b);
     boolean c=true;
     boolean d=false;
     boolean e;
   System.out.println("Boolean Operators");
   System.out.println(e=c|d);
   System.out.println(e=c&d);
   if(a==0 || a/5 >2)
   {System.out.println("Short circuit or");}
   if(a==0 && a/5 <2)
   {System.out.println("Short circuit and");}
   }
}
