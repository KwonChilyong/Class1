package chap07;

class Computer extends Portable implements RemoteControllable {
	
	Computer() {
		super("컴퓨터");
	}
	Computer(String name) {
		super(name);
	}
	public void turnOn() {
		System.out.println(name + "를 켠다.");
	}
	public void turnOff() {
		System.out.println(name + "를 끈다.");
	}
	public void remoteOn() {
		System.out.println(name + "를 다시 켠다.");
	}
	public void remoteOff() {
		System.out.println(name + "를 다시 끈다.");
	}
	public void reset() {
		System.out.println(name + "를 초기화 한다.");
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
		Controllable.reset(); // reset이 정적 메소드라 tv. 은 안되고 클래스명. 해줘야함
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.remoteOn();
		com.remoteOff();
		com.repair();
		com.reset();  // 정적메소드 도 오버라이딩 되네..?
		Computer notebook = new Computer("노트북");
		notebook.turnOn();
		notebook.turnOff();
		notebook.remoteOn();
		notebook.remoteOff();
		notebook.repair();
		notebook.reset();
		
	}
	

}
