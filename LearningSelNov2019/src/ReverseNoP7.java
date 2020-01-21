import java.util.Scanner;

// # 8) A five-digit number is entered through the keyboard. Write aprogram to
// obtain the revezl
public class ReverseNoP7 {

	public static void main(String[] args) {
        int i,n=0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 5 digit number:");
		i=input.nextInt();
	   
		while(i!=0) {
			n=n*10+(i%10);
			i=i/10;
		}
		System.out.println(n);
			
	}

}
