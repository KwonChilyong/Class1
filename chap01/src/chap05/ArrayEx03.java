package chap05;

//public class ArrayEx03 {
//
//	public static void main(String[] args) {
//		int[][][] st = new int[3][5][10]; // 면,행,열, 총 150개 장소만듬
//		System.out.println(st[0][0][0]);
//		int[][][] st1; 
//		st1 = new int[3][5][10];
//		System.out.println(st1[0][0][0]);
//	}
//
//}
// 다차원 배열
public class ArrayEx03 {

	public static void main(String[] args) {
		int[][][] st = new int[3][5][10]; // 면,행,열, 총 150개 장소만듬
		System.out.println(st[0][0][0]);
		int[][][] st1; 
		st1 = new int[3][5][10];
		System.out.println(st1[0][0][0]);
		
		int cnt = 1;
		for(int i=0 ; i < st.length ; i++) {
			for(int j=0 ; j < st[i].length; j++) {
				for(int k=0 ; k < st[i][j].length; k++) {
					st[i][j][k] = cnt++;
				}
			}
		}
		for(int i=0 ; i < st.length ; i++) {
			for(int j=0 ; j < st[i].length ; j++) {
				for(int k=0 ; k < st[i][j].length ; k++) {
					System.out.printf("%4d", st[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}