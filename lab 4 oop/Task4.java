class Task4
{
 public static void main(String args[])
 {
   
   int result[][] = new int[3][3];
   int A[][] = new int[][] {{1,2,3}, {42,31,4}, {4,75,36}} ; 
   int B[][] = new int[][] {{9,17,6}, {35,7,2}, {10,3,9}};
   for(int i=0; i<3; i++)
   { for(int j=0; j<3; j++)
     { result[i][j]=A[i][j]+B[i][j]; }
   }
   System.out.println("Sum=");
   
   for(int i=0; i<3; i++)
   { for(int j=0; j<3; j++)
     { System.out.print(result[i][j]);
       System.out.print(" ");
     }
     System.out.println();
   }
  }
}