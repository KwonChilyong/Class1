package chap04;

public class ClassEx04 {
	static double radius; // �ʵ� , static�� �տ� ������ main ���� ������������ 
						  // �������� radius �� �ҷ��� static�� �ϳ����� ���� �����Ѵٴ� ����.
						  // ���� ���߿� �� ���� �����ϴ°� ����.
	
	static double findArea() {  // �޼ҵ� 
		return 3.14*radius*radius;
	}
	
	static void show(double x, double y) { //�޼ҵ�
		System.out.printf("������ = %.1f , ���� = %.1f\n", x, y);
	}
	public static void main(String[] args) { 
		ClassEx04 c = new ClassEx04(); 
		c.radius = 10.0; // ���� class �ȿ� �ֱ⶧���� �ٷ� ȣ�� ����.
		c.radius = 20.0;
		double area = findArea();
		
		
		
		ClassEx04 c1 = new ClassEx04();
		c1.radius = 30.0;
		c.show(radius, area);
		c1.show(radius, area);

	}

}
