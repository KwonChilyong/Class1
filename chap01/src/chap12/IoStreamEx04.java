package chap12;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoStreamEx04 {

	public static void main(String[] args) throws IOException {
		String input = "src\\chap12\\IoStreamEx01.java";
		String output = "javasource.java";
		
		FileReader fr = new FileReader(input);
		FileWriter fw = new FileWriter(output);
		
		int data = 0;
		int count = 1;
		System.out.print("["+ count + "]  ");
		while((data = fr.read()) != -1) {
			fw.write(data);
			
			System.out.print((char)data);
			if(data == '\n') {
				System.out.print("["+ ++count + "]  ");
				
			}
			
		}
		

	}

}
