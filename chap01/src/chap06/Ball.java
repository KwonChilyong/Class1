package chap06;

public class Ball extends Circle {
	private String color;
	
	public Ball(String color) {
		this.color = color;
	}
	
	@Override   // �� ���ʿ� ������ �޼ҵ�� �θ� Ŭ������ �޼ҵ带 �������̵� �Ѱ� �̶�� ǥ��
	public void findArea() {
		findRadius(); // protected�� ��ӹ��� �ڽ��� ����
		super.findArea(); // �������̵��ϸ� �θ� Ŭ������ �������̵��� �޼ҵ带 ����
		                  // �̶� ������ �޼ҵ带 �ٽ� ȣ���Ҷ� super ���
//		super.secret(); error �� secret �޼ҵ� �� private �� ȣ�� ����
		
		System.out.println("���̴� (��*������*������*������)�̴�.");
	} //��� �����Ÿ� ��ġ�°� �������̵�.
	
	public void findColor() {
		System.out.println(color + " ���̴�.");
	}
	
	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(��*������*������*������)�̴�.");
	}
}
