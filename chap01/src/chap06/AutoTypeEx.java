package chap06;

class Demo1{
	
}

class Demo2 extends Demo1{
	
}


public class AutoTypeEx {

	public static void main(String[] args) {
		Demo1  d = new Demo1();
		Demo2 d2 = new Demo2();
		Demo1 d1 = new Demo2();  // �θ� Ÿ������ �ڽ�Ÿ�� ���� ����
//		Demo2 d3 = new Demo1();  �ڽ� Ÿ������ �θ�Ÿ���� ���� �Ұ���
		
		d1 = d2; // 
		d = d2;  // ��ü �ڵ� ����ȯ.
	}

}
