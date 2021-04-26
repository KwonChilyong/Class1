package chap04;

class Car {
	private String brand;
	private int door;
	private String color;
	private String kind;
	
	Car() {
		
	} // 생성자가 아래 있으니 기본생성자 필수로 만들어 줘야함 
	
	Car(String brand, int door, String color, String kind){
		this(brand, door, color);
//		this.door = door;
//		this.color = color;
//		this.kind = kind;
	} 
	
	Car(String brand) {
		this.brand = brand;
	}
	
	Car(String brand, String str) {
//		this.brand = brand;
		this(brand); // 같은말
		if(str.equals("SUV") || str.equals("승용") || str.equals("화물")) {
		this.kind = str;
		}else {
			this.color = str;
		}           // 같은 string 인 kind와 color 에 구분 주기위해서 사용 
	}
	
	Car(String brand, int door, String color) {
		this.brand = brand;
		this.door = door;
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}

	
}

public class CarTest01 {

	public static void main(String[] args) {
		Car c1 = new Car();
//		c1.brand = "KIA"; 직접 접근 불가능 (private 니까) 따라서 get,set 만들어줘야함.
		c1.setBrand("K9");
		c1.setDoor(4);
		c1.setColor("검정");
		c1.setKind("승용");
		
		System.out.println("칼라 : " + c1.getColor()); //c1.color 로는 직접접근이라 불가능
		
		
		Car c2 = new Car("현대", 4, "노랑", "승용");
		Car c3 = new Car("제네시스");  
		Car c4 = new Car("현대", "SUV");                //다 각각 생성자 만들어줘야함.
		Car c5 = new Car("기아", 6 , "노랑");
		Car c6 = new Car("현대","빨강");             
		
		
	}

}
