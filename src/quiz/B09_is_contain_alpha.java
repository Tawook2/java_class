package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {

	public static void main(String[] args) {
		
		// ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���
		// ������ false�� ���
		
		// 1. break; ��� 2. count ��� 3. ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է� >");
		String words = sc.nextLine();
		
		char ch;
		boolean result = false;
		// words.length()�� �ѹ��� ȣ���ϴ� ���
		// for (int i = 0, len = words.length(); i < len; i++)
		for(int i = 0; i < words.length(); i++) {
			
			ch = words.charAt(i);
			if(ch >= 'a' && ch <= 'z')
				result = true;
			else if(ch >= 'A' && ch <= 'Z')
				result = true;
		}
		System.out.println(result);
		
		
	}
}
