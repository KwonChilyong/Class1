package chap04;
class Phone{
	String model;
	int value;
	
	void print() {
		System.out.println(value + " �� ��¥�� " + model + " ����Ʈ�� ");
	}
}

public class ClassEx02 {

	public static void main(String[] args) {
		Phone myPhone = new Phone(); // ���赵�� �Ӽ��� �ٲٱ� ���� �������� ����.
		myPhone.model = "������ S8"; // model �� String �̴� "" ���
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();

	}

}
