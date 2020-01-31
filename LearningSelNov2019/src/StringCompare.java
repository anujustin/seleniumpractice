// 4)Write a java program to compare two strings .
package practice1;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		System.out.println("Enter string1:");
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		System.out.println("Enter string2:");
		String str2=input.next();
		
		if(str1.contentEquals(str2)) {
			System.out.println("Both strings are same");
		}
		else {
			System.out.println("Both strings are different");
		}

	}

}
