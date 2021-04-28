package chap05;

class Card {
	int kind; // 카드 무늬 종류 / 스페이드 = 1, 하트 = 2, 클로버 = 3, 다이아 = 4 /
	int num;  // 1 - 13 까지
	
	Card() {
		kind = 0;
		num = 0;
	}
	
}
public class CardTest {

	public static void main(String[] args) {
		Card[] card = new Card[52]; // 카드 52장 만듦
		
		for(int i = 0 ; i < 52; i++) {
			card[i] = new Card(); // 객체배열에서 중요! 
		}
		
		int cnt = 0;
		for(int i = 1 ; i < 5 ; i++) {
			for(int j = 1 ; j < 14 ; j++) {
				card[cnt].kind = i;
				card[cnt].num = j;
				cnt++;
			}
		}
		
		suffleCard(card);
		int r = (int)(Math.random() * 52);
		System.out.println("kind : " + card[r].kind + ", number : " + card[r].num);
	}
	
	
	public static void suffleCard(Card[] card) {
	    Card temp;
		for(int i = 0 ; i < 100 ; i++) {
			temp = card[0];
			int r = (int)(Math.random() * 52);
			card[0] = card[r];
			card[r] = temp;
	    }        // 카드 섞기
	}
}
