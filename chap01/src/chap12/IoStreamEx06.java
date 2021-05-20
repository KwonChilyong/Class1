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
		
		InputStreamReader in = new InputStreamReader(fi,"UTF-8"); //영문은 이상없으나 한글은 깨져서 나옴 그래서 ,"UTF-8" 써줌 그러면 한글이 안깨짐
		                                                          //저장할때 아래에 인코딩이 utf-8 로 했어서 그럼
																// 인코딩이 Ansi 로 되있다면 MS949 로 해주면 안깨지고 나옴
		OutputStreamWriter ow = new OutputStreamWriter(fo,"UTF-8");
		int c;
		System.out.println(in.getEncoding()); //org 타입이 저장될때 어떤타입으로 된건지 물어보는거
		while((c=in.read()) != -1) {
			System.out.print((char) c);
			ow.write(c);
		}
		ow.flush();
		

	}

}
