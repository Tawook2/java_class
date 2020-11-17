package quiz;

import java.util.Scanner;

public class B11_count_369_clap {

	// 사용자로부터 정수 하나를 입력받고
	// 해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야하는지 세어보세요
	
	//String check = "" + i;
	// digit % 3 == 0 && digit != 0
	
	public static void main(String[] args) {
		
		// # 프로그램 실행시간 측정 (나누기 1000)
		long start_time = System.currentTimeMillis();
		
		System.out.println("정수를 입력");
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		int clap = 0;
		int num = 1;
		int checkNum = 0;
		
		boolean debugMode = true;
		
		while(num <= end) {
			checkNum = num;
			int tmp = 0;
			
			if(debugMode) System.out.printf("%d : ", checkNum);
			
			while(checkNum > 0) {
				
				if(checkNum % 10 == 3 || checkNum % 10 == 6 || checkNum % 10 == 9) {
					
					clap++;
					if(debugMode) System.out.print("짝");
					tmp++;
						
				}
				
				checkNum /= 10;
					
			}	
			if(debugMode) {
				System.out.println();
			}
			 	
				
			num++;
		}
		System.out.println(clap);
		
		long end_time = System.currentTimeMillis();
		
		System.out.println("걸린 시간 : " + (end_time - start_time));
	}
}
