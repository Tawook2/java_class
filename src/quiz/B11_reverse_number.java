package quiz;

import java.util.Scanner;

public class B11_reverse_number {

	// 사용자로부터 정수를 하나 입력받고
	// 그 정수를 일의 자리부터 한자리씩 출력해보세요
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 >");
	
		int num1 = sc.nextInt();
		int reversed = 0;
		
		while(true) {
			
			
			//System.out.print(num1 % 10);
			
			reversed += num1 % 10;
			
			num1 /= 10;
			
			
			if(num1 <= 0) {	
				break;
			}
			reversed *= 10;
		}
		System.out.println(reversed);
	}
}
