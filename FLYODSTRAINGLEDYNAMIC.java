package javabasics;

import java.util.*;
public class FLYODSTRAINGLEDYNAMIC {

	public static void main(String[] args) 
	{

		//FLYODS TRAINGLE - It will be like right angle traingle shape, suppose if we give flyods traingle input as 7, it will create 7 rows in right angle traingle shape
		// SEEING DYNAMIC FLYODS TRAINGLE, its in ROWS AND COLUMNS FORMAT, SO NEED TO WRITE TWO FOR LOOPS, ONE FOR ROW AND 2ND FOR COLUMN
		//2 FOR LOOP WILL BE USED FOR PATTERN PRINTING
		
//DYNAMIC TRIANGLE:  1. Change is to initialize the count variable and instead printing j print the count++
		//2. Get the count varibale initialization from the user
		//3. in the sysout print the count instead of j
		Scanner sc = new Scanner(System.in);
		int temp = 0;// dummy variable initialization, why dummy variable because we need the initial value
		System.out.println("ENTER THE STARTING NUMBER FOR FLYODS TRIANGLE");
		int count = sc.nextInt();
		System.out.println("ENTER THE NUMBER FOR FLYODS TRIANGLE");
		int num = sc.nextInt();
		
		temp = count; // assign the count variable to temp, to remove the initial value 
		for(int i=1;i<=num;i++)// for ex num = 7, it will run till 7 rows, we will get 7 rows
		{
			count = temp; // to re-assign the initial value for every row i.e. count
			for(int j =1;j<=i;j++)// this j for loop to print number of columns why we wrote j<=i, because we need number of rows=number of columns
			{
				System.out.print(count++);// why giving only just print means in order to get the right-angle triangle shape.
			}
			System.out.println();// to indicate one row has been completed.
		}
		
	}
}
