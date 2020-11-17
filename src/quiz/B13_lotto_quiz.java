package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	public static void main(String[] args) {
		
		// 1���� 45������ �ߺ����� ���� ���� 6���� �̷���� �迭�� �����غ�����
		
		
		
		
		
		// �� �̾Ҵ� ���� ����صα�
		int[] lotto = new int[6];
		int[] number = new int[45];
		
		Random ran  = new Random();
		
		for(int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		
		for(int i = 0; i < 6; ++i) {
			int random_index = ran.nextInt(45);
			
			if(number[random_index] != -1) {
				lotto[i] = number[random_index];
				number[random_index] = -1;
				
			}
			
		}
		System.out.println("���� ���� : " + Arrays.toString(number));
		System.out.println(Arrays.toString(lotto));
		
		for(int i = 0; i < 5000; i++) {
			int random_index = ran.nextInt(44) + 1;
			
			int temp = number[0];
			number[0] = number[random_index];
			number[random_index] = temp;
				
		}
		
		for(int i = 0; i < 6; ++i) {
			System.out.println(number[i]);
		}
		
		
//		// �� �ߺ��� ������ �ٽ� �̱�
//		int[] lotto = new int[6];
//		int i = 0;
//		
//		while(i != 6) {
//			boolean duple = false;
//			lotto[i] = (int)(Math.random() * 45 + 1);
//			
//			// 3���� �̾��� �� 0, 1, 2�� �񱳸� �ؼ� 
//			// �Ȱ��� ���� �ִٸ� i�� ������Ű�� �ʴ´�
//			for(int j = 0; j < i; j++) {
//				
//				if(lotto[i] == lotto[j]) {
//					duple = true;
//					break;
//				}
//			}
//			if(!duple) {
//				i++;
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(lotto));
		
		
		
//		Random ran = new Random();
//		
//		int[] lotto_list = new int[6];
//		
//		for(int i = 0; i < 6; i++) {
//			
//			lotto_list[i] = ran.nextInt(45) + 1;
//			
//			for(int j = 0; j < lotto_list.length; j++) {
//				
//				if(lotto_list[j] == lotto_list[i]) {
//					continue;
//				}
//				else {
//					lotto_list[j] = ran.nextInt(45) + 1;
//				}
//			}
//			
//			
//			
//			
//			
//		}
//		System.out.println(Arrays.toString(lotto_list));
	}
}
