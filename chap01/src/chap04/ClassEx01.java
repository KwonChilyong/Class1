package chap04;
class Ball{  // Ŭ����(���赵) ����  , Ŭ����  = �ʵ�+����
	double radius = 2.0;  //Ŭ������ �ʵ� 
	
	double getVolume() {  //Ŭ������ ����
		return 4/3*3.14*radius*radius*radius;
	}
}
public class ClassEx01 { //public class �� �ϳ� ���� ������, class ������� public ���� class��

	public static void main(String[] args) {
		Ball b = new Ball(); // new �� ����� �� Ŭ������ �����ͼ� �����ְ� �Ӽ� �ٲܼ�����.
		Ball b1 = new Ball(); // �̷��� new �� ���� �������� ����������� ��.
		double d;
		d= b.getVolume();
		System.out.println(d);
		b1.radius = 3.5;     // ���� Ŭ�������� �Ӽ��� �ٸ��� �� 
		d = b1.getVolume();
		System.out.println(d);

	}

}
