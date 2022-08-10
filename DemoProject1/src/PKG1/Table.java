package PKG1;

import java.util.Scanner;

public class Table 
{

	 public static void main(String[] args) 
	 {
		 	Scanner Sc=new Scanner(System.in);
		 	System.out.println("Enter the number which table you want ");
		 	int a=Sc.nextInt();
		 	for(int i=1;i<=10;i=i+1)
		 	{
		 		int b= a*i;
		 		 System.out.printf("%d * %d = %d \n", a, i, b);
		 	}
		 		
	       
	 }
}
