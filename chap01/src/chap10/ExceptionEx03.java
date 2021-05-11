package chap10;

public class ExceptionEx03 {

	public static void main(String[] args) {
		int dividend= 10;
		
		try { //try ����ο��� ���ܰ� �߻��� catch �� �ذ�
		int divisor= Integer.parseInt(args[0]);
		System.out.println(dividend / divisor);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		}catch(NumberFormatException e) { // Run configurations �� argument�� abc �Է������� ���� ����
			System.out.println("���ڰ� �ƴմϴ�.");
		}catch(ArithmeticException e) { // argument�� 0 �Է½�
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}catch(Exception e) {
			System.out.println("��Ÿ �� �� ���� ���� �Դϴ�.");
		}finally {
			System.out.println("�׻� ����˴ϴ�.");
		}
		
	}

}
