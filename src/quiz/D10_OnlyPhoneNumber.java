package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	// ����ڷκ��� ��ȭ��ȣ�� �Է¹޾ƺ����� (��ȭ��ȣ ���°� �ƴ� ��� �����޽����� �Բ� �ٽ� �Է�)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("��ȭ��ȣ�� �Է����ּ���.");
			String tel = sc.nextLine();
			String tel_pattern = tel;
			
			if(Pattern.matches("0[1][01679]-[\\d]{3,4}-[\\d]{4}",tel_pattern)) {
				System.out.printf("��ȭ��ȣ�� %s �Դϴ�.\n", tel);
				break;
			}
			else {
				System.err.println("�߸��� ��ȭ��ȣ �Դϴ�.");
			}			
		}	
	}	
}
