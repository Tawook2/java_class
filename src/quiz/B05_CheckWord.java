package quiz;

import java.util.Scanner;

public class B05_CheckWord {

	public static void main(String[] args) {
		
		// ����ڷκ��� �ܾ �ϳ� �Է¹ް�
		// ù��° �ܾ�� ������ �ܾ ��ġ�ϸ� "OK"�� ���
		// �ƴ϶�� "NOT OK" �� ����غ�����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܾ �Է� >");
		String word = sc.next();	
		
		String checkWord = (word.charAt(0) == word.charAt(word.length()-1) ) ? String.format("OK") : String.format("NOT OKAY");
		System.out.println(checkWord);
	}
}
