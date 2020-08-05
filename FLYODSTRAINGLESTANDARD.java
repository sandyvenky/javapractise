package javabasics;

import java.util.*;
public class FLYODSTRAINGLESTANDARD {

	public static void main(String[] args) 
	{

		//FLYODS TRAINGLE - It will be like right angle traingle shape, suppose if we give flyods traingle input as 7, it will create 7 rows in right angle traingle shape
		// SEEING STANDARD FLYODS TRAINGLE, its in ROWS AND COLUMNS FORMAT, SO NEED TO WRITE TWO FOR LOOPS, ONE FOR ROW AND 2ND FOR COLUMN
		//2 FOR LOOP WILL BE USED FOR PATTERN PRINTING
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER FOR FLYODS TRIANGLE");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)// for ex num = 7, it will run till 7 rows, we will get 7 rows
		{
			for(int j =1;j<=i;j++)// this j for loop to print number of columns why we wrote j<=i, because we need number of rows=number of columns
			{
				System.out.print("*");// why giving only just print means in order to get the right-angle triangle shape
			}
			System.out.println();// to indicate one row has been completed.
		}
		
	}
}
