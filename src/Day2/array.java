package Day2;

import java.util.Scanner;

public class array {

public static void gradesAverage () {
	Scanner input = new Scanner(System.in);
	System.out.print("Input num of students");
	int numofstudents = input.nextInt();
	
	int grade[]=new int[numofstudents];
	for(int i=0;i<grade.length;i++)
		System.out.println(grade[i]);  
	System.out.print("Input grade");
	
}
}
