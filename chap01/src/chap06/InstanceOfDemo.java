package chap06;
class Person{
	String name = "사람";
	
	void whoami() {
		System.out.println("나는 사람이다.");
	}
}
class Student extends Person{
	int number = 7;
	void work() {
		System.out.println("나는 공부한다.");
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
			System.out.println("오케이, 하향 타입 젼환");
		}else {
			System.out.println("타입 변환 불가");
		}
	
	}

}