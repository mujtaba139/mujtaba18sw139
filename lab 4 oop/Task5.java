class Task5
{ public static void main(String args[])
  {
   int A[] = new int[] {1, 23, 34, 5};
   int max=A[0];
   for(int i=0; i<A.length; i++)
   { if(A[i]>=max)
     {max=A[i];
     }
   }
   System.out.println("Maximum number is=" +max);
 }
}