package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B13_count_letter {


	public static void main(String[] args) {
		
		// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
		// �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ����غ�����
		// (��ҹ��� ���� X)
		
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
				System.out.printf("%c�� ������ Ƚ���� %d�� �Դϴ�.\n", i + 'a', count[i]);
		}
		
//		System.out.println("���� �Է� > ");
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
//		System.out.printf("������ %s ���� 'a'�� ������ %s �Դϴ�", Arrays.toString(checkAlpa), check);
		
	}
}
