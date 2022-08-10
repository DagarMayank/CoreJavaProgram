package PKG1;

public class Arthemetic
{
  public int sum(int a,int b)
  {
	  			int c=a+b ;
	 			System.out.println("Sum result is "+c);
	 return c;
  }
  public int sub(int d,int e)
  {
	  			int z=d-e ;
	  			System.out.println("Sub result is "+z);
	  return z;
  }
  public void multi(int x1,int x2)
  {
	  			int y=x1*x2;
	  			System.out.println("Final result is "+y);
  }

  public static void main(String[] args)
{
	  Arthemetic H=new Arthemetic();
	  			int sumresult =H.sum(10,2);
	  			int subresult =H.sub(10,2);
	  H.multi(sumresult,subresult);
	 
}
}

