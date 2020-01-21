// # 4) If cost price and selling price of an item is input through the
// keyboard, write a program to determine whether the seller has
// # made profit or incurred loss. Also determine how much profit he made or
// loss he incurred.

import java.util.Scanner;

public class ProfitLossP4 {

	public static void main(String[] args) {
		float cp,sp,p;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the cost price:");
		cp=input.nextFloat();
		
		System.out.println("Enter the selling price:");
		sp=input.nextFloat();
		
		p=sp-cp;
		if(p>0) {
			System.out.println("seller had a profit of:"+p+"$");
		}
		else
			{
			System.out.println("seller had a loss of:"+p+"$");
			}
	}

}
