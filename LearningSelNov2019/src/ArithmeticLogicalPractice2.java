// Take 2 number as input and perform all arithmetic/logical operation on
// that
public class ArithmeticLogicalPractice2 {

	public static void main(String[] args) {
	int a=60;
	int b=50;
	int c;
	boolean d;
	c=a*b;
	System.out.println("Multiplication output: a*b= "+c);
	c=a+b;
	System.out.println("Addition output: a+b= "+c);
    c=a-b;
    System.out.println("subtraction output: a-b= "+c);
    c=a/b;
    System.out.println("Division output: a/b= "+c);
    c=a%b;
    System.out.println("Modules output: a%b= "+c);
    System.out.println((a!=b));
    System.out.println(((a>b)&&(b>c)));
    System.out.println(((a>b)||(b>c)));
	
	}

}
