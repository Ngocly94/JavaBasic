package Day1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
		//B.Operators
		
		//Bài 1
		System.out.print("Input distance in meters: ");
		double meters=input.nextInt();
		System.out.print("Input hour: ");
		double hours=input.nextInt();
		System.out.print("Input minutes: ");
		double minutes=input.nextInt();
		System.out.print("Input seconds: ");
		double seconds=input.nextInt();
		double result=(hours*3600)+(minutes*60)+seconds;
		System.out.println("Your speed in meters/second is "+(meters/result));
		System.out.println("Your speed in km/h is "+(meters*3600)/(result*1000));
		System.out.println("Your speed in miles/h is "+(meters/result)*(3600/1000)*(1/1.069));
		
		//Bài 2
		System.out.print("Input 1st integer: ");
		int mot=input.nextInt();
		System.out.print("Input 2nd integer: ");
		int hai=input.nextInt();
		int sumresult=mot+hai;
		int averageresult=(mot+hai)/2;
		int diferrenceresult=(mot-hai);
		int productresult=(mot*hai);
		System.out.println("Sum of two integers:"+sumresult);
		System.out.println("Average of two integers:"+averageresult);
		System.out.println("Difference of two integers:"+diferrenceresult);
		System.out.println("Product of two integers:"+productresult);
		
		if (mot>hai)//Max
		{
		System.out.println("Max integer:"+mot);
		}
		else {
			System.out.println("Max integer:"+hai);	}
		if (mot>hai)//Min
		{
		System.out.println("Min integer:"+mot);
		}
		else {
			System.out.println("Min integer:"+hai);	}
		
		//Bài 3
		
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

