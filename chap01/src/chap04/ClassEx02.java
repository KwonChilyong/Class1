package chap04;
class Phone{
	String model;
	int value;
	
	void print() {
		System.out.println(value + " 만 원짜리 " + model + " 스마트폰 ");
	}
}

public class ClassEx02 {

	public static void main(String[] args) {
		Phone myPhone = new Phone(); // 설계도의 속성을 바꾸기 위해 참조변수 생성.
		myPhone.model = "갤럭시 S8"; // model 은 String 이니 "" 사용
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();

	}

}
