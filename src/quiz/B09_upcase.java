package quiz;

import java.util.Scanner;

public class B09_upcase {

	public static void main(String[] args) {
		
		// 입력받은 문자열의 모든 알파벳을 대문자로 만들어보세요
		// ※ 원본이 훼손되지 않고, 새로운 문자열이 생성되어야함
		
		
		StringBuilder upperCase = new StringBuilder("");
		
		
		System.out.println("문자열 입력 >");
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
