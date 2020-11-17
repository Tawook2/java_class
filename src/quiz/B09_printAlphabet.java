package quiz;

public class B09_printAlphabet {

	public static void main(String[] args) {
		
		// 1. 반복문을 이용하여 A 부터 Z 까지 출력해보세요
		
		// 2. 반복문을 이용하여 z부터 a까지 출력해보세요
		
		// for문안에 char타입이 들어갈 수 있다
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		for(int j = 'z'; j >= 'a'; j--) {
			System.out.print((char)j + " ");
		}
	}
}
