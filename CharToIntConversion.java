package java_course;

import java.util.Scanner;

public class CharToIntConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//1.Implicit conversion
		System.out.println("Enter a character for conversion of char to int");
		char c=sc.next().charAt(0);
		int i=c;
		System.out.println(i);
		
		//2. Character.getNumericValue()
		System.out.println("Enter a character for conversion of char to int");
		char c1=sc.next().charAt(0);
		int i1=Character.getNumericValue(c1);
		System.out.println(i1);
		
		
		
		

	}

}
