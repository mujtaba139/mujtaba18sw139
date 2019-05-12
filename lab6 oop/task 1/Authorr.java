class Authorr
{
 public static void main(String args[])
 { 
  Author a1= new Author("Mujtaba", "muji@gamil.com", 'm');
  String email=a1.getName();
  a1.setEmail("muji@gamil.com");
  char gen=a1.getGender();
  String a=a1.toString();
  System.out.println(a);
 }
}
