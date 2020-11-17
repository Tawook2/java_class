package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_count_random_fruit {

	public static void main(String[] args) {
		
		// 1. 크기 100의 배열에 랜덤 과일 문자열을 저장해보세요
		// 	  등장하는 과일 : apple, banana, orange, peach, kiwi
		
		String[] fruits = {"apple", "banana", "orange", "peach", "kiwi"};
		
		String[] fruit_basket = new String[100];
		
		int[] count = new int[5];
		
		Random ran = new Random();
		
		for(int i = 0; i < 100;  i++) {
			
			fruit_basket[i] = fruits[ran.nextInt(5)];
			
			for(int j = 0; j < 5; j++) {
				if(fruit_basket[i] == fruits[j] ) {
					count[j] += 1;
					break; // 찾으면 포문 탈출
				}
			}
		}
		
		System.out.println(Arrays.toString(fruit_basket));
		
		
		// 2. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해보세요
		
		for(int j = 0; j < 5; j++) {
			if(count[j] > 0)
			System.out.printf("%s - %d\n", fruits[j], count[j]);
		}
		
		// # enum의 시초
		int apple = 0;
		int banana = 1;
		int orange = 2;
		
		System.out.println("오렌지의 번호 : " + orange);
		System.out.println("오렌지가 몇번? " + count[orange]);
		System.out.println("오렌지 이름 : " + fruits[orange]);
	}
}
