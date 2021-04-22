package chap05;

public class ArrayEx01 {

	public static void main(String[] args) {

	
//		int[] score = {10,20,30,40,50};
		
//		int[] score = new int[]{10,20,30,40,50};

//	   int[] score;
//     score = new int[]{10,20,30,40,50};

//		int[] score;
//		score = new int[5];
//		score = {10,20,30,40,50};
		
		
		int[] score = new int[5];
	    score[0] = 10;
	    score[1] = 20;
	    score[2] = 30;
	    score[3] = 40;
	    score[4] = 50;
	   
	    
		for(int i = 0; i < 5; i++)
	    System.out.println("score[" + i + "] : " + score[i]);
	  

	}

}
