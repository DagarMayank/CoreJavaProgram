package PKG1;

public class Arthemetic1 
{
  public int sum(int a,int b)
  {
	      int c=a+b;
	      System.out.println("sumresult is "+c);
	  return c;
  }
  public int sub(int e,int f)
  {
	      int g=e-f;
	      System.out.println("subresult is  "+g);
	   return g;   
  }
  public int multi(int m, int n)
  {
	      int o=m*n;
	      System.out.println("multiplication result is  "+o);
	   return o;
	  
  }
  
 public void division(int x, int y)
 {
	 int z=x/y;
	 System.out.println("Final resilt is  "+z);
	 
 }
 
 
 public static void main(String[] args) 
 {
	Arthemetic1 A=new Arthemetic1() ;
	int sumresult=A.sum(10, 2);
	int sumresult1=A.sum(sumresult,2);
	int subresult=A.sub(sumresult1, 2);
	int multiresult=A.multi(subresult, 2);
	
	A.division(multiresult,2);


	
 }
}
