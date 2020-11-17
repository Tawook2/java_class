package quiz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	// 사용자로부터 전화번호만 입력받아보세요 (전화번호 형태가 아닐 경우 에러메시지와 함께 다시 입력)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("전화번호를 입력해주세요.");
			String tel = sc.nextLine();
			String tel_pattern = tel;
			
			if(Pattern.matches("0[1][01679]-[\\d]{3,4}-[\\d]{4}",tel_pattern)) {
				System.out.printf("전화번호는 %s 입니다.\n", tel);
				break;
			}
			else {
				System.err.println("잘못된 전화번호 입니다.");
			}			
		}	
	}	
}
