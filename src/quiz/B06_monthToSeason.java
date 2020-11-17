package quiz;

import java.util.Scanner;

public class B06_monthToSeason {

	public static void main(String[] args) {
		// 사용자로부터 달을 입력 받으면 해당하는 계절을 출력해보세요
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("달을 숫자로 입력해주세요");
		
		int month = sc.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("입력한 달에는 해당하는 계절이 없습니다");
		
		}
		
	}
}
