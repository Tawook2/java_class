package quiz;

public class B11_whileQuiz {

	// while문을 이용하여
	
	// 1. 1부터 100 까지의 3의 배수의 총합을 구해보세요
	
	// 2. 200부터 1까지 출력해보세요
	
	// 3. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 구해보세요
	public static void main(String[] args) {
		
		// 1.
		int num1 = 1;
		int sum = 0;
		while(num1 <= 100) {
			if(num1 % 3 == 0)
				sum += num1;
			num1++;
			
		}
		System.out.println(sum);
		System.out.println();
		
		// 2.
		num1 = 200;
		while(num1 > 0) {
			System.out.print(num1 + " ");
			num1--;
			if(num1 % 10 == 0)
				System.out.println();
		}
		System.out.println();
		
		// 3.
		num1 = 1;
		sum = 0;
		while(num1 <= 200) {
			if(!(num1 % 2 == 0 || num1 % 3 == 0)){
				sum += num1;	
			}
			num1++;
					
		}
		System.out.println(sum);
	}
}
