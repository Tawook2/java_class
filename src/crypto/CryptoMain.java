package crypto;

import java.util.Scanner;

public class CryptoMain {

	// 사용자가 메세지와 키값을 설정하고 원하는 암호 알고리즘으로
	// 암호화/복호화 작업을 할 수 있는 프로그램을 만들어보세요
	
	public static void main(String[] args) {
		
		String user_input = "Caesar";
		int user_input_key = 8;
		
		// 상속은 여러 클래스를 일반화(업캐스팅) 시키는 용도로 주로 많이 사용한다
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
//			System.out.println("키 값을 설정해주세요");
//			Scanner sc = new Scanner(System.in);
//			int key = sc.nextInt();
//			sc.nextLine();
//			System.out.println("메세지를 입력해주세요");
//			String msg = sc.nextLine();
//			
//			CaesarCipher CC01 = new CaesarCipher(key);
//			TranspositionCipher TC01 = new TranspositionCipher(key);
//			System.out.println("=========================================================");
//			System.out.printf("입력한 키 값 : %d - 입력한 메시지 : %s\n",key, msg);
//			System.out.println("1.시저 암호화\n2.시저 복호화\n3.전치 암호화\n4.전치 복호화\n0.시스템 종료");
//			System.out.println("=========================================================");
//			int input = sc.nextInt();
//			switch(input) {
//			case 1:
//				String crypto = CC01.encryption(msg);
//				System.out.println("시저 암호화 완료");
//				System.out.printf("평서문 : %s\n암호문 : %s\n",msg, crypto);
//				System.out.println("=========================================================");
//				break;
//			case 2:
//				String decrypto = CC01.decryption(msg);
//				System.out.println("시저 복호화 완료");
//				System.out.printf("암호문 : %s\n평서문 : %s\n",msg, decrypto);
//				System.out.println("=========================================================");
//				break;
//			case 3:
//				String crypto2 = TC01.encryption(msg);
//				System.out.println("전치 암호화 완료");
//				System.out.printf("평서문 : %s\n암호문 : %s\n",msg, crypto2);
//				System.out.println("=========================================================");
//				break;
//			case 4:
//				String decrypto2 = TC01.decryption(msg);
//				System.out.println("전치 복호화 완료");
//				System.out.printf("암호문 : %s\n평서문 : %s\n",msg, decrypto2);
//				System.out.println("=========================================================");
//				break;
//			case 0:
//				System.err.println("시스템이 종료되었습니다.");
//				System.exit(0);
//				break;
//			default:
//				System.err.println("'보기'에 있는 메뉴 번호만 입력해주세요 !");
//				break;
//			}
//		}
	}
}
