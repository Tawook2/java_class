package quiz;

import java.util.Scanner;

public class B09_Palindrome {

	public static void main(String[] args) {
		
		// 사용자로부터 단어를 하나 입력받고
		// 해당 단어가 회문이라면 "PALINDROM" 출력 
		// 회문이 아니라면 "NOT PALINDROM"를 출력
		
		// ※ ABBA, MADAM
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력 >");
		String words = sc.next();
		
		/*
		
		// # StringBuilder.reverse() 여태까지 빌드한 문자열을 거꾸로 뒤집어준다
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
