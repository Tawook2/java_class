package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	public static void main(String[] args) {
		
		// 1부터 45사이의 중복없는 랜덤 숫자 6개로 이루어진 배열을 생성해보세요
		
		
		
		
		
		// ※ 뽑았던 숫자 기록해두기
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
		System.out.println("숫자 상태 : " + Arrays.toString(number));
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
		
		
//		// ※ 중복이 있으면 다시 뽑기
//		int[] lotto = new int[6];
//		int i = 0;
//		
//		while(i != 6) {
//			boolean duple = false;
//			lotto[i] = (int)(Math.random() * 45 + 1);
//			
//			// 3까지 뽑았을 때 0, 1, 2와 비교를 해서 
//			// 똑같은 값이 있다면 i를 증가시키지 않는다
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
