package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B13_count_letter {


	public static void main(String[] args) {
		
		// 사용자로부터 문장을 하나 입력받았다 치고
		// 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 출력해보세요
		// (대소문자 구분 X)
		
		String msg = "The Quick Brown Fox Jumps Over a Lazy Dog";
		
		msg = msg.toLowerCase();
		
		int[] count = new int[26];
		
		for(int i = 0; i < msg.length(); i++) {
			
			char ch = msg.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
				count[ch - 'a'] += 1;
		}
		
		for(int i = 0; i < 26; i++) {
			if(count[i] > 0)
				System.out.printf("%c가 등장한 횟수는 %d번 입니다.\n", i + 'a', count[i]);
		}
		
//		System.out.println("문장 입력 > ");
//		Scanner sc = new Scanner(System.in);
//		
//		String sentence01 = sc.nextLine();
//		
//		int[] alpabet = new int[] {'A','B','C','D','E','F','G','H',
//									'I','J', 'K', 'L', 'M', 'N', 'O', 'P',
//									'Q','R','S','T','U','V','W','X','Y','Z'};
//		
//		char[] checkAlpa = sentence01.toCharArray();
//		
//		int[] count = new int[26];
//		
//		int check = 0;
//		
//		for(int i = 0; i < sentence01.length(); i++) {
//			
//			System.out.println(checkAlpa[i]);
//			
//			for(int j = 0; j < alpabet.length; j++) {
//				
//				if(checkAlpa[i] >= 'A' && checkAlpa[i] <= 'Z') {
//					
//					if(checkAlpa[i] == alpabet[j]) {
//						count[j]++;
//						check = count[j];
//					}
//				}
//				else {
//					if(checkAlpa[i] == alpabet[j] + 32) {
//						count[j]++;
//						check = count[j];
//					}
//				}
//					
//			}
//			System.out.println(check);
//			
//			
//		}
//		System.out.printf("문장이 %s 가진 'a'의 개수는 %s 입니다", Arrays.toString(checkAlpa), check);
		
	}
}
