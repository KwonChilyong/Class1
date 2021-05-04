package chap07;

public class Tv implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÒ´Ù.");

	}
	
	@Override
	public void turnOff() {
		 System.out.println("TV¸¦ ²ö´Ù.");

	}

}
