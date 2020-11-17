package quiz;

import java.util.Scanner;

public class B09_printReverse {

	public static void main(String[] args) {
		
		// 사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
		
		System.out.println("문장을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		String words = sc.nextLine();
		String reverse = "";
		
		// # 누적 연산으로 문자열을 점차 완성시킬 수 있다 (느리다)
		// String str = "hello";
		// str += ",world!";
		
		// # StringBuilder는 += 대신 append() 함수를 통해 문자열을 만든다
		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		
		// 다 만들고 난 뒤에 String으로 변환해서 사용하면 된다
		String build_result = str.toString();
		System.out.println(build_result);
		
		char ch;
		
		for(int i = 0; i < words.length(); i++) {
			
			ch = words.charAt(words.length()-(1 + i));
			reverse += ch;
		}
		
		System.out.println(reverse);
		// println은 String으로 변환하지 않아도 된다
	}
}
