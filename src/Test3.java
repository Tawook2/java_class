import java.util.Random;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Random ran = new Random();
		int jackpot = ran.nextInt(1000);
		int count = 0;
		Scanner sc = new Scanner(System.in);	
		while(true) {
		
			System.out.println("���ڸ� �Է����ּ��� (0 ~ 1000)");
			int user_num = sc.nextInt();
			count++;
			
			if(user_num > 1000) {
				System.err.printf("�Է��� %d �� ���� ������ �ʰ��Ͽ����ϴ�\n",user_num);
			}
			else if(user_num < jackpot) {
				System.out.printf("%d ���� UP!\n", user_num);
			}
			else if(user_num > jackpot) {
				System.out.printf("%d ���� DOWN!\n", user_num);
			}
			if(jackpot == user_num) {
				System.out.println("����!");
				break;
			}
				
		}
		System.out.printf("���� : '%d' - �� �õ� Ƚ���� %d �Դϴ�",jackpot, count);
	
	}
}








































