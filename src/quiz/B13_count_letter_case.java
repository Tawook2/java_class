package quiz;

public class B13_count_letter_case {

	// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
	// �ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ����غ�����
	// (��ҹ���, �ҹ���, ���ڸ� ����˴ϴ� )
	
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
					System.out.printf("%c �� ������ Ƚ���� %d�� �Դϴ�.\n", i , count[i]);					
				}
				
			}
	}
}
