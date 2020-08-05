package javabasics;

import java.util.*;
public class RANDOMNUMBERS {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER TO START WITH FOR RANDOM GENERATION");
		int num1 = sc.nextInt();
		System.out.println("ENTER THE LAST NUMBER TO END WITH FOR RANDOM GENERATION");
		int num2 = sc.nextInt();
		Random rad = new Random(); // Random is a class, creating object for that as rad
		for(int i = num1;i<num2;i++) // if given <= both starting and ending number is inclusive
									// if given only < first starting number only inclusive
		{
			System.out.println(rad.nextInt()); // to generate random number by using the object of random class nextInt is a function inside Random class
		}
				
	}
}
