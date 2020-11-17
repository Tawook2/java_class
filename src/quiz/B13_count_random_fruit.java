package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {

	public static void main(String[] args) {
		
		// 1. ũ�� 100�� �迭�� ���� ���� ���ڿ��� �����غ�����
		// 	  �����ϴ� ���� : apple, banana, orange, peach, kiwi
		
		String[] fruits = {"apple", "banana", "orange", "peach", "kiwi"};
		
		String[] fruit_basket = new String[100];
		
		int[] count = new int[5];
		
		Random ran = new Random();
		
		for(int i = 0; i < 100;  i++) {
			
			fruit_basket[i] = fruits[ran.nextInt(5)];
			
			for(int j = 0; j < 5; j++) {
				if(fruit_basket[i] == fruits[j] ) {
					count[j] += 1;
					break; // ã���� ���� Ż��
				}
			}
		}
		
		System.out.println(Arrays.toString(fruit_basket));
		
		
		// 2. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ�����
		
		for(int j = 0; j < 5; j++) {
			if(count[j] > 0)
			System.out.printf("%s - %d\n", fruits[j], count[j]);
		}
		
		// # enum�� ����
		int apple = 0;
		int banana = 1;
		int orange = 2;
		
		System.out.println("�������� ��ȣ : " + orange);
		System.out.println("�������� ���? " + count[orange]);
		System.out.println("������ �̸� : " + fruits[orange]);
	}
}
