package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	// # 31게임을 만들어보세요
	
	// 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택한다 (1, 2, 3)
	
	// 2. 컴퓨터는 랜덤으로 숫자를 선택한다
	
	// 3. 마지막에 31을 부르는 사람 혹은 컴퓨터가 패배한다
	
	// boolean  computer_turn = ran.nextBoolean();
	// if(computer_turn)
	// computer_turn = !computer_turn;
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int first = ran.nextInt(2);
		int computer = 0;
		int human = 0;
		int currentNum = 0;
		
		
		System.out.println("게임을 시작합니다 !");
		//int first = sc.nextInt(); 선공 후공 정하기
		switch(first) {
		case 0:
			System.out.println("컴퓨터의 선공 시작");
			System.out.println();
			while(currentNum != 31) {
				
				System.out.println("컴퓨터 차례 : ");
				
				
				// 컴퓨터가 currentNum을 본 후
				// 2, 6, 10, 14, 18, 22, 26, 30을 만들면 무조건 이김
				if(currentNum % 4 == 0 ) {
					computer =2;
				}else if(currentNum % 4 == 3) {
					computer =3;
				}else if(currentNum % 4 == 1) {
					computer = 1;
				}else {
					computer = ran.nextInt(3) + 1;
				}
				
				System.out.println("컴퓨터 > " + computer);
				currentNum += computer;
				System.out.println("\t현재 숫자 : " + currentNum);
				if(currentNum >= 31) {
					System.out.println("컴퓨터 패배");
					System.exit(0);
				}
				System.out.println();
				System.out.println("내 차례 : 숫자입력( ? )");
				
				
				
				while(true) {
					human = sc.nextInt();
					if(human > 0 && human < 4) {
						System.out.println("사람 > " + human);
						currentNum += human;
						System.out.println("\t현재 숫자 : " + currentNum);
						if(currentNum >= 31) {
							System.out.println("사람 패배");
							System.exit(0);
						}
						break;
					}
					else {
						System.out.println("'1' 과 '3' 사이에 숫자만 입력해주세요");
						System.out.println("내 차례 : 숫자입력( ? )");
					}
				}
				System.out.println();
			
			}
			
			break;
			
		case 1:
			
			System.out.println("나의 선공 시작");
			System.out.println();
			while(currentNum != 31) {
				
				
				System.out.println("내 차례 : 숫자입력( ? )");
				
				while(true) {
					human = sc.nextInt();
					if(human > 0 && human < 4) {
						System.out.println("사람 > " + human);
						currentNum += human;
						System.out.println("\t현재 숫자 : " + currentNum);
						if(currentNum >= 31) {
							System.out.println("사람 패배");
							System.exit(0);
						}
						break;
					}
					else {
						System.out.println("'1' 과 '3' 사이에 숫자만 입력해주세요");
						System.out.println("내 차례 : 숫자입력( ? )");
					}
				}
				
				System.out.println();
				
				System.out.println("컴퓨터 차례 : ");
				computer = ran.nextInt(3) + 1;
				System.out.println("컴퓨터 > " + computer);
				currentNum += computer;
				System.out.println("\t현재 숫자 : " + currentNum);
				if(currentNum >= 31) {
					System.out.println("컴퓨터 패배");
					System.exit(0);
				}
				System.out.println();
			
			}
			
			break;
		
		}
	}
}
