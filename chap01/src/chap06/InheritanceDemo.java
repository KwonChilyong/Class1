package chap06;

class Demo{
	String str;
	void findLength() {
		System.out.println("���� �̴�.");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("������");
		Demo d = new Demo();
		
		d.findLength();
//		d.findRadius();  ������ ����� ���޾Ƽ�.
//		d.findArea();    ���� ����� ���޾Ƽ� ����.
		
		
		
		
		System.out.println("�� : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n�� : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume(); // c2 Ball ���� color,volume ���ε� circle ���� 
		                 // ��ӹ޾Ƽ� �̰� �����Ѱ�

	}

}
