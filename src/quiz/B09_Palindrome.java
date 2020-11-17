package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	public static void main(String[] args) {
		
		// ����ڷκ��� �ܾ �ϳ� �Է¹ް�
		// �ش� �ܾ ȸ���̶�� "PALINDROM" ��� 
		// ȸ���� �ƴ϶�� "NOT PALINDROM"�� ���
		
		// �� ABBA, MADAM
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܾ �Է� >");
		String words = sc.next();
		
		/*
		
		// # StringBuilder.reverse() ���±��� ������ ���ڿ��� �Ųٷ� �������ش�
		StringBuilder strb = new StringBuilder(word)
		String reverse = strb.reverse().toString();
		
		int half = word.length() / 2;
		
		boolean plain = true;
		
		for (int i = 0; i < half; i++){
			if (word.charAt(i) != reverse.charAt(i){
				palin =false;
				break;
			}
		}
		*/
		
		int correct = 0;
		int half_len = (words.length()+1) /2;	
		for(int i = 0; i < half_len ; i++) {
			if(words.charAt(i) == words.charAt(words.length()-(i + 1)))	{
				System.out.println("begin : " + words.charAt(i));
				System.out.println("end : " + words.charAt(words.length()-(i + 1)));
				correct += 1;
			}
		}
		if(correct == half_len)
			System.out.println("PALINDROM");
		else {
			System.out.println("NOT PARLINDROM");
		}
	}
}
