package chap06;

class Unit {
	String name;
	int price;
	
	public void makeUnit() {
		System.out.println(name + "을 만든다.");
	}
}
class Mangchi extends Unit{
	int size;
	public void play() {
		System.out.println("두드린다.");
	}
}
class Sonsurae extends Unit{
	int weight;
	public void play() {
		System.out.println("짐을 옮긴다.");
	}
}

public class CastingTestEx01 {

	public static void main(String[] args) {
		Unit u = new Unit();
		Mangchi m = new Mangchi();
		Sonsurae s = new Sonsurae();
		
		u.name = "제품";
		u.price = 0;
		m.name = "무거운망치";
		m.price = 1000;
		s.name = "우리집달구지";
		s.price = 100000;
		
//		m.play();
//		s.play();      아래와 같은의미.
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
