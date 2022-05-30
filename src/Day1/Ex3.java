package Day1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//Bài 1
		System.out.print("Input a degree in Fahrenheit: ");
		double F=input.nextDouble();
		double C=((F-32)*5)/9;
		System.out.println(F+" degree Fahrenheit is equal to "+ C +" in Celsius");
		
		System.out.print("Input a value for inch:");
		double Inch=input.nextDouble();
		double Meter=0.0254*Inch;
		System.out.println(Inch+" inch is "+ Meter+" meters");
		
		

	}

}
