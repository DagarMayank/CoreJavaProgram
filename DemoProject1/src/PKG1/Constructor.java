package PKG1;

public class Constructor
{
 public Constructor()
 {
	 this(2,4,8);
	 System.out.println("This is Default constructor");
 }
 public Constructor(int a)
 {
	 this();
	 System.out.println("This one parameterised constructor");
 }
 public Constructor(int a, float b)
 {
	 	this(9);
	 System.out.println("This is two parameterised constructor");
 }
 public Constructor(int a,float v,float c)
 {
	 System.out.println("This is three parameteised constructor");
 }
 public Constructor(int a,int c,int m,float n)
 {
	 this(2,3);
	 System.out.println("This is four parametised constructor");
 }
  
 public static void main(String[] args) 
 	{
	 Constructor obj=new Constructor(23,4,78,5);
 	}

}
