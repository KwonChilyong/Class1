package chap06;

class Unit {
	String name;
	int price;
	
	public void makeUnit() {
		System.out.println(name + "�� �����.");
	}
}
class Mangchi extends Unit{
	int size;
	public void play() {
		System.out.println("�ε帰��.");
	}
}
class Sonsurae extends Unit{
	int weight;
	public void play() {
		System.out.println("���� �ű��.");
	}
}

public class CastingTestEx01 {

	public static void main(String[] args) {
		Unit u = new Unit();
		Mangchi m = new Mangchi();
		Sonsurae s = new Sonsurae();
		
		u.name = "��ǰ";
		u.price = 0;
		m.name = "���ſ��ġ";
		m.price = 1000;
		s.name = "�츮���ޱ���";
		s.price = 100000;
		
//		m.play();
//		s.play();      �Ʒ��� �����ǹ�.
		unitPlay(m);
		unitPlay(s);
		
		m.makeUnit();
		s.makeUnit();
	}
	public static void unitPlay(Unit u) {
		if(u instanceof Mangchi) {
			Mangchi m = (Mangchi) u;
			m.play();
		}
		
		if(u instanceof Sonsurae) {
			Sonsurae s = (Sonsurae) u;
			s.play();
		}
	}
}
