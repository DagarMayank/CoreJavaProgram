package PKG1;

import java.util.Scanner;

public class Factorial 
{
	 public static void main(String[] args) 
	 {
		 	System.out.println("Enter the number whose Factorial you want");
		 Scanner sc=new Scanner(System.in);		
		 
	        int num =sc.nextInt();
	        int factorial = 1;
	        for(int i = 1; i <= num; ++i)
	        {
	             factorial = factorial * i;
	            
	        }
	        System.out.printf("Factorial of %d = %d", num, factorial);

}
}
