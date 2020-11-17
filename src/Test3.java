import java.util.Random;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Random ran = new Random();
		int jackpot = ran.nextInt(1000);
		int count = 0;
		Scanner sc = new Scanner(System.in);	
		while(true) {
		
			System.out.println("숫자를 입력해주세요 (0 ~ 1000)");
			int user_num = sc.nextInt();
			count++;
			
			if(user_num > 1000) {
				System.err.printf("입력한 %d 는 숫자 범위를 초과하였습니다\n",user_num);
			}
			else if(user_num < jackpot) {
				System.out.printf("%d 보다 UP!\n", user_num);
			}
			else if(user_num > jackpot) {
				System.out.printf("%d 보다 DOWN!\n", user_num);
			}
			if(jackpot == user_num) {
				System.out.println("정답!");
				break;
			}
				
		}
		System.out.printf("정답 : '%d' - 총 시도 횟수는 %d 입니다",jackpot, count);
	
	}
}








































