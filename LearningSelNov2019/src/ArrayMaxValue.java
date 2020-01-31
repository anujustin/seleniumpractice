package practice1;

import java.util.Scanner;

public class ArrayMaxValue {

	public static void main(String[] args) {
		int a[]=new int[5];
		int temp;
		System.out.println("Enter the numbers:");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i]=input.nextInt();
		}
		temp=a[0];
		for(int i=1;i<5;i++) {
		
			if(a[i]>temp) {
				temp=a[i];
			}
			
		}
		System.out.println("Max value of array:"+temp);
	}

}
