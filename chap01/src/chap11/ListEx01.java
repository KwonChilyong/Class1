package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("�罿");
		list.add("�����");
		list.add("������");
		list.add("ȣ����");
		
		
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.contains("�����"));
		System.out.println(list.remove(1)); //���� ���������� �˷��ְ� ������ (��ȯ)
		System.out.println(list); // remove �� ����� �����
		System.out.println(list.subList(0, 1));
		System.out.println(list);
		list.add(1,"������");
		System.out.println(list);
		list.add("������");
		System.out.println(list); // �ߺ�����
		
		String[] str = {"ȫ�浿","������","�̻���","����","ö��"};
		List<String> list1 = Arrays.asList(str);
//		List�� ���׸� Ÿ���̱⿡ <> ��������
		System.out.println(list1.get(2));
		System.out.println(list1);
		
		list1.set(3, "��ȣ"); // ���� ��ȣ�� �ٲ�
		System.out.println(list1);
		
		for(String s : list1) {
			System.out.println(s);
		}
//		list1.sort(null); // null ���ص� �������� ����
//		System.out.println(list1); 
		list1.sort((x,y)-> x.length() - y.length()); //���ٽ� ǥ��
		System.out.println(list1); // ���ڿ��� ���̸� ������ ����
//		list1.add("�̼���"); ������.. ��̸� ����Ʈ�� �ٲ۰��� add �ȵ�
		
		String[] str1 = list1.toArray(new String[list1.size()]);
		
		System.out.println(str1[2]);
	}

}
