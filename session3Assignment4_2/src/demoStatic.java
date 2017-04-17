
public class demoStatic 
{
	 public static void main(String s[])
	{
	Student s1 = new Student();
    s1.showData();
    Student s2 = new Student();
    s2.showData();
    Student.b++;
    s1.showData();
    Student.increment();
 }
}

class Student
{
	
int a; //initialized to zero
static int b; //initialized to zero only when class is loaded not for each object created.

 Student(){
  //Constructor incrementing static variable b
  b++;
 }

 void showData(){
     System.out.println("Value of a = "+a);
     System.out.println("Value of b = "+b);
  }
 static void increment()
	{
	 b++;
	System.out.println("This is static method.and value of b is "+b);
	}

}

