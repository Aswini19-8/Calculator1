package calculator;

import java.util.Scanner;

public class calculator {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int value;
		do {

			System.out.println("==CALCULATOR==");
			System.out.println("1.Addition");
			System.out.println("2.ubtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("Choose your option:");
			value=sc.nextInt();
			switch(value) {
			case 1:
				addition();
				break;
			case 2:
				subtraction();
				break;
			case 3:
				multiplication();
				break;
			case 4:
				division();
				break;
				default:
					System.out.println("Invalid Choice/n please choose correct option!");
			}
			
		}while(value!=5);
		
	}
	public static void addition() {
		System.out.println("enter first number:");
		int number1=sc.nextInt();
		System.out.println("enter second number:");
		int number2=sc.nextInt();
		System.out.println("addition:"+ (number1+number2));
		
	}
public static void subtraction() {
	System.out.println("enter first number:");
	int number1=sc.nextInt();
	System.out.println("enter second number:");
	int number2=sc.nextInt();
	System.out.println("subtraction:"+(number1-number2));
		
	}
public static void multiplication() {
	System.out.println("enter first number:");
	int number1=sc.nextInt();
	System.out.println("enter second number:");
	int number2=sc.nextInt();
	System.out.println("multiplication:"+ (number1*number2));
	
}
public static void division() {
	System.out.println("enter first number:");
	double number1=sc.nextInt();
	System.out.println("enter second number:");
	double number2=sc.nextInt();
	if(number2!=0) {
		System.out.println("division:"+ (number1/number2));
	}else {
		System.out.println("division by zero is not allowed.");
	}
	
}
}
		
		
		
	


