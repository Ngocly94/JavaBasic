package Day1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//C.Decision Making
		{
		    Scanner input = new Scanner(System.in);
		//Bài 1
		    System.out.print("Input an integer between 0 and 1000: ");
		    int num = input.nextInt();

		    int firstDigit = num% 10;
		    int remainingNumber = num / 10;
		    int SecondDigit = remainingNumber % 10;
		    remainingNumber = remainingNumber / 10;
		    int thirdDigit = remainingNumber % 10;
		    remainingNumber = remainingNumber / 10;
		    int fourthDigit = remainingNumber % 10;
		    int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
		    System.out.println("The sum of all digits in " + num + " is " + sum);

		//Bài 2
		double minutesInYear = 60 * 24 * 365;
		System.out.print("Input the number of minutes: ");
		double min = input.nextDouble();
		long years = (long) (min / minutesInYear);
		int days = (int) (min / 60 / 24) % 365;
		System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
			
		}
		}
}

