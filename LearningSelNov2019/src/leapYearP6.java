// # 6) Any year is input through the keyboard. Write a program to determine
// whether the year is a leap year or not.

import java.util.Scanner;

public class leapYearP6 {

	public static void main(String[] args) {
		int year;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=input.nextInt();
		if((year%4)==0) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not an leap year");
		}
	}

}
