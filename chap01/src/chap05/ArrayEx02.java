package chap05;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[][] map = new int[5][5];
//		score[0][0] = 10;
//		int[][] score = {{1,2,3,4,5},
//		                 {11,22,33,44,55},
//		                 {111,222,333,444,555}};
		int count = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				map[i][j] = count++;
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d",map[i][j]);
			}
			System.out.println();
		}
		int temp;
		int r, h;
		for(int i = 0; i <100; i++) {
			temp = map[0][0];
			r = (int)(Math.random() * 5);
			h = (int)(Math.random() * 5);
			map[0][0] = map[r][h];
			map[r][h] = temp;
		}
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d",map[i][j]);
			}
			System.out.println();
		}
	}

}
