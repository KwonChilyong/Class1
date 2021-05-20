package chap12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IoStreamEx06 {

	public static void main(String[] args) throws IOException {
		String input = "D:\\temp\\org.txt";
		
		FileInputStream fi = new FileInputStream(input);
		FileOutputStream fo = new FileOutputStream("D:\\temp\\org1.txt");
		
		InputStreamReader in = new InputStreamReader(fi,"UTF-8"); //������ �̻������ �ѱ��� ������ ���� �׷��� ,"UTF-8" ���� �׷��� �ѱ��� �ȱ���
		                                                          //�����Ҷ� �Ʒ��� ���ڵ��� utf-8 �� �߾ �׷�
																// ���ڵ��� Ansi �� ���ִٸ� MS949 �� ���ָ� �ȱ����� ����
		OutputStreamWriter ow = new OutputStreamWriter(fo,"UTF-8");
		int c;
		System.out.println(in.getEncoding()); //org Ÿ���� ����ɶ� �Ÿ������ �Ȱ��� ����°�
		while((c=in.read()) != -1) {
			System.out.print((char) c);
			ow.write(c);
		}
		ow.flush();
		

	}

}
