package chap06;
class Person{
	String name = "���";
	
	void whoami() {
		System.out.println("���� ����̴�.");
	}
}
class Student extends Person{
	int number = 7;
	void work() {
		System.out.println("���� �����Ѵ�.");
	}
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		Student s = new Student();
		Person p = s;
		
		Student s1 = (Student) p;
		
		
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
//		System.out.println(p instanceof Student);
		
		
		downcast(s);
			
		}
	static void downcast(Person p) {
		if(p instanceof Student) {
			Student s = (Student) p;
			System.out.println("������, ���� Ÿ�� ��ȯ");
		}else {
			System.out.println("Ÿ�� ��ȯ �Ұ�");
		}
	
	}

}