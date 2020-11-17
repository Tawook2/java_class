package quiz;

import java.util.Scanner;

public class B05_CheckWord {

	public static void main(String[] args) {
		
		// 사용자로부터 단어를 하나 입력받고
		// 첫번째 단어와 마지막 단어가 일치하면 "OK"를 출력
		// 아니라면 "NOT OK" 를 출력해보세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력 >");
		String word = sc.next();	
		
		String checkWord = (word.charAt(0) == word.charAt(word.length()-1) ) ? String.format("OK") : String.format("NOT OKAY");
		System.out.println(checkWord);
	}
}
