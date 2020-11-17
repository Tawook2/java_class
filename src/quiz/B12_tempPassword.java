package quiz;

import java.util.Random;

public class B12_tempPassword {
	
	public static void main(String[] args) {
		
		// ���� 4�ڸ��� �ӽ� ��й�ȣ ���ڿ��� �����ϴ� ���α׷��� ��������
		// (��й�ȣ�� �����ϴ� ���� = ���ĺ� �빮��, ����, Ư������)
		
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
			 // true�ϋ� ��� �߰�, �ƴϸ� ���� �߰�
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
