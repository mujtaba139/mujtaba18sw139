class Task5
{
  public static void main(String args[])
  {
    int a=5;
    int b=a|3; //7
    int c=a&3;  //1
    int d=~a;  //-6
    int e=a^4;  //1
    int f=a<<2;  //20
    int g=a>>2;  //1
    int h=a>>>1;  //2
  System.out.println("Bitwise Operators");
  System.out.println("OR"+b);
  System.out.println("AND"+c);
  System.out.println("NOT"+d);
  System.out.println("XOR"+e);
  System.out.println("Left Shift"+f);
  System.out.println("Right Shift"+g);
  System.out.println("Unsigned Right Shift"+h);
  }
}