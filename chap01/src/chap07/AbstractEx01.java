package chap07;

abstract class Shape{ // 추상클래스는 완성이 안된 클래스
	double pi = 3.14;
	
	abstract void draw();
	
	public double findArea() {
		return 0.0;
	}
}
class Circle extends Shape {
	int radius ;
	Circle(int radius){
		this.radius = radius;
	}
	void draw() { // 추상 메소드인 draw를 반드시 써야함
		System.out.println("원을 그린다.");
	}
	public double findArea() {
		return pi*radius*radius;
	}
}
class Rectangle extends Shape {
	int w;
	int h;
	Rectangle(int w , int h){
		this.w = w;
		this.h = h;
	}
	void draw() {
		System.out.println("사각형을 그린다.");
	}
	public double findArea() {
		return w*h;
	}
}
class Triangle extends Rectangle { 
//	int w , h;    Shape 말고 Rectangle 을 상속받는다면 주석처리한 부분들은 필요없고 super 추가
	Triangle(int w , int h){
		super(w,h); // 조상을 갔다와라 
//		this.w = w;
//		this.h = h;
	}
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
	public double findArea() {
		return (w*h)/2.0;
	}
	
}
public class AbstractEx01 {

	public static void main(String[] args) {
//		Shape s = new Shape(); 할수없다 추상 클래스는 인스턴스 못만든다.
		Circle c = new Circle(3);
		
		c.draw();
		System.out.printf("원의 넓이는 : %.1f\n",c.findArea());
		
		Rectangle r = new Rectangle(3,4);
		r.draw();
		System.out.printf("사각형의 넓이는 : %.1f\n",r.findArea());
		
		Triangle t = new Triangle(3,4);
		t.draw();
		System.out.printf("삼각형의 넓이는 : %.1f\n",t.findArea());
		
	}

}
