package chap04;
class St {
	int no;             // �ʵ���̴�. �ʵ�� ������ �ڵ� �ʱ�ȭ�� �̷����.
	String name;
	int age;
	
	void print() {
		int k; // �������� 
		System.out.println("no : " + no + ", name : " + name + ", age : " + age );
	}
}

public class ClassEx03 {
//	static int number = 10; // Ŭ������ ���ذ� �ʵ�
	public static void main(String[] args) {
		int n; // �޼ҵ忡 ���ذ� ��������, ���������� �ڵ��ʱ�ȭ �ȵ�.
//		System.out.println(number);
		St s = new St();
		n = 20;
//		no = 1; �ʵ���� �״�� ���� �ȵǰ� s. �ٿ������
		s.no = 1;
		s.name = "ȫ�浿";
		s.age = 30;
		s.print(); //�޼ҵ嵵 s. ����
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(n);
		
		for(int i = 0; i < 5; i++) {
			int k = 10; // �Ź� �����Ǳ� ������ ��� 10
			System.out.println("k : " + k);
			System.out.println("n : " + n);
			k++;
			n++;
		}
	}

}
