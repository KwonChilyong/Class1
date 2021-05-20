package chap12;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx03 {

	public static void main(String[] args) {
		String currPath = "d:\\workspace\\chap01";
		File dir = new File(currPath);
		
		File[] files = dir.listFiles();
		int filesCnt =  0; // ���� ���� ��� �˷��� 
		
		for(int i = 0 ; i < files.length ; i++) {
			File f = files[i];
			String name = f.getName(); //�����̸� ��������
			long size = f.length(); // ũ��
			String sep = "";
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // m�� �빮��
			
			if(f.isDirectory()) { // �������� �������� ����
				sep = "Dir";
				
			}else {
				sep = "file";
				filesCnt++; // ���� ���� ��� �˷��� 
			}
			
			System.out.printf("%-20s   [%5s] %13dBytes  %s\n", name, sep, size, df.format(new Date(f.lastModified())));
//			�̸� , �������� ��������, ũ��, ��ġ�� �ð�  �̷��� ���ʷ� ����ϴ� ���
			
		}
		System.out.println("Total files " + filesCnt); // ���� ���� ��� �˷��� 
	}

}
