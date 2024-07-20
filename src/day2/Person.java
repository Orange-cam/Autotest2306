package day2;

public class Person {

	public static int a, b;
	public static void main(String[] args) {
		System.out.println("Ho va ten: Cam Dang");
		System.out.println("So dien thoai: 090909090909");
		System.out.println("Email: Cam@gmail.com");
		a = 1123;
		b = 6745;
		int result = (a + b)/500;
		System.out.println(a);
		System.out.println(b);
		System.out.println("(a + b)/500 = " + result);
		printLargerNumber(a,b);
	}
	

		
	public static void printLargerNumber(int number1, int number2) {
		if (number1 > number2)
			System.out.println("So lon hon la: " + number1);
		else
			System.out.println("So lon hon la: " + number2);
	}
}