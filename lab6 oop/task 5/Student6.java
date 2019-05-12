public class Student6
{
 String name;
 String address;
 int  age;
 public Student6(String name, String address, int age)
 {
  this.name="Unknown";
  this.address="Not Available";
  this.age=0;
 }
 public void setInfo(String n, int a)
 {
  name=n;
  age=a;
  System.out.println("Name :" +n);
  System.out.println("Age :" +a);
 }
 public void setInfo(String addr)
 {
  address=addr;
  System.out.println("Address :" + addr);
 }
}