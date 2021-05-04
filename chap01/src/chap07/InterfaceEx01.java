package chap07;

interface Coin{
	int PENNY = 1, NIKEL = 2, DIME = 10, QUARTER = 25;
}
public class InterfaceEx01 implements Coin{

	public static void main(String[] args) {
		System.out.println("DIME은 " + DIME +"센트입니다." );
// implements 해주니까 Coin.DIME 에서 Coin. 빼줘도 됨		


	}

}
