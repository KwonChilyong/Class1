package chap05;

import java.util.Scanner;

public class WordChangEx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("단어를 입력하세요.");
		String word = in.next();
		
		char ch;
		int wordLength = word.length();
		char[] suffleWord = new char[wordLength];
		
		for(int i=0 ; i<wordLength ; i++) {
			 suffleWord[i] = word.charAt(i) ;
		}
		
		for(int i=0 ; i<20 ; i++) {
			int r = (int)(Math.random() * wordLength);
			ch = suffleWord[0];
			suffleWord[0] = suffleWord[r];
			suffleWord[r] = ch;
		}
		
		System.out.println(suffleWord);

	}

}
