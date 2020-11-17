package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C12_inputRightThing {

	public static void main(String[] args) {
		
		// 사용자로부터 int타입의 데이터를 입력받아보세요
		// 잘못된 타입의 데이터가 들어오더라도 프로그램이 종료되지 않아야 합니다.
		// (올바르게 int가 입력된 경우 프로그램이 종료됩니다
		
		// ※ 함수 이용해서 만들어보기
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		
			
		while(true) {
			System.out.println("데이터 입력 > ");
			
			try {
				num = sc.nextInt();	
				System.out.println(num);
				return;
			} catch(InputMismatchException e) {
				sc.nextLine();
				System.err.println("잘못입력하셨습니다");
				
				
			}
		}
	}
}
