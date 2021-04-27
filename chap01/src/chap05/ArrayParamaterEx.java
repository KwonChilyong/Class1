package chap05;

public class ArrayParamaterEx {
	public static void printPan(int[][] pan) {
		for(int i = 0; i < pan.length ; i++) {
			for(int j =0; j < pan[i].length ; j++) {
				System.out.printf("%3d", pan[i][j]);
			
			} System.out.println();
		} 
		
	}
	public static void main(String[] args) {
		int pan[][] = new int[5][5];
		for(int i = 0; i < pan.length ; i++) {
			for(int j =0; j < pan[i].length ; j++)
				pan[i][j] = (i*5) + (j+1);
		}
		printPan(pan);
	}

}
