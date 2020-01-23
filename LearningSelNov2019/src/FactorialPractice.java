//1) Write a program to find the factorial value of any number entered
// through the keyboard.

package practice1;

import java.util.Scanner;

public class FactorialPractice {

	public static void main(String[] args) {
		int n,i;
		System.out.println("Enter the number:");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		i=n;
		while(i!=1) {
			i--;
			n=n*i;
			
		}
		System.out.println(n);		
	}

}
