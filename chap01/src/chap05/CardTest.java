package chap05;

class Card {
	int kind; // ī�� ���� ���� / �����̵� = 1, ��Ʈ = 2, Ŭ�ι� = 3, ���̾� = 4 /
	int num;  // 1 - 13 ����
	
	Card() {
		kind = 0;
		num = 0;
	}
	
}
public class CardTest {

	public static void main(String[] args) {
		Card[] card = new Card[52]; // ī�� 52�� ����
		
		for(int i = 0 ; i < 52; i++) {
			card[i] = new Card(); // ��ü�迭���� �߿�! 
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
	    }        // ī�� ����
	}
}
