package quiz;

import java.util.Scanner;

public class B09_upcase {

	public static void main(String[] args) {
		
		// �Է¹��� ���ڿ��� ��� ���ĺ��� �빮�ڷ� ��������
		// �� ������ �Ѽյ��� �ʰ�, ���ο� ���ڿ��� �����Ǿ����
		
		
		StringBuilder upperCase = new StringBuilder("");
		
		
		System.out.println("���ڿ� �Է� >");
		Scanner sc =new Scanner(System.in);
		
		String words = sc.nextLine();
		for(int i = 0, len = words.length(); i < len; i++) {
			char ch = words.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
				upperCase.append((char)(ch - 32));  //ch  = (char)(ch - 'a' + 'A')
			else
				upperCase.append(ch);
			
		}
		System.out.println(upperCase);
		
	}
}
