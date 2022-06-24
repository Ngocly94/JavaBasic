package Day2;

import java.util.Scanner;

// Bài 1
public class method {
	private static Scanner input;

	public static void x() {
		input = new Scanner(System.in);
		System.out.print("Input x:");
		boolean check = isOdd(input.nextInt());
		if (check == true) {
			System.out.print("ODD");
		} else {
			System.out.print("EVEN");
		}
	}

	public static boolean isOdd(int x) {

		if (x % 2 == 1) {
			return true;
		}
		return false;

	}
	
// Bài 2
	public static void hasEight1() {
		input = new Scanner(System.in);
		System.out.print("Input string:");
		boolean check = hasEight(input.nextInt());
		if (check == true) {
			System.out.print("Có 8");
		} else {
			System.out.print("Không có 8");
		}
	}
	
// Bài 3
	public static boolean hasEight(int x) {
		if (String.valueOf(x).contains("8")) {
			return true;
		}
		return false;
	}
	public static void magicSum() {
		int i=0;
        int sum=0;
		while (i!=-1) {
			input = new Scanner(System.in);
			System.out.print("Input number: ");
			i  = input.nextInt();
			if (String.valueOf(i).contains("8")) {
				sum=sum+i;
			}
		}
		System.out.print(sum);
	}
}
