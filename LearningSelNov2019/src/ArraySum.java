//// Write a Java program to sum values of an array.

package practice1;

public class ArraySum {

	public static void main(String[] args) {
		int sum=0;
	int a[]= {5,5,5,5,5};
	for(int i=0;i<a.length;i++) {
		sum=a[i]+sum;
	}
	System.out.println("sum of array: "+sum);
	}

}
