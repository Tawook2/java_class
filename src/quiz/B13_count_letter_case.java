package quiz;

public class B13_count_letter_case {

	// 사용자로부터 문장을 하나 입력받았다 치고
	// 해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 출력해보세요
	// (대소문자, 소문자, 숫자만 집계됩니다 )
	
	public static void main(String[] args) {
		
	String msg = "123 The Quick Brown Fox Jumps Over a Lazy Dog 123";
			
			
			
			int[] count = new int[150];
			
			for(int i = 0; i < msg.length(); i++) {
				
				char ch = msg.charAt(i);
				
				if(ch >= '0' && ch <= '9')
					count[ch] += 1;
				
				else if(ch >= 'A' && ch <= 'Z')
					count[ch - 'A' + 'A'] += 1;
				
				else if(ch >= 'a' && ch <= 'z')
					count[ch - 'a' + 'a'] += 1;
			}
			
			for(int i = 0; i < 150; i++) {
				if(count[i] > 0) {
					System.out.printf("%c 가 등장한 횟수는 %d번 입니다.\n", i , count[i]);					
				}
				
			}
	}
}
