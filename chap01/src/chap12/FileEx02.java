package chap12;

import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) throws IOException {
		File f = new File("d:\\workspace\\chap01\\src\\chap12\\FileEx01.java");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("���ϸ��� : " + f.getName());
		System.out.println("Ȯ���ڸ� ������ ���ϸ� : " + fileName.substring(0, pos));
//		                                               0���� pos ���� pos �� . �����ϱ� 
		
		System.out.println("Ȯ���ڴ� : " + fileName.substring(pos+1)); // pos+1 ���� ������ , �ƹ��͵� �������� ��������� �ǹ�
		System.out.println("��θ� ������ ���� �̸� : " + f.getPath());
		System.out.println("������ ������ : " + f.getAbsoluteFile()); 
		System.out.println("������ ���԰�� : " + f.getCanonicalPath());
		System.out.println("������ �����ִ� ���丮 : " + f.getParent());
		System.out.println("��� ������ : " + File.separator);
	}

}
