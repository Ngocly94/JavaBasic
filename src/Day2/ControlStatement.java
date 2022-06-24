package Day2;

import java.util.Scanner;

public class ControlStatement {
	private static Scanner input;
//Ex1
	public static void sumNumber() {
		int n, sumNum;
		input = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên dương <1000 và > 0: ");
		n = input.nextInt();
		if (n > 0 && n < 10) {
			sumNum = n;
		}
		if (n > 10 && n < 100) {
			sumNum = n / 10 + n % 10;
		} else {
			sumNum = n / 100 + (n/10) % 10 + n % 10;
		}
		System.out.println("Tổng các chữ số = " + sumNum);

	}
//Ex2
	public static void convert() {
		long minutes;
		long year,convertYear,convertDay ;
		input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		minutes=input.nextInt();
		year =60 * 24 * 365;
		if (minutes>0) {
			convertYear = minutes/year;
			convertDay = (minutes%year)/(60*24);
			System.out.print(minutes + " bằng: " + convertYear + " year " + convertDay + " day");
		}
		else {
			System.out.print("Nhập lại");
		}
			
	}
}
