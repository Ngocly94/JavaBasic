package Day4_5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Day4 {
	private static Scanner input;

	// Day 1– Java language

	// Bài 2
	public static void inChuoi(String x, String y) {
		System.out.println(x);
		System.out.println(y);

	}

	// Bài 3
	public static void intergerN() {
		input = new Scanner(System.in);

		System.out.print("Input n: ");
		int n = input.nextInt();
		if ((n > 0 && n % 2 == 1) || (n >= 6 && n <= 20 && n % 2 == 0)) {
			System.out.println("Weird");
		}
		if (((n >= 2 && n <= 5) || n > 20) && n % 2 == 0) {

			System.out.println("Not Weird");
		}
	}

	// Bài 4
	public static void multiX() {
		// Viết 1 hàm in ra giá trị n*i, trong đó n là 1 số cho trước, i =1,2..10. Gọi
		// hàm này bằng cách sử dụng hàm main().
		input = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = input.nextInt();
		int multi = 0;
		for (int i = 1; i <= 10; i++) {
			multi = n * i;
			System.out.println(multi);
		}
	}

	// Day 3 – Data Structure – mảng 1 chiều, mảng 2 chiều,
	// Bài 5: Viết 1 hàm in ra size của mảng 1 chiều: int [] arr = {1, 2, 3, 4, 5,
	// 6};
	public static void array1() {
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Kích thước của mảng: " + array1.length);
	}

	// Bài 6 Dùng for, in ra toàn bộ giá trị của mảng int [] arr = {1, 2, 3, 4, 5,
	// 6};
	public static void array2() {
		int[] array2 = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

	// Bài 7: Viết 1 method chứa đoạn code:
	public static void number() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < 9; i++) {
			System.out.println(numbers[i]);
		}
		// Bài 8
	}

	// HOMEWORK
	// I – Java basic
	// Bài 9
	public static void print1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	// Bài 10

	// Bài 11
	public static void convert() {
		String a = "20";
		Integer a1 = Integer.valueOf(a);
		System.out.println(a1);
	}
	
	// Bài 12
	public static void averagePrice() {
		int a = 120000;//pc
		int b = 150000;//laptop
		int c = 200000;//projection
		int average = (a+b+c)/3;
		System.out.println(average);
}
	// II – Condition statements
	
	
	// III – Loop
	// Bài 14
	public static void loop1() {
	 for(int i=0; i<=6;i++){
		 for(int j=6; j>=i;j--){
		 System.out.print("*");
		 }
		 System.out.println();
		 }
		 }
	
	// Bài 15
	public static void loop2() {
		for (int i = 1; i <= 3; i++) {
		    for (int j = 1; j <= i; ++j) {
		        System.out.print(j);
		    }
		    for (int k = 7 - i; k >= 1; k--) {
		        System.out.print("*");
		    }
		    System.out.println("");
		}
			 }
	// Bài 16 - chưa ra kết quả chính xác
	private static void While(boolean chooseAnswer) {
	}

	public static void chooseAnswer() {
		String question = "What is the command keyword to exit a loop in Java?\n";
		question += "a. int \n";
		question += "b. continue \n";
		question += "c. break \n";
		question += "d. exit \n";
		String answer = JOptionPane.showInputDialog(question);
		answer = answer.toUpperCase();
		int answerCorrect = 0;
		
		 While (answerCorrect==0);{
			if(answer.equals("D")) {
				answerCorrect=1;
				JOptionPane.showMessageDialog(null,"Correct");
			}
			if (answer.equals("A")||answer.equals("B")|| answer.equals("C")) {
				JOptionPane.showMessageDialog(null,"Incorrect");
			}
			else 
				JOptionPane.showMessageDialog(null,"Not a valid selection");
		}
	}



}