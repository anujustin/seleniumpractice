
//1)Write a Java program to get the character at the given index
package practice1;

public class StringCharotherMethod {


		 public static void main(String[] args) {
		
			 String name="selenium training";
			 char []array= name.toCharArray();
			
			 findElement(array);
			 System.out.println("end of program");
			
			 }
		 
			public static void findElement(char[] x) {
				 for(int i=0;i<x.length;i++) {
						if(i==6) {
							 System.out.println("Selected character:"+x[i]);
						}
						
						 }
			}
				
			}

		 
			 



