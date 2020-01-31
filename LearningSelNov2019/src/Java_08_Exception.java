package practice1;

public class Java_08_Exception {
	public static void main(String[] args) {
		int a = 10;
		int b = a / 0;
		System.out.println(b);
		System.out.println("Java exception");// ArithmeticException: / by zero
	}
}
// =====================
// public class Java_08_Exception {
// public static void main(String[] args) {
// String s = null;
// System.out.println(s.length());// NullPointerException
// System.out.println("Java exception");
// }
// }

// =========================
// public class Java_08_Exception {
// public static void main(String[] args) {
// String s = "123";
// int y = Integer.parseInt(s);
// System.out.println(y);// NumberFormatException }
// }
// }
// =============================
// public class Java_08_Exception {
// public static void main(String[] args) {
// String s = "abc123";
// int y = Integer.parseInt(s);
// System.out.println(y);// NumberFormatException }
// }
// }

// ================================
// public class Java_08_Exception {
// public static void main(String[] args) {
// int a[] = new int[5];
// a[10] = 100;
// System.out.println(a[10]);
// }
// }
// ==========================

// Try catch

/// *

// =====================
// public class Java_08_Exception {
//
// public static void main(String[] args) {
//
// int a = 10;
// int b = 0;
// int result;
// try {
// result = a / b;
// System.out.println(result);
// } catch (ArithmeticException e) {
// System.out.println("Divided by Zero Error");
// }
// System.out.println("Hello Java");
// System.out.println("Hello Selenium");
// }
// }

// =========================================

// public class Java_08_Exception {
// public static void main(String[] args) {
// //
// int a = 10;
// int b = 0;
// int result;
// try {
// result = a / b;
// System.out.println(result);
// } catch (ArithmeticException c) {
// c.printStackTrace();
// System.out.println("Divided by Zero Error");
// }
// System.out.println("Hello Java");
// System.out.println("Hello Selenium");
// }
// }
// ==============================
// public class Java_08_Exception {
// public static void main(String[] args) {
//
// int a = 10;
// int b = 0;
// int result;
// int array1[] = new int[4];
// try {
// result = a / b;
// System.out.println(result);
// } catch (ArithmeticException e) {
// System.out.println("Divided by Zero Error");
// }
// try {
// array1[10] = 100;
// System.out.println(array1[10]);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Array Out of Bound Error");
// }
// System.out.println("Hello Java");
// System.out.println("Hello Selenium");
// }
// }

//// ============================
// public class Java_08_Exception {
// public static void main(String[] args) {
//
// try {
// int data = 25 / 0;
// System.out.println(data);
// } catch (Exception e) {
// System.out.println("abcd");
// e.printStackTrace();
// }
// System.out.println("rest of the code...");
// }
// }
// =========================
// public class Java_08_Exception {
// public static void main(String[] args) {
// try {
// int data = 25 / 5;
// System.out.println(data);
// } catch (ArithmeticException e) {
// System.out.println(e);
// } finally {
// System.out.println("finally block is always executed");
// }
// System.out.println("rest of the code...");
// }
// }
// ===========================
// Finally block will be executed even if we do not handle the particular
//// exception

// public class Java_08_Exception {
// public static void main(String[] args) {
// try {
// int data = 25 / 0;
// System.out.println(data);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("error");
//
// } finally {
// System.out.println("finally block is always executed");
// }
//
// System.out.println("rest of the code...");
//
// System.out.println("rest of the code...");
//
// }
// }

// =======================
// public class Java_08_Exception {
// public static void main(String[] args) {
// try {
// int age = 10;
// if (age < 18) {
// throw new Exception();
// }
// } catch (Exception e) {
// System.out.println(e);
// }
// try {
// int age = 10;
// if (age < 18) {
// throw new NullPointerException();
// }
// } catch (NullPointerException e) {
// System.out.println(e);
// }
// try {
// throw new IOException();
// } catch (IOException e) {
//
// e.printStackTrace();
// }
// }
// }

// ================================
//throw is to create new exception
// public class Java_08_Exception {
//
// public static void main(String[] args) {
//
// try {
// validate(10);
// } catch (ArithmeticException e) { //
// e.printStackTrace();
// System.out.println("welcome to exception");
// }
// }
//
// static void validate(int age) {
// if (age < 18)
// throw new ArithmeticException("not valid");
// else
// System.out.println("welcome to vote");
// }
// }

// ==============================
//
//class Java_08_Exception {
//	public static void main(String args[]) {
//		try {
//			int a = 1;
//			System.out.println("a = " + a);
//			int b = 42 / a;
//			int c[] = { 1 };
//			c[42] = 99;
//		} catch (ArithmeticException e) {
//			System.out.println("Divide by 0: " + e);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array index oob: " + e);
//		}
//		System.out.println("After try/catch blocks.");
//	}
//}

// ======================================
// The Java throws keyword is used to declare an exception. It gives an
// information to the programmer
// that there may occur an exception so it is better for
// the programmer to provide the exception handling code so that normal flow can
// be maintained.
// We can use throws keyword to delegate the responsibility of exception
// handling to the caller (It may be a method or JVM) then caller method is
// responsible to handle that exception.
// throws

// throws is a keyword in Java which is used in the signature of method to
// indicate that this method might throw
// one of the listed type exceptions. The caller to these methods has to handle
// the exception using a try-catch block.

// Java program to illustrate error in case
// of unhandled exception
// class O8Exception {
// public static void main(String[] args) {
// Thread.sleep(10000);
// System.out.println("Hello world");
// }
// }

// Explanation : In the above program, we are getting compile time error because
// there is a chance of exception if
// the main thread is going to sleep, other threads get the chance to execute
// main() method which will cause InterruptedException.

// ---------------------
//
// class A0008_Exception {
// public static void main(String[] args) throws InterruptedException {
// System.out.println("Hello java");
// Thread.sleep(10000);
// System.out.println("Hello selenium");
// }
// }

// =====================
//
// class O8Exception {
// public static void main(String[] args) {
// try {
// int x = 300;
// } catch (Exception e) {
// System.out.println(e);
// } finally {
// System.out.println("finally block is executed");
// }
// }
// }

// =============

// class O8Exception {
// public void finalize() {
// System.out.println("finalize called");
// }
//
// public static void main(String[] args) {
// O8Exception f1 = new O8Exception();
// O8Exception f2 = new O8Exception();
// f1 = null;
// f2 = null;
// System.gc();
// }
// }
// =====================

// class O8Exception {
// public static void main(String args[]){
// int i = 0, j=10;
// try{
// j /=i;
// }
// System.out.print("Divide by Zero! ");
// catch(Exception e){
// System.out.print("error");
// }
// }
// }

/*
 * You can't enter code between try and catch clause. Here line 7 causes the
 * failure. So the answer is E, if you remove line 7 then code will compile fine
 * and provide output as error so in that case answer would be D
 */