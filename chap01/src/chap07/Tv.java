package chap07;

public class Tv implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("TV�� �Ҵ�.");

	}
	
	@Override
	public void turnOff() {
		 System.out.println("TV�� ����.");

	}

}
