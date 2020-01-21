
// # 3) A company insures its drivers in the following cases:
// # If the driver is married.
// # If the driver is unmarried, male & above 30 years of age.
// # If the driver is unmarried, female & above 25 years of age.
// # In all other cases the driver is not insured. If the marital status, sex
// and age of the driver are the inputs, write a program to determine
// # whether the driver is to be insured or not.

import java.util.Scanner;

public class InsuranceP3 {

	public static void main(String[] args) {
		String gender;
		int age;
		String mstatus;

		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Enter the age of driver:");
		age=input.nextInt();
	
		System.out.println("Enter the gender of the driver:");
		gender=input.next();
		
		System.out.println("Enter the marital status of the driver:");
		mstatus=input.next();
	
		//if(mstatus=="married")
		if(mstatus.equals("married"))
			System.out.println("driver is insured");
		
		else if((gender.equals("M"))&&(age>30))
			
			    System.out.println("driver is insured");
		      
		 else if((gender.equals("F"))&&(age>25))
			System.out.println("driver is insured");
		     
		     else 
			System.out.println("driver is not insured");

		
	}

}
//output incorrect
//Enter the age of driver:
//30
//Enter the gender of the driver:
//M
//Enter the marital status of the driver:
//married
//mstatus is -married
//driver is not insured
