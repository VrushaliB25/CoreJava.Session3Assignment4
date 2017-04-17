
public class ConstructorChaining 
{
		   
	 public static void main(String s[]) 
	 {
		 MyChaining ch = new MyChaining(10,25);
		 
		 
	 }
	 
}
	class MyChaining 
	 {
	     
		    public MyChaining()
		    {
		        System.out.println("In default constructor...");
		    }
		    public MyChaining(int i)
		    {
		        this();
		        System.out.println("In single parameter constructor...");
		    }
		    public MyChaining(int i,int j)
		    {
		        this(j);
		        System.out.println("In double parameter constructor...");
		        System.out.println("The value of i and j is "+ i+" and "+j);
		    }
		     
	 }	    
				