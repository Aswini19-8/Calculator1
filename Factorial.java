package calculator;

import java.util.Scanner;

public class Factorial {
	

	
static int factorial(int n) {
	if(n==0||n==1) {
		return 1;
	}
	return n*factorial(n-1);
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		System.err.println(factorial(n));
		
		
	}

}
