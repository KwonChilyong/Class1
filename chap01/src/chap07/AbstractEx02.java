package chap07;

abstract class Unit{
	String name;
	int no;
	double power;
	double life;
	
	Unit(double power){
		this.power = power;
		life = 100;
	}
	
	abstract void attack();
	abstract void defense();
	abstract void prt();
	
	
	
}
class UnitRepair{
	public void repair(Unit u) {
		u.life = 100;
	}
}

class Tank extends Unit{
	Tank(double power){
		super(power);
	}
	public void attack() {
		power += 10;
		System.out.println("��ũ ����!!");
	}
	public void defense() {
		life -= 1;
		System.out.println("��ũ ����!!");
	}
	public void prt() {
		System.out.println("�Ŀ� : " + power + " ��ũ!!"
				+", ������ : " + life);
	}

}

class Marine extends Unit{
	
	Marine(double power){
		super(power);
	}
	public void attack() {
		power += 0.5;
		System.out.println("���� ����!!");
	}
	public void defense() {
		life -= 10;
		System.out.println("���� ����!!");
	}
	public void prt() {
		System.out.println("�Ŀ� : " + power + " ����!!"
				+", ������ : " + life);
	}
	
}

class Medic extends Unit{
	Medic(double power){
		super(power);
	}
	public void attack() {
		power += 0.2;
		System.out.println("�޵� ����!!");
	}
	public void defense() {
		life -= 20;
		System.out.println("�޵� ����!!");
	}
	public void prt() {
		System.out.println("�Ŀ� : " + power + " �޵�!!"
				+", ������ : " + life);
	}
}
public class AbstractEx02 {

	public static void main(String[] args) {
		UnitRepair rep =  new UnitRepair();
		
		Tank t = new Tank(1000);
		t.attack();
		t.defense();
		t.prt();
		
		Marine m = new Marine(100);
		m.attack();
		m.defense();
		m.prt();
		
		Medic me = new Medic(10);
		me.attack();
		me.defense();
		me.prt();
		
		rep.repair(t);
		rep.repair(m);
		t.prt();
	}

}
