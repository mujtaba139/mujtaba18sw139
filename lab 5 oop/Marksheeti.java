public class Marksheeti {
	 int laag, dcld, oop, result, percent;
	 char grade;
	 Marksheeti(int laag, int dcld, int oop)
	 {
	  this.laag=laag;
	  this.dcld=dcld;
	  this.oop=oop;
	 }
	 public int Marks()
	 {
		 result=oop + dcld + laag;
		 return result;
	 }
	 public int Percent()
	 {
	  percent=(100*result/300);
          return percent;
	 }
	 public char Grade()
	 {
	  if(percent>=90)
	  { grade='A'; }
	  else if (percent<90 && percent>=80)
	  { grade='B'; }
	   else if (percent<80 && percent>=70)
	  { grade='C'; }
	   else if (percent<70 && percent>=60)
	  { grade='D'; }
	   else if(percent<60 && percent>=50)
	  { grade='E'; }
	   return grade;
	 }
         public void Show()
         {System.out.println("Total marks= 300");
          System.out.println("Obtained marks=" +result);
          System.out.println("Percentage=" +percent);
          System.out.println("Grade=" +grade);
         }
}

          
