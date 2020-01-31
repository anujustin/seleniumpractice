// Write a Java program to find the duplicate values of an array of integer
// values.

package practice1;

public class FindArrayDuplicate {

	public static void main(String[] args) {
		int a[]= {4,2,3,2,3,4,5,5};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(i!=j) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate value="+a[j]);
					
				}
			}
		}

	}
}
}

