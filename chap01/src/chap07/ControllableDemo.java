package chap07;

class Computer extends Portable implements RemoteControllable {
	
	Computer() {
		super("��ǻ��");
	}
	Computer(String name) {
		super(name);
	}
	public void turnOn() {
		System.out.println(name + "�� �Ҵ�.");
	}
	public void turnOff() {
		System.out.println(name + "�� ����.");
	}
	public void remoteOn() {
		System.out.println(name + "�� �ٽ� �Ҵ�.");
	}
	public void remoteOff() {
		System.out.println(name + "�� �ٽ� ����.");
	}
	public void reset() {
		System.out.println(name + "�� �ʱ�ȭ �Ѵ�.");
	} 
}

class Portable{
	String name;
	
	Portable(String name){
		this.name = name;
	}
}


public class ControllableDemo {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		Controllable.reset(); // reset�� ���� �޼ҵ�� tv. �� �ȵǰ� Ŭ������. �������
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.remoteOn();
		com.remoteOff();
		com.repair();
		com.reset();  // �����޼ҵ� �� �������̵� �ǳ�..?
		Computer notebook = new Computer("��Ʈ��");
		notebook.turnOn();
		notebook.turnOff();
		notebook.remoteOn();
		notebook.remoteOff();
		notebook.repair();
		notebook.reset();
		
	}
	

}
