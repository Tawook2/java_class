package crypto;

import java.util.Scanner;

public class CryptoMain {

	// ����ڰ� �޼����� Ű���� �����ϰ� ���ϴ� ��ȣ �˰�������
	// ��ȣȭ/��ȣȭ �۾��� �� �� �ִ� ���α׷��� ��������
	
	public static void main(String[] args) {
		
		String user_input = "Caesar";
		int user_input_key = 8;
		
		// ����� ���� Ŭ������ �Ϲ�ȭ(��ĳ����) ��Ű�� �뵵�� �ַ� ���� ����Ѵ�
		Cipher cipher = null;
		
		if(user_input.equals("Caesar")) {
			cipher = new CaesarCipher(user_input_key);
			
		}else if(user_input.equals("Transposition")){
			cipher = new TranspositionCipher(user_input_key);
		}
		String result = cipher.encryption("ABCDEFG");
		
		System.out.println(result);
				
//		while(true) {
//			
//			System.out.println("Ű ���� �������ּ���");
//			Scanner sc = new Scanner(System.in);
//			int key = sc.nextInt();
//			sc.nextLine();
//			System.out.println("�޼����� �Է����ּ���");
//			String msg = sc.nextLine();
//			
//			CaesarCipher CC01 = new CaesarCipher(key);
//			TranspositionCipher TC01 = new TranspositionCipher(key);
//			System.out.println("=========================================================");
//			System.out.printf("�Է��� Ű �� : %d - �Է��� �޽��� : %s\n",key, msg);
//			System.out.println("1.���� ��ȣȭ\n2.���� ��ȣȭ\n3.��ġ ��ȣȭ\n4.��ġ ��ȣȭ\n0.�ý��� ����");
//			System.out.println("=========================================================");
//			int input = sc.nextInt();
//			switch(input) {
//			case 1:
//				String crypto = CC01.encryption(msg);
//				System.out.println("���� ��ȣȭ �Ϸ�");
//				System.out.printf("�򼭹� : %s\n��ȣ�� : %s\n",msg, crypto);
//				System.out.println("=========================================================");
//				break;
//			case 2:
//				String decrypto = CC01.decryption(msg);
//				System.out.println("���� ��ȣȭ �Ϸ�");
//				System.out.printf("��ȣ�� : %s\n�򼭹� : %s\n",msg, decrypto);
//				System.out.println("=========================================================");
//				break;
//			case 3:
//				String crypto2 = TC01.encryption(msg);
//				System.out.println("��ġ ��ȣȭ �Ϸ�");
//				System.out.printf("�򼭹� : %s\n��ȣ�� : %s\n",msg, crypto2);
//				System.out.println("=========================================================");
//				break;
//			case 4:
//				String decrypto2 = TC01.decryption(msg);
//				System.out.println("��ġ ��ȣȭ �Ϸ�");
//				System.out.printf("��ȣ�� : %s\n�򼭹� : %s\n",msg, decrypto2);
//				System.out.println("=========================================================");
//				break;
//			case 0:
//				System.err.println("�ý����� ����Ǿ����ϴ�.");
//				System.exit(0);
//				break;
//			default:
//				System.err.println("'����'�� �ִ� �޴� ��ȣ�� �Է����ּ��� !");
//				break;
//			}
//		}
	}
}
