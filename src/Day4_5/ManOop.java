package Day4_5;

public class ManOop {
	
public static void main (String [] args) {
	createObject();
	createObjectwConstructor();
	createObjectwConstructorPara();
}
public static void createObject() {
	Animal dog= new Animal(); // Tạo đối tượng
	dog.name = "Chó";
	dog.height= 30;
	dog.color= "đen";
	dog.wide= 10;
	
	Animal cat = new Animal();
	cat.name="Mèo";
	cat.height=10;
	cat.color="vàng";
	cat.wide=5;
	
	dog.shout();
	dog.run();
	
	cat.shout();
	cat.run();
}
public static void createObjectwConstructor() {
	Animal1 dog= new Animal1();
	dog.shout();
	dog.run();
}
public static void createObjectwConstructorPara() {
	Animal1 dog= new Animal1("Chó","đen",20,10);
	dog.shout();
	dog.run();
}
}