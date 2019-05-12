class Result
{
		Student s;
		Marksheet m;
    Result(Student s1, Marksheet m1)
         {
	s=s1;
	m=m1;
         }
    public void createStudentResult()
     {
				System.out.println("name= "+s.name);
				System.out.println("ROLL NO= "+s.rollno);
				System.out.println("Age= "+s.age);
		                m.result=m.java+m.cpp+m.maths;
	        		System.out.println("result= "+m.result);
         			m.percent=m.result*100/300.0;
		        	System.out.println("percentage= "+m.percent);
                if(m.percent>90)
				System.out.println("grade=A");
		else if(m.percent>=80 && m.percent<=90)
				System.out.println("grade=B");
		else if(m.percent>=70 && m.percent<80)
				System.out.println("grade=C");
		else if(m.percent>=60 && m.percent<70)
				System.out.println("grade=D");
		else if(m.percent<60)
				System.out.println("FAIL");
								
     }

}