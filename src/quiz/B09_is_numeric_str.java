package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	public static void main(String[] args) {
		
		// �Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ ����� 1�� ����
		// �ٸ� ���ڰ� ���ԵǾ� �ִٸ� 0�� ����
		
		// �� ��, ���ڿ��� ����������� ����� 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է� > ");
		String words = sc.nextLine();
		
		
	
		int result = 1;
		// # ���ڿ��� �̻��� ��� 3����
		//	- null : str�� ����Ű�� �ּҰ� ���� ���
		//	- str�� ���� ""�� ���
		//	- str�� ���̰� 0�� ���
		
		if(words == null || words.equals("") || words.length() == 0) {
			result = 2;
				
		}else {
		
			for(int i = 0, len = words.length(); i < len; i++) {
				
				char ch = words.charAt(i);
				
				if(!(ch >= '0' && ch <= '9')) {
					result = 0;
					break;
				}
				
			}
		}
		System.out.println(result);	
	}
}
