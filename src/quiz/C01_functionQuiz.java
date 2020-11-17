package quiz;

public class C01_functionQuiz {

	// # 다음 함수를 정의해보세요
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	// 3. 숫자를 한 개 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	// 4. 전달한 숫자가 소수인지 아닌지 판별해주는 함수 (boolean)
	// 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	//	  factorial : (n)*(n-1)*(n-2)...3*2*1
	// 6. 숫자 두개 (a, b)를 전달하면 a의 b제곱을 반환하는 함수
	//	  (0제곱은 1을 반환해야함, Math.pow금지)
	
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean check_alpha(char word) {
		
		// 한줄 시도 해보기
		boolean check = false;
		if(word >= 'a' && word <= 'z')
			check = true;
		else if(word >= 'A' && word <= 'Z')
			check = true;
		
		return check;
	}
	
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean checkNum(int num) {
		// 한줄 시도 해보기
		boolean check = false;
		if(num % 3 == 0)
			check = true;
		return check;
	}
	
	// 3. 숫자를 한 개 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	public static String check_even(int num) {
		// 한줄 시도 해보기
		String str = num % 2 == 0 ? "짝수입니다" : "홀수입니다";
		return str;
	}
	
	// 4. 전달한 숫자가 소수인지 아닌지 판별해주는 함수 (boolean)
	public static boolean check_prime(int num) {
		boolean check = false;
		int prime = 0;		
		
		if(num == 1) {
			return false;
		}
				
		int sqrt = (int)Math.sqrt(num);
		for(int j = 2; j <= sqrt; j++) {
				
			if(num % j == 0) {
				return check;
				
			}
		}
		if(prime == 0) {
			check = true;
		}
	
		return check;
	}
	
	// 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	//	  factorial : (n)*(n-1)*(n-2)...3*2*1
	public static int check_fact(int num) {
		int result = 1;
		
		for(int i = num; i > 0; i--) {
			result *= i;
				
		}
		return result;
	}
	
	// 재귀 함수 : 자기 자신을 부르는 함수 (성능 안좋음, 읽기 힏듬, 머리 아픔)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1;
		}
		
		return num * recursive_factorial(num - 1);
		
	}
	
	
	// 6. 숫자 두개 (a, b)를 전달하면 a의 b제곱을 반환하는 함수
	//	  (0제곱은 1을 반환해야함, Math.pow금지)
	public static int mathPow(int a, int b) {
		int result = 1;
		for(int i = 0; i < b; i++) { //3 4 3 3 3 3
			result *= a;
		}
		return result;
	}
	
	public static int recursive_pow(int a, int b) {
		if(b == 0) {
			return 1;
		}

		return a * recursive_pow(a, b - 1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(check_alpha('a'));
		
		System.out.println(checkNum(76));
		
		System.out.println(check_even(21));
		
		System.out.println(check_prime(14));
		
		System.out.println(check_fact(4));
		
		System.out.println(recursive_factorial(5));
		
		System.out.println(mathPow(6, 3));
		
		System.out.println(recursive_pow(6, 3));
	}
}
