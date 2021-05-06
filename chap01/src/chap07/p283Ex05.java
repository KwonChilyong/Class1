package chap07;

abstract class Controller{
	boolean power;
	
	public Controller(boolean power) {
		
		this.power = power;
	}
	void show() {
		if(power == true) {
			System.out.println(getName() + "가 켜졌습니다." );
		}else {
			System.out.println(getName() + "가 꺼졌습니다.");
		}
	}
	abstract String getName();
}

class TV1 extends Controller{
	public TV1 (boolean power) {
		super(power);
	}
	String getName() {
		return "TV";
	}
}

class Radio extends Controller{
	public Radio (boolean power) {
		super(power);
	}
	String getName() {
		return "라디오";
	}
}

public class p283Ex05 {

	public static void main(String[] args) {
		Controller[] c = {new TV1(false), new Radio(true)};
		
		for(Controller controller : c) 
			controller.show();

	}

}
