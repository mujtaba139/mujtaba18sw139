class Mark
{ 
			public static void main(String args[])
 			{
			Student s1=new Student("Mujtaba","18sw139",18);
			Marksheet m1=new Marksheet();
			m1.java=81;
			m1.cpp=90;
			m1.maths=76;
			Result r1=new Result(s1,m1);
	                r1.createStudentResult();
			}
}