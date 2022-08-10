package PKG1;

import java.util.Scanner;


public class superkeyword 
{
	;
	
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int d,int e)
	{
		int f=d-e;
		System.out.println("subraction result is  "+f);
		return f;
	}
	public int multi(int k,int l)
	{
		int i=k*l;
		System.out.println("multiplication result is  "+i);
		return i;
	}
	public void div(int x,int y)
	{
		int z=x/y;
		System.out.println("Division result is  "+z);
		System.out.println("Final result of the above given matrix is "+z);
	}
	
   public static void main(String[] args) 
   {
	   System.out.println("Question:- ((((x1+x2)+x3)-x4)*x5)/x6 ? ");
	   System.out.println("Ans:-");
	   superkeyword scan= new superkeyword();
	   Scanner S=new Scanner(System.in);
	   					System.out.println("Please enter the value of following x1,x2,");
	   					int x1=S.nextInt();
	   					int x2=S.nextInt();
	   					int sumresult=scan.sum(x1,x2);
	   
	   					System.out.println("Please enter the value of x3");
	   					int x3=S.nextInt();
	   					int sumresult1=scan.sum(sumresult,x3);
	   					
	   					System.out.println("Please enter the vaule of x4");
	   					int x4=S.nextInt();
	   					int subresult=scan.sub(sumresult1, x4);
	   					
	   					System.out.println("please enter the value of x5");
	   					int x5=S.nextInt();
	   					int multiresult=scan.multi(subresult,x5);
	   					
	   					System.out.println("Please enter the value of x6");
	   					int x6=S.nextInt();
	   				  
	   				   scan.div(multiresult, x6);
	   
	   
   }

}

