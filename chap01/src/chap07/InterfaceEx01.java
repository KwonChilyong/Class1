package chap07;

interface Coin{
	int PENNY = 1, NIKEL = 2, DIME = 10, QUARTER = 25;
}
public class InterfaceEx01 implements Coin{

	public static void main(String[] args) {
		System.out.println("DIME�� " + DIME +"��Ʈ�Դϴ�." );
// implements ���ִϱ� Coin.DIME ���� Coin. ���൵ ��		


	}

}
