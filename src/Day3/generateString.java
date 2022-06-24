package Day3;

public class generateString {
//public static void A() {
//	String randomString = usingMath();
//	System.out.println("Random string is: " + "Lê Yến Ngọc " + randomString);
//}
//
//private static String usingMath() {
//    String numbers = "0123456789"; 
//    StringBuffer randomString = new StringBuffer(); 
//    for (int i = 0; i < 1; i++) { 
//    	
//    int randomIndex = (int)(Math.random() * numbers.length());
// 
//    randomString.append(numbers.charAt(randomIndex));
//   
//}
//    return randomString.toString(); 
//
//  
//}

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
}
