package chap07;

abstract class pp {
	int i;
	
	public pp(int i) {
		this.i = i;
	}
	void show() {
		
	}
}

class Concrete extends pp {
	int j;
	
	public Concrete(int i, int j) {
		super(i);
		this.j = j;
	}
	void show() {
		System.out.println("i = " + i + " j = " + j );
	}
}

public class p281Ex01 {

	public static void main(String[] args) {
		Concrete c = new Concrete(100,50);
		c.show();

	}

}
