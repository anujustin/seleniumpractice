// Write a Java program to test if an array contains a specific value.// Write a Java program to find the index of an array element.
package practice1;

public class ArraySpecificValue {

	public static void main(String[] args) {
		char a[]= {'a','b','c','d','e','f','g'};
		for(int i=0;i<a.length;i++) {
			if((a[i])=='d') {
				System.out.println("Element found: "+a[i]);
				System.out.println("Element is present");
				System.out.println("Index position of array element: "+i);
			}
		}
	}

}
