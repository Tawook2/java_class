package quiz;

public class B09_printAlphabet {

	public static void main(String[] args) {
		
		// 1. �ݺ����� �̿��Ͽ� A ���� Z ���� ����غ�����
		
		// 2. �ݺ����� �̿��Ͽ� z���� a���� ����غ�����
		
		// for���ȿ� charŸ���� �� �� �ִ�
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		for(int j = 'z'; j >= 'a'; j--) {
			System.out.print((char)j + " ");
		}
	}
}
