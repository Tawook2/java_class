package quiz;

import java.util.Scanner;

public class B09_printReverse {

	public static void main(String[] args) {
		
		// ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
		
		System.out.println("������ �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		
		String words = sc.nextLine();
		String reverse = "";
		
		// # ���� �������� ���ڿ��� ���� �ϼ���ų �� �ִ� (������)
		// String str = "hello";
		// str += ",world!";
		
		// # StringBuilder�� += ��� append() �Լ��� ���� ���ڿ��� �����
		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		
		// �� ����� �� �ڿ� String���� ��ȯ�ؼ� ����ϸ� �ȴ�
		String build_result = str.toString();
		System.out.println(build_result);
		
		char ch;
		
		for(int i = 0; i < words.length(); i++) {
			
			ch = words.charAt(words.length()-(1 + i));
			reverse += ch;
		}
		
		System.out.println(reverse);
		// println�� String���� ��ȯ���� �ʾƵ� �ȴ�
	}
}
