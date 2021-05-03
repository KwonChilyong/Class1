package chap07;

abstract class Shape{ // �߻�Ŭ������ �ϼ��� �ȵ� Ŭ����
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
	void draw() { // �߻� �޼ҵ��� draw�� �ݵ�� �����
		System.out.println("���� �׸���.");
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
		System.out.println("�簢���� �׸���.");
	}
	public double findArea() {
		return w*h;
	}
}
class Triangle extends Rectangle { 
//	int w , h;    Shape ���� Rectangle �� ��ӹ޴´ٸ� �ּ�ó���� �κе��� �ʿ���� super �߰�
	Triangle(int w , int h){
		super(w,h); // ������ ���ٿͶ� 
//		this.w = w;
//		this.h = h;
	}
	void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
	public double findArea() {
		return (w*h)/2.0;
	}
	
}
public class AbstractEx01 {

	public static void main(String[] args) {
//		Shape s = new Shape(); �Ҽ����� �߻� Ŭ������ �ν��Ͻ� �������.
		Circle c = new Circle(3);
		
		c.draw();
		System.out.printf("���� ���̴� : %.1f\n",c.findArea());
		
		Rectangle r = new Rectangle(3,4);
		r.draw();
		System.out.printf("�簢���� ���̴� : %.1f\n",r.findArea());
		
		Triangle t = new Triangle(3,4);
		t.draw();
		System.out.printf("�ﰢ���� ���̴� : %.1f\n",t.findArea());
		
	}

}
