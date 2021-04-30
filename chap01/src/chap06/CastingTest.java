package chap06;

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("Drive ~~~");
	}
	void stop() {
		System.out.println("Stop !!!!");
	}
	
}
class FireCar extends Car{
	void water() {
		System.out.println("Water~~~");
	}
}
class Ambulacne extends Car{
	void siren() {
		System.out.println("Siren~~~");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		Car car = null;
		FireCar f1 = new FireCar();
		FireCar f2 = null;
		f1.water();
//		f2.water(); 
		
		car = f1;
		car.drive();
		car.stop();
//		car.water();  부모가 상속한 메소드가 아니고 자식클래스 메소드
		f2 = (FireCar)car; // (FireCar)로 형변환 해서 넣어줌
		f2.drive();
		f2.stop();
		f2.water();
	}

}
