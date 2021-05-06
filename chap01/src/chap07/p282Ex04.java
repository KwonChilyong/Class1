package chap07;

interface Talkable{
	void talk();
}

class Korean implements Talkable {
	public void talk() {
	System.out.println("æ»≥Á«œººø‰!");
	}
}

class American implements Talkable{
	public void talk() {
		System.out.println("Hello");
	}
}


public class p282Ex04 {
	static void speak(Talkable t) {
		t.talk();
	}
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());

	}

}
