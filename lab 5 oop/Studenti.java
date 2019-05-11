public class Studenti
{
 private String name;
 private int age;
 private int roll;
 private String depart;
 private int batch;
 private String uni;
 public void Student(String name, int age)
 { 
  this.name= name;
  this.age= age;
 }
 public void setData(int roll, String depart, int batch, String uni)
 {
  this.roll=roll;
  this.depart=depart;
  this.batch=batch;
  this.uni=uni;
 }
 public void showData()
 {
  System.out.println("Name:" +name);
  System.out.println("Age:" +age);
  System.out.println("Roll number:" + batch+ "SW" +roll);
  System.out.println("Department:" +depart);
  System.out.println("Batch:" +batch);
  System.out.println("University:" +uni);
 }
}