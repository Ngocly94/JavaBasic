package Day3;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Day3 {
	

	// Ex1 
	public static void random() {
		usingMathClass();
		}
		static void usingMathClass() {
		    //Vòng lặp in ra 5 số ngẫu nhiên
		    for (int i=0; i<1; i++) {
		        double randomDouble = Math.random();
		        randomDouble = randomDouble * 7000 + 1;
		        int randomInt = (int) randomDouble;
		        System.out.println("Random : " + "Lê Yến Ngọc_ " + randomInt);
		    }
	  }


	
	// Ex2
	public static void calender() {
		Calendar cal = Calendar.getInstance();
		System.out.println("Year: " + cal.get(Calendar.YEAR));
		System.out.println("Month: " + cal.get(Calendar.MONTH));
		System.out.println("Day: " + cal.get(Calendar.DATE));
		System.out.println("Hour: " + cal.get(Calendar.HOUR));
		System.out.println("Minute: " + cal.get(Calendar.MINUTE));
	}
    // Ex3
	public static void compareDate() throws ParseException {
		// object of SimpleDateFormat class
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// dates to be compare
		Date date1 = (Date) sdf.parse("2020-07-20");
		Date date2 = (Date) sdf.parse("2020-06-18");
		// prints dates
		System.out.println("Date 1: " + sdf.format(date1));
		System.out.println("Date 2: " + sdf.format(date2));
		// comparing dates
		if (date1.compareTo(date2) > 0) {
			System.out.println("Date 1 comes after Date 2");
		} else if (date1.compareTo(date2) < 0) {
			System.out.println("Date 1 comes before Date 2");
		} else if (date1.compareTo(date2) == 0) {
			System.out.println("Both dates are equal");
		}
	
}
	
	//Ex4 
	public static void date(){
    Date date = new Date(0);
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    dateFormat = new SimpleDateFormat ("dd/MM/yyyy");
    System.out.println("dd/MM/yyyy: " + dateFormat.format(date));
    dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    System.out.println("MM/dd/yyyy: " + dateFormat.format(date));
    dateFormat = new SimpleDateFormat("hh:mm:ss MM/dd/yyyy");
    System.out.println("hh:mm:ss MM/dd/yyyy: " + dateFormat.format(date));
    dateFormat = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy");
    System.out.println("HH:mm:ss MM/dd/yyyy: " + dateFormat.format(date));
    dateFormat = new SimpleDateFormat("HH:mm:ss.SSS MM/dd/yyyy");
    System.out.println("HH:mm:ss.SSS MM/dd/yyyy: " + dateFormat.format(date));
    dateFormat = new SimpleDateFormat("HH:mm:ss");
    System.out.println("HH:mm:ss: " + dateFormat.format(date));

}


}
