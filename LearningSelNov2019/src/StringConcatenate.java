//5) Write a Java program to concatenate a given string to the end of another string.
 //str2=str1.concat(str2);
package practice1;

import java.util.Scanner;

public class StringConcatenate {

	public static void main(String[] args){
		StringBuilder s1 = new StringBuilder("java selenium");
		StringBuilder s2 = new StringBuilder(" is awesome");
		s1.append(s2);
	System.out.println(s1);
}
}