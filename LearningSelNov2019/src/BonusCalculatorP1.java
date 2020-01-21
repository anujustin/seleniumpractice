// # 1)The current year and the year in which the employee joined the
// organization are entered through the keyboard. If the number of years for
// which the employee has
// # served the organization is greater than 3 then a bonus of Rs. 2500/- is
// given to the employee. If the years of service are not greater
// # than 3, then the program should do nothing.

import java.util.Scanner;

public class BonusCalculatorP1 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter Employee name: ");
		String name = input1.next();
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter current year: ");
		int cy = input2.nextInt();
		System.out.print("Enter joining year: ");
		int jy = input2.nextInt();
		if((cy-jy)>3) {
			System.out.println("Bonus of Rs.2500 awarded to "+name);
		}
		else
			System.out.println("No bonus awarded to "+name);
			
	}

}
