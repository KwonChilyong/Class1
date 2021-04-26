package chap04;

class Car {
	private String brand;
	private int door;
	private String color;
	private String kind;
	
	Car() {
		
	} // �����ڰ� �Ʒ� ������ �⺻������ �ʼ��� ����� ����� 
	
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
		this(brand); // ������
		if(str.equals("SUV") || str.equals("�¿�") || str.equals("ȭ��")) {
		this.kind = str;
		}else {
			this.color = str;
		}           // ���� string �� kind�� color �� ���� �ֱ����ؼ� ��� 
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
//		c1.brand = "KIA"; ���� ���� �Ұ��� (private �ϱ�) ���� get,set ����������.
		c1.setBrand("K9");
		c1.setDoor(4);
		c1.setColor("����");
		c1.setKind("�¿�");
		
		System.out.println("Į�� : " + c1.getColor()); //c1.color �δ� ���������̶� �Ұ���
		
		
		Car c2 = new Car("����", 4, "���", "�¿�");
		Car c3 = new Car("���׽ý�");  
		Car c4 = new Car("����", "SUV");                //�� ���� ������ ����������.
		Car c5 = new Car("���", 6 , "���");
		Car c6 = new Car("����","����");             
		
		
	}

}
