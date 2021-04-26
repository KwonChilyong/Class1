package chap04;
class Circle {
	private double radius; // private = ĸ��ȭ (����ȭ), ���� class �������� ���ٰ���
	                       // �ܺ��� Ŭ������ �޼ҵ忡���� ���� �ȵ�.
						   // �ܺ��� Ŭ�������� �����ϱ� ���ؼ��� get,set �ʿ�
	
	Circle() {
		
	}          // ������ �ڵ����� �����Ǵµ� �ٸ� �����ڰ� �����Ѵٸ� ����������.
			   // ������ ������ �տ� public �����ص� �ȴ�.
	Circle(double radius) {
		this.radius = radius;  
	}                         // ������ �����ε� (�Ȱ��� �̸��� �����ڸ� ����)
	
	public void setRadius(double radius) {
		if(radius > 0 ) {
		this.radius = radius; // this. ���̸� ���� class�� �ʵ�
		}else {
			System.out.println("�������� 0���� ū���� �Է��Ͻÿ�");
			return;
		}
			//priavte ������ set �κп� ���������� �ִ°͵� ���
	}
	
	public double getRadius() {
		return radius;
	}
	//private ���� �ݵ�� get,set ���������Ѵ�. ���콺 ��Ŭ��, source �� �ִ� 
	public double findArea() {
		return 2.14 * radius * radius;
	}


}
public class PrivateEx01 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(3.5); 
//		c1.radius = 2.5;
//		System.out.println(c1.radus); 
		
		c1.setRadius(2.5);  // �ܺο��� �����Ϸ��� private Ŭ���� ���� �޼ҵ带 �������� ���ٰ���
		System.out.println(c1.findArea());
		System.out.println(c1.getRadius());
		
		System.out.println(c2.findArea());
		System.out.println(c2.getRadius());
	}

}
