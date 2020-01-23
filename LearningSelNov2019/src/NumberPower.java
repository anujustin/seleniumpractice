// # 2) Two numbers are entered through the keyboard. Write a program to find
// the value of one number raised to the power
// # of another.


package practice1;

import java.util.Scanner;

public class NumberPower {

	public static void main(String[] args) {
		int i,j,x=1;
		System.out.println("Enter the base number1:");
		Scanner input=new Scanner(System.in);
		i=input.nextInt();
		System.out.println("Enter the exponent number2:");
		j=input.nextInt();
		
		while(j!=0) {
			x=x*i;
			j--;
		}
		System.out.println(x);
	}

}
