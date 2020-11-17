package crypto;

import java.util.Arrays;

public class TranspositionCipher extends Cipher {

	// # ��ġ ��ȣ
	//	- �޼����� Key�� ��ŭ�� ���̸� ���� �� �ٸ� �������� �о ��ȣȭ �ϴ� ���
	
	// ex>
	
	// plain : Common sense is not so common. 30 	o
	// Key : 8										o
		
	// 0 1 2 3 4 5 6 7
	// ---------------
	// C o m m o n   s		0	1
	// e n s e   i s  		8	9
	// n o t   s o   c		16	17
	// o m m o n .			24	25
	//						% 8
	
	// crypto : Cenoonommstmme oo snnio. s s c
	
	// 0 1 2 3
	// C e n o
	// o n o m
	// m s t m
	// m e   o
	// o   s n
	// n i o .
	//   s   
	// s   c
	int key;
	
	public TranspositionCipher(int key) {
		this.key = key;
	}
	
	
	// eccryption �޼����� ������ ������ȣ�� ��ġ��Ű�� ���� ����
	public String encryption(String plain) {
		StringBuilder[] builders = getBuilders(key);
		
		int len = plain.length();
		
		for(int i = 0; i < len; i++) {
			builders[i % key].append(plain.charAt(i));
		}
		
		return joinBuilders(builders);
	}
	
	public String decryption(String crypto) {
		int len = crypto.length();
		
		int columnSize = len % key > 0 ? len / key + 1 : len / key;
		int numOfBlanks = columnSize * key - len;
		int numOfFull = key - numOfBlanks;
		
//		System.out.println("Xǥ ���� : " + numOfBlanks);
//		System.out.println("�� �� �� ���� : " + numOfFull);
		
		StringBuilder[] builders = getBuilders(columnSize);
		
		
		
		
		for(int column = 0;  column < columnSize; column++) {
			
			int crypto_index = column;
			
			// �� ���� �ݺ��ɶ����� FullLine�� ��� �÷���ŭ �ε��� ����
			// FullLine�� �ƴ� ��� �÷� -1 ��ŭ �ε��� ����
			for(int row = 0; row < key; row++) {
				builders[column].append(crypto.charAt(crypto_index));
				
				//System.out.printf("%d�� ������ %c�� �߰���\n",column,crypto.charAt(crypto_index));
				
				if(row < numOfFull) {
					crypto_index += columnSize;
				}else {
					crypto_index += columnSize -1;
				}
				
				// �߰��� index�� ������ �÷��̸鼭 ���ÿ� ������ fullLine�� ���
				if(column ==  columnSize - 1 && row == numOfFull -1) {
					break;
				}
				
				if(crypto_index >= len) {
					break;
				}
			}
		}
		
		return joinBuilders(builders);
	}
	
	private String joinBuilders(StringBuilder[] builders) {
		
		StringBuilder result = new StringBuilder();
		
		for(StringBuilder builder : builders) {
			result.append(builder);
		}
		
		return result.toString();
	}
	
	private StringBuilder[] getBuilders(int columnSize) {
		StringBuilder[] builders = new StringBuilder[columnSize];
		
		// �� �߸��� �ҽ�
		//	- �ӽ� ������ builder�� ���ο� �ν��Ͻ��� ����� �ִ� ���̱� ������
		//	  ������ �ȴ�
//		for(StringBuilder builder : builders) {
//			builder = new StringBuilder();
//		}
		
		
		for(int i = 0; i < builders.length; i++) {
			builders[i] = new StringBuilder();
		}
		// ��Ȯ�ϰ� 0�� �ε������ٰ� ��Ȯ�� ���� �־���
		
		
		return builders;
	}
	
	
	public static void main(String[] args) {
		
		String crypto = new TranspositionCipher(8).encryption("Common sense is not so common.");
		
		System.out.println(crypto);
		
		String plain = new TranspositionCipher(8).decryption(crypto);
		
		System.out.println(plain);
	}
}












































