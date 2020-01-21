// # 5) Any integer is input through the keyboard. Write a program to find out
// whether it is an odd number or even number.

import java.util.Scanner;

public class OddEvenP5 {

	public static void main(String[] args) {
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the integer:");
		i=input.nextInt();
		if((i%2)==0){
			System.out.println(i+" is an even number");
		}
		else
			System.out.println(i+" is an odd number");

	}

}
