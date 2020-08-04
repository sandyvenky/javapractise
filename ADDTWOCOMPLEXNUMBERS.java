package javabasics;

import java.util.*;
public class ADDTWOCOMPLEXNUMBERS {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int pos1 = 0, pos2 = 0;
		System.out.println("ENTER FIRST COMPLEX NUMBER:");
		
	// ALWAYS GET COMPLEX NUMBER THROUGH STRING
		String complex1 = sc.nextLine();
		System.out.println("ENTER SECOND COMPLEX NUMBER");
		
		String complex2 = sc.nextLine();
		complex1 = complex1.replaceAll("i", "");
	// TO REMOVE IMAGINARY PART i TO DELETE i WE WRITE THE ABOVE CODE
		complex2 = complex2.replaceAll("i", "");
		
	// TO SEPARATE REAL & IMAGINARY TO DETERMINE THE POSITION OF +
	// USE FOR LOOP TO DETERMINE THE POSITION OF +
		for(int i = 0;i<complex1.length();i++)
		{
			if(complex1.charAt(i)=='+')
				{
						pos1 = i;
				}
		}
	//USE FOR LOOP TO DETERMINE THE POSTION OF +
		for(int j =0;j<complex2.length();j++)
		{
			if(complex2.charAt(j)=='+')
			{
				pos2 = j;
			}
		}
		
//RUN FOR LOOP TILL THE LENGTHOF THE COMPLEX1 & COMPLEX2. WE WILL GET THE POSITION BY THE ABOVE CODE

// FOR 1ST COMPLEX NUMBER 
		int real1 = Integer.parseInt(complex1.substring(0,pos1));
		int imag1 = Integer.parseInt(complex1.substring(pos1+1));
		
// FOR 2ND COMPLEX NUMBER
		int real2 = Integer.parseInt(complex2.substring(0,pos1));
		int imag2 = Integer.parseInt(complex2.substring(pos2+1));
		
		
// We use Integer.ParseInt(if we give string, it will convert the string values into integer value)
		
		int sumreal = real1+real2;
		int sumimag = imag1+imag2;
	
		System.out.println(sumreal+ "+" +sumimag+ "i");
		

		
		
		
		
	}
}
