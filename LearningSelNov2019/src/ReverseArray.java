// Write a Java program to reverse an array of integer values
//

package practice1;

public class ReverseArray {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	int b[]=new int[7];
	int j=(a.length)-1;
	for(int i=0;i<a.length;i++) {
		b[j]=a[i];
		
		j--;
	}
	System.out.println("Reverse array : ");
	for(j=0;j<a.length;j++) {	
	System.out.print(" "+b[j] );
	}
	}

}
