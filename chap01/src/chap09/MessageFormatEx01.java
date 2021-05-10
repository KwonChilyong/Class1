package chap09;

import java.text.MessageFormat;

public class MessageFormatEx01 {

	public static void main(String[] args) {
		String msg = "Name : {0} \nTel : {1} \nAge: {2} \nBirth: {3} \n";
		Object[] args1 = {"ȫ�浿", "010-1111-2222", 30, "1991-05-06"};
		
		String re = MessageFormat.format(msg, args1);
		System.out.println(re);
	}

}
