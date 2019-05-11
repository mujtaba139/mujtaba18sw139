public class Dogi
{
 String name;
 String breed;
 int age;
 public void setDetails(String n, String b, int a)
 {
  name=n;
  breed=b;
  age=a;
 }
 public void showDetails()
 {
  System.out.println("Name:" +name);
  System.out.println("Breed:" +breed);
  System.out.println("Age:" +age);
 }
}


