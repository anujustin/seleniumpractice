
// 3) Write a java program to count a character of a
// * String. 
package practice1;

public class Stringcount {

	public static void main(String[] args) {
	int count=0;
		String x="MALAYALAM";
		int i=0;
		while(i<(x.length())) {
			String test=Character.toString(x.charAt(i));
			if(test.contentEquals("A")) {
				count++;
			};
			i++;
			
		}
		System.out.println("count of 'A' : "+count);
	}

}
