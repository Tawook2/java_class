package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	public static void main(String[] args) {
		
		// ����ڰ� ���ڸ� �Է����� ��
		// 1. 10���� �Է��� ������ �� ���� ���غ�����
		// 2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ�
		// 		�� �� �� ������ ����غ�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է� >");
		
		
		
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
			System.out.printf("10���� �Է��� ���� %d ������ ������ %d �Դϴ�\n", num1,sum);
		}
		else {
			for(int i = 10; i >= num1; i--) {
				sum += i;
			}
			System.out.printf("10���� �Է��� ���� %d ������ ������ %d �Դϴ�\n", num1,sum);
		}
		
		System.out.println("���ڸ� �Է� >");
		
		
		int num2 = sc.nextInt();
		int count = 0;
		if(num2 > 0) {
		
			for(int i = 1; i <= num2; i++) {
				if(i % 3 ==0) {
					System.out.println(i);
					count++;
				}
			}
			System.out.printf("3�� ����� ������ %d �� �Դϴ�.\n", count);
		}
		
		
		else {
			
			for(int i =1; i >= num2; i--) {
				if(i % 3 ==0) {
					System.out.println(i);
					count++;
				}
			}
			System.out.printf("3�� ����� ������ %d �� �Դϴ�.\n", count);	
		}
	}
}	
	
	
