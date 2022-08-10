package PKG1;

public class Arthemetic2 
{
		public int div(int e, int f)
		{
			int g=e/f;
			System.out.println("Divison result is "+g);
			return g;
	    }
	   
	    public int sub(int m,int n)
	    {
	    	int o=m-n;
	    	System.out.println("Subraction result is "+o);
	    	return o;
	    }
	    
	   
		public int sum(int a,int b)
		{
				int c=a+b;
				System.out.println("sumresult is  "+c);
				return c;
		}
		
		public void multi(int x,int y)
		{
				int z=x*y;
				System.out.println("Final result is "+z);
		}	
		
		public static void main(String[] args)
		{
			Arthemetic2 A=new Arthemetic2();
			int Divresult=A.div(10, 2);
			int subresult=A.sub(Divresult, 2);
			int subresult1=A.sub(subresult, 2);
			int sumresult=A.sum(subresult1, 2);
			
			A.multi(sumresult, 2);
		}
		
}
