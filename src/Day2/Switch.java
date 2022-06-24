package Day2;

import java.util.Scanner;

public class Switch {
	
// Bài 1
public static void dayOfWeek(int n) {// Nhập n, in thứ trong tuần
	Scanner input = new Scanner(System.in);
	System.out.print("Nhập n :");
    n = input.nextInt();
	
	switch (n) {
		case 1:
			System.out.println("Thứ hai");
		break;
		case 2:
			System.out.println("Thứ ba");
		break;
		case 3:
			System.out.println("Thứ tư");
		break;
		case 4:
			System.out.println("Thứ năm");
		break;
		case 5:
			System.out.println("Thứ sáu");
		case 6:
			System.out.println("Thứ bảy");
		case 7:
			System.out.println("Chủ nhật");
		default :
		System.out.println("Nhập lại n");
			
	}
}

}
