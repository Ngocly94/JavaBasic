package Day2;

public class Loop {
	
	// Bài 1
	
	public static void sumAndAverage() {
		int sum = 0;
		float average;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		average = (float) sum / 100;
		System.out.println("the sum is " + sum);
		System.out.println("the average is " + average);
	}

    //Bài 2

	public static void sumAndAverage2() {
		int sum = 0;
		int count = 0;
		for (int i = 111; i <= 8899; i++) {
			sum = sum + i;
			count = count + 1;
		}
		System.out.println("the sum is " + sum);
		double average = (double) sum / (double) count;
		System.out.println("The average " + Math.round((average * 100) / 100));
	}

    //Bài 3

	public static void sumAndAverage3() {// Bài 3
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
				count++;
			}
		}
		double average = (double) sum / (double) count;
		System.out.println("The average " + Math.round(average));
	}

	// Bài 4

	public static void Average7() {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
				count++;
			}
		}
		double average = (double) sum / (double) count;
		System.out.println("The average " + Math.round(average));
	}

	// Bài 5

	public static void sumOfSquare() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i * i;
		}
		System.out.println("The sum of square is " + sum);
	}

	// Bài 6

	public static void squareBoard() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
		
	// Bài 7

	public static void checkedBoard() {
		for(int i=0;i<7;i++) {
            for(int j=0;j<14;j++) {
                if((i%2==1 && j%2==1) || (i%2==0 && j%2==0)) {
                    System.out.print("#"); 
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}
	
	// Bài 8
	
	public static void findR() {
		String x = "rHaf";
		int length = x.length();
		int i = 1;
		int j = 0;
		while (i <= length) {
			if (x.charAt(i - 1) == 'r' && j == 0) {
				System.out.print("Tim thay r tai vi tri:  " + i);
				j++;
			}
			i++;
		}
		if (j == 0) {
			System.out.print("Khong tim thay");
		}
	}
}