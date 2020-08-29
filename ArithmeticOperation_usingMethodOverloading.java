package java_course;

import java.util.Scanner;

public class ArithmeticOperation_usingMethodOverloading {
	
	public static int sum(int a, int b) {
		int result=a+b;
		return result;
	}
	public static float sum(float a, float b) {
		float result=a+b;
		return result;
	}
	public static String sum(String a, String b) {
		String result=a+" "+b;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer number");
		int num1=sc.nextInt();
		System.out.println("Enter a integer number");
		int num2=sc.nextInt();
		System.out.println("Enter a floating number");
		float num3=sc.nextFloat();
		System.out.println("Enter a floating number");
		float num4=sc.nextFloat();
		System.out.println("Enter a string");
		String word1=sc.next();
		System.out.println("Enter a string");
		String word2=sc.next();
		System.out.print("The addition of two integer numbers is ");
		int result1=sum(num1,num2);
		System.out.println(result1);
		System.out.print("The addition of two floating numbers is ");
		float result2=sum(num3,num4);
		System.out.println(result2);
		System.out.print("The addition of two string is ");
		String result3=sum(word1,word2);
		System.out.println(result3);

	}

}
