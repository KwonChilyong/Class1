package chap09;

import java.text.MessageFormat;

public class MessageEx {

	public static void main(String[] args) {
		String java = "Java";
		int version = 8;
		
		String s = MessageFormat.format
				("Language : {1}\nversion : {0}",version, java);
		System.out.println(s);


	}

}
