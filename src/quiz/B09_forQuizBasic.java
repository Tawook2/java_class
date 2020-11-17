package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	public static void main(String[] args) {
		
		// 사용자가 숫자르 입력했을 때
		// 1. 10부터 입력한 숫자의 총 합을 구해보세요
		// 2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고
		// 		총 몇 개 인지도 출력해보세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력 >");
		
		
		
		int num1 = sc.nextInt();
		
		/*
		 int start = 10;
		 int end = user;
		 
		 if(start > end){
		 	int temp = start;
		 	start = end;
		 	end = temp;
		 }
		  
		 */
		
		int sum = 0;
		if(num1 > 0) {
			
			for(int i = 10; i <= num1; i++) {
				sum += i;
			}
			System.out.printf("10부터 입력한 숫자 %d 까지의 총합은 %d 입니다\n", num1,sum);
		}
		else {
			for(int i = 10; i >= num1; i--) {
				sum += i;
			}
			System.out.printf("10부터 입력한 숫자 %d 까지의 총합은 %d 입니다\n", num1,sum);
		}
		
		System.out.println("숫자를 입력 >");
		
		
		int num2 = sc.nextInt();
		int count = 0;
		if(num2 > 0) {
		
			for(int i = 1; i <= num2; i++) {
				if(i % 3 ==0) {
					System.out.println(i);
					count++;
				}
			}
			System.out.printf("3의 배수의 갯수는 %d 개 입니다.\n", count);
		}
		
		
		else {
			
			for(int i =1; i >= num2; i--) {
				if(i % 3 ==0) {
					System.out.println(i);
					count++;
				}
			}
			System.out.printf("3의 배수의 갯수는 %d 개 입니다.\n", count);	
		}
	}
}	
	
	
