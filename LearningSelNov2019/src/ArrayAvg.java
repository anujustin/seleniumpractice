// Write a Java program to calculate the average value of array elements.
package practice1;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		int a[];
		a=new int[10];
		int sum=0;
		int avg;
		System.out.println("Enter the array values:");
		Scanner input=new Scanner(System.in);
		for (int i=0;i<a.length;i++) {
			a[i]=input.nextInt();
		}
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		avg=sum/a.length;
		
	System.out.println("Average of array: "+avg);
			
	}

}
