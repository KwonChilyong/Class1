package chap06;

class Circle1 {
	int radius;
	
	Circle1(int radius) {
		this.radius = radius;
	}
	void show() {
		System.out.println("반지름이 " + radius +"인 원이다. ");
	}
}

class ColoredCircle extends Circle1 {
	String color;
	
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다." );
	}
}
public class p248Ex01 {

	public static void main(String[] args) {
		Circle1 c1 = new Circle1(5);
		ColoredCircle c2 = new ColoredCircle(10, "빨간색");
		Circle1 c3 = new ColoredCircle(10, "파란색");
		
		c1.show();
		c2.show();
		c3.show();

	}

}
