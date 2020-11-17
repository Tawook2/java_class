package quiz;

import java.util.Random;

public class B12_tempPassword {
	
	public static void main(String[] args) {
		
		// 랜덤 4자리의 임시 비밀번호 문자열을 생성하는 프로그램을 만들어보세요
		// (비밀번호를 구성하는 문자 = 알파벳 대문자, 숫자, 특수문자)
		
		Random ran = new Random();
		
		StringBuilder password =  new StringBuilder("");
		for(int i = 0; i < 4; i++) {
			
			/*
			 (1)
			 String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
			 
			 char ch  = charset.charAt(ran.nextInt(charset.length()));
			 temp_password.append(ch);
			 
			 (2)
			 char ch;
			 // true일떄 영어를 추가, 아니면 숫자 추가
			 if (ran.nextBoolean()){
			 	ch = (char)(ran.nextInt(26) + 'A');
			
			 } else{
			 	ch = (char)(ran.nextInt(10) + '0');
			 }
			 temp_password.append(ch);
			 */
			
			int checkNum = ran.nextInt(100);
			if(checkNum >= 65 && checkNum <= 91)
				password.append((char)checkNum);
			else if(checkNum < 10)
				password.append(checkNum);
			else {
				checkNum /= 10;
				password.append(checkNum);
			}
			
		}
		System.out.println(password);
	}
}
