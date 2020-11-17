package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	public static void main(String[] args) {
		
		// 입력받은 문자열이 숫자만 포함되어 있으면 결과에 1을 저장
		// 다른 문자가 포함되어 있다면 0을 저장
		
		// ※ 단, 문자열이 비어있을때는 결과가 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 > ");
		String words = sc.nextLine();
		
		
	
		int result = 1;
		// # 문자열이 이상한 경우 3가지
		//	- null : str이 가리키는 주소가 없는 경우
		//	- str의 값이 ""인 경우
		//	- str의 길이가 0인 경우
		
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
