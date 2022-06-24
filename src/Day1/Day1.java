package Day1;

import java.util.Scanner;

public class Day1 {
	private static Scanner input;

	// Ex1
	public static void printString(String x) {
		System.out.println(x);
	}

//Ex2
	public static void printString1(String a, String b, String c, String d) {
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
	}

//Ex3
	public static void printstring2(int a, double d, double c) {
		System.out.println(a + "\n" + d + "\n" + c);

	}

//EX4
	public static void distance() {
		input = new Scanner(System.in);
		System.out.print("Input distance in meters:");
		double meters = input.nextDouble();
		System.out.print("Input hour:");
		double hours = input.nextDouble();
		System.out.print("Input minutes:");
		double minutes = input.nextDouble();
		System.out.print("Input seconds:");
		double seconds = input.nextDouble();
		double result = (hours * 3600) + (minutes * 60) + seconds;
		System.out.println("Your speed in meters/second is " + (meters / result));
		System.out.println("Your speed in km/h is " + (meters * 3600) / (result * 1000));
		System.out.println("Your speed in miles/h is " + (meters / result) * (3600 / 1000) * (1 / 1.069));
	}

//Ex5
	public static void Tinhtoan() {
		input = new Scanner(System.in);
		System.out.print("Input 1st integer: ");
		int mot = input.nextInt();
		System.out.print("Input 2nd integer: ");
		int hai = input.nextInt();
		int sumresult = mot + hai;
		int averageresult = (mot + hai) / 2;
		int diferrenceresult = (mot - hai);
		int productresult = (mot * hai);
		System.out.println("Sum of two integers:" + sumresult);
		System.out.println("Average of two integers:" + averageresult);
		System.out.println("Difference of two integers:" + diferrenceresult);
		System.out.println("Product of two integers:" + productresult);

		if (mot > hai)// Max
		{
			System.out.println("Max integer:" + mot);
		} else {
			System.out.println("Max integer:" + hai);
		}
		if (mot > hai)// Min
		{
			System.out.println("Min integer:" + mot);
		} else {
			System.out.println("Min integer:" + hai);
		}
	}

//Ex6
	public static void convertCelcius() {
		input = new Scanner(System.in);
		System.out.print("Input a degree in Fahrenheit:");
		double F = input.nextDouble();
		double C = ((F - 32) * 5) / 9;
		System.out.println(F + " degree Fahrenheit is equal to " + C + " Celsius");
	}

//Ex7
	public static void convertMeter() {
		input = new Scanner(System.in);
		System.out.print("Input a value for inch:");
		double Inch = input.nextDouble();
		double Meter = 0.0254 * Inch;
		System.out.println(Inch + " inch is " + Meter + " meters");
	}

//Ex8
	public static void sumNumber() {
		int number, balance;
		int sum = 0;
		input = new Scanner(System.in);

		System.out.print("Nhập vào số nguyên dương <=1000: ");
		number = input.nextInt();

		while (number < 0 || number > 1000) {
			System.out.print("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
			number = input.nextInt();
		}

		while (number > 0) {
			balance = number % 10;// chia lấy phần dư
			sum = sum + balance;
			number = number / 10;// chia lấy phần nguyen
		}

		System.out.println("Tổng các chữ số = " + sum);
	}

//Ex9
	public static void sumDigits() {
		System.out.print("Input six non-negative digits: ");
		int dayso = input.nextInt();
		int n1 = dayso / 100000 % 10;
		int n2 = dayso / 10000 % 10;
		int n3 = dayso / 1000 % 10;
		int n4 = dayso / 100 % 10;
		int n5 = dayso / 10 % 10;
		int n6 = dayso % 10;
		System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
	}
}