package quiz;

import java.util.Scanner;

public class B10_NextPrime {

	// 사용자로부터 숫자를 입력받으면
	// 입력받은 수보다 더 크거나 같은 다음 소수를 찾아서 출력해보세요
	
	// 3 5
	public static void main(String[] args) {
		
		System.out.println("숫자 입력 >");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int prime = 0;
		int count = 0;
		// i : 소수인지 테스트 해볼 숫자
		for(int i = num; i >= num; i++) {
			prime = 0;
			// j : i의 약수인지 테스트 해볼 숫자
			int sqrt = (int)Math.sqrt(i);
			for(int j = 2; j <= sqrt; j++) {
				
				if(i % j == 0) {
					prime++;	
				}
			}
			if(prime == 0) {
				System.out.println(i);
				count++;
			}
		if(count == 2)
			break;
		}
	}
}
