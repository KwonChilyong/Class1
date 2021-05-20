package chap12;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		File file = new File("D:\\workspace\\chap01");
		File[] fs = file.listFiles();
		
		for(File f : fs) {
			if(f.isDirectory()) {
				System.out.printf("dir : %s\n", f.getName()); //.getName �ϸ� ��λ��� �̸��� ���
			}else {
				System.out.printf("file: %s(%d bytes)\n", f.getName(), f.length());
			}
//		File ��ü�� ������ ������θ� ���, �����̸� ���ϰ�θ� ����ϰԲ� �Ѱ� (.getName �ϸ� ��� ������ �̸��� ��µ�)
		}

	}

}
