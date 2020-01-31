//6) Write
// * a Java program to test if a given string contains the specified sequence of
// * char values. match starting index


//public class StringSequenceFind {

//	public static void main(String[] args) {
//		//int count=0;
//		String x="LALALALA";
//		//int i=0;
//		//while(i<(x.length())) {
//			
//		
//			if(x.contains("LA")) {
//				System.out.println("The sequence is present");
//				//count++;
//			//};
//			//i++;
//			
//		}
//		
//		
//	}
	
	package practice1;

import java.util.Scanner;

public class StringSequenceFind {
		public static void main(String[] args) {
		String x="LLALLALL";
		System.out.println("Enter the sequence need to find:");
		Scanner input=new Scanner(System.in);
		String substr=input.next();
		int i=x.indexOf(substr);
		System.out.println(i);
		if(i<0) {
			System.out.println("substring is not present");
		}
		else {
			System.out.println("substring is present");
		}
		
		
}
}