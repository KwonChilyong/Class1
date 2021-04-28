package chap04;

class Dice {
	int face;
	
	int roll() {
		face=(int)(Math.random()*6);
		
		return (face==0) ? 6 : face;
	}
}
public class p163ex8 {

	public static void main(String[] args) {
		Dice d = new Dice();
		System.out.println("주사위의 숫자 : " + d.roll());
		
	}

}
