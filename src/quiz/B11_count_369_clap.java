package quiz;

import java.util.Scanner;

public class B11_count_369_clap {

	// ����ڷκ��� ���� �ϳ��� �Է¹ް�
	// �ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������
	
	//String check = "" + i;
	// digit % 3 == 0 && digit != 0
	
	public static void main(String[] args) {
		
		// # ���α׷� ����ð� ���� (������ 1000)
		long start_time = System.currentTimeMillis();
		
		System.out.println("������ �Է�");
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
					if(debugMode) System.out.print("¦");
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
		
		System.out.println("�ɸ� �ð� : " + (end_time - start_time));
	}
}
