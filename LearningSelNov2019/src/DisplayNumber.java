// # 3) Write a program to enter the numbers till the user wants and
// # at the end it should display the count of positive, negative and
// # zeros entered.


package practice1;

import java.util.Scanner;

public class DisplayNumber {

	public static void main(String[] args) {
		int i,j,k,l,m,n,count,pcount=0,ncount=0,zerocount=0;
		int a[];
		System.out.println("Enter the count of numbers:");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		a=new int[count];
		System.out.println("Enter the numbers:");
		
		for(i=0;i<count;i++){
	    a[i]=input.nextInt();
		
		}
		for(i=0;i<count;i++){
		    if (a[i]>0) {
		    	pcount++;
		 
		    }
		    else if(a[i]==0){
		    	zerocount++;
		    }
		    else
		    {
		    	ncount++;
		    }
		    
			}	
		System.out.println("postive numbers: "+pcount);
	    System.out.println("negative numbers: "+ncount);
	    System.out.println("No of zeroes: "+zerocount);
		}
	}

