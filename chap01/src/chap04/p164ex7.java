package chap04;
class GolfClub {
	int ion;
	String str;
	
	GolfClub(){
		str="";
		ion=7;
	}
	GolfClub(int ion){
		str="";
		this.ion = ion;
	}
	GolfClub(String str){
		this.str=str;
		
	}
	void print() {
		if(str.compareTo("")==0) {
			System.out.println(ion + "�� ���̾��Դϴ�.");
		}else {
			System.out.println(str + "�Դϴ�.");
		}
	}
}
public class p164ex7 {

	public static void main(String[] args) {
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();
		
		GolfClub g3 = new GolfClub("����");
		g3.print();

	}

}
