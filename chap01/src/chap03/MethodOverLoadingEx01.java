package chap03;

public class MethodOverLoadingEx01 {

	public static void main(String[] args) {
		add(10, 20);
		add(10, 23.5);
		add(10.5, 20);
		add(10.5, 20.5);

	}
	
	public static void add(int x, int y) {
		System.out.println((x+y));
	}
	public static void add(int x, double y) {
		System.out.println((x+y));
	}
	public static void add(double x, int y) {
		System.out.println((x+y));
	}
	public static void add(double x, double y) {
		System.out.println((x+y));
	}
}
// �޼ҵ� ���� �� �Ȱ����� �Ű������� Ÿ�� , ���� ������ �ٸ��� �����ε�