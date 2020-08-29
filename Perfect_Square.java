package java_course;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		
		//1st method
		/*boolean flag=false;
		for(int i=1;i<=number;i++) {
			if(number%i==0 && number/i==i) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("Yes the given number "+number+" is a perfect square");
		}
		else {
			System.out.println("No the given number "+number+" is not a perfect square");
		}
		*/
		
		//2nd method
		double sqrt=Math.sqrt((double)(number));
		if((sqrt-Math.floor(sqrt))==0) {
			System.out.println("Yes the given number "+number+" is a perfect square");
		}
		else {
			System.out.println("No the given number "+number+" is not a perfect square");
		}

	}

}
