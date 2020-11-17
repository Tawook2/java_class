package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {

	public static void main(String[] args) {
		
		// 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력
		// 없으면 false를 출력
		
		// 1. break; 사용 2. count 사용 3. 내꺼
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력 >");
		String words = sc.nextLine();
		
		char ch;
		boolean result = false;
		// words.length()를 한번만 호출하는 방식
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
