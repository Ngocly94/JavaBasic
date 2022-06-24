package Day4_5;

public class Animal1 {
	public String name;
	public String color;
	public int height;
	public int wide;
//Khi dùng constructor, tên hàm trùng với tên class
	public Animal1() {
		name = "chó";
		color = "đen";
		height = 20;
		wide = 10;
	}

public Animal1 (String constructorName, String constructorColor,int constructorHeight, int constructorWide ) {
	 name= constructorName;
	 color=constructorColor;
	 height=constructorHeight;
	 wide=constructorWide;
}

	public void shout() {
		System.out.println("Heloo!! I'm " + this.name);
		System.out.println("I'm shouting!!!");

	}

	public void run() {
		System.out.println("I'm running");
	}
}
