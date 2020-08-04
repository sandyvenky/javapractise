package javabasics;

import java.util.*;
public class QUOTIENTREMAINDERTWONUMBERS {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER");
		int num1 = sc.nextInt();
		System.out.println("ENTER SECOND NUMBER");
		int num2 = sc.nextInt();
		int quotient = num1/num2;
		int remainder = num1%num2;
		System.out.println("THE QUOTIENT IS:" +quotient);
		System.out.println("THE REMAINDER IS:" +remainder);
		
		
		
		
	}
}
