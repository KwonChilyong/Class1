package chap12;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx01 {

	public static void main(String[] args) throws IOException {
		int[] score = {1, 100, 90, 80, 
					   2, 50 , 60, 70,
					   3, 80 , 90, 100,
					   4, 70 , 85, 95,
					   5, 88 , 99, 77};
		
		RandomAccessFile ref = new RandomAccessFile("score.dat","rw");
		for(int i = 0 ; i < score.length; i++) {
			ref.writeInt(score[i]);
		}
//		ref.seek(0);
//		System.out.println(ref.readInt());
//		System.out.println(ref.readInt());
//		ref.seek(4);
//		System.out.println(ref.readInt());
//		ref.seek(16);
//		System.out.println(ref.readInt());
		
		ref.seek(0);
		for(int i = 0 ; i < score.length * 4; i+=16) {
			ref.seek(i);
			System.out.println(ref.readInt());
		}
		ref.seek(4);
		ref.writeUTF("ȫ�浿");
		
		ref.seek(0);
		System.out.println(ref.readInt());
		System.out.println(ref.readUTF());
		System.out.println(ref.readInt());
	}

}


