// # 2) The marks obtained by a student in 5 different subjects are input
// through the keyboard. The student gets a
// # division as per the following rules: Percentage above or equal to 60 -
// First division
// # Percentage between 50 and 59 - Second division
// # Percentage between 40 and 49 - Third division
// # Percentage less than 40 - Fail
// # Write a program to calculate the division obtained by the student

import java.util.Scanner;


public class StudentMarksP2 {

	public static void main(String[] args) {
		int m1,m2,m3,m4,m5;
	
		String sname;
		Scanner name=new Scanner(System.in);
		System.out.println("Enter Student name:");
		sname=name.next();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Subject1 marks:");
		m1=input.nextInt();
		System.out.println("Enter Subject2 marks:");
		m2=input.nextInt();
		System.out.println("Enter Subject3 marks:");
		m3=input.nextInt();
		System.out.println("Enter Subject4 marks:");
		m4=input.nextInt();
		System.out.println("Enter Subject5 marks:");
		m5=input.nextInt();
		int tm=m1+m2+m3+m4+m5;
	
		double p=((tm*100)/250);
		
		if(p>=60)
		{
		System.out.println("Student "+sname+" assigned with first division");
	}
		else if((p>=50)&&(p<=59))
		{
		System.out.println("Student "+sname+" assigned with second division");
	}
		else if((p>=40)&&(p<=49))
		{
		System.out.println("Student "+sname+" assigned with third division");
	}
		else
			System.out.println("Student "+sname+" failed");

 }
	
}

	
