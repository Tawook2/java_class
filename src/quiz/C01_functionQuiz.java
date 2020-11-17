package quiz;

public class C01_functionQuiz {

	// # ���� �Լ��� �����غ�����
	// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 3. ���ڸ� �� �� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	// 4. ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)
	// 5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	//	  factorial : (n)*(n-1)*(n-2)...3*2*1
	// 6. ���� �ΰ� (a, b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
	//	  (0������ 1�� ��ȯ�ؾ���, Math.pow����)
	
	// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean check_alpha(char word) {
		
		// ���� �õ� �غ���
		boolean check = false;
		if(word >= 'a' && word <= 'z')
			check = true;
		else if(word >= 'A' && word <= 'Z')
			check = true;
		
		return check;
	}
	
	// 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean checkNum(int num) {
		// ���� �õ� �غ���
		boolean check = false;
		if(num % 3 == 0)
			check = true;
		return check;
	}
	
	// 3. ���ڸ� �� �� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	public static String check_even(int num) {
		// ���� �õ� �غ���
		String str = num % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
		return str;
	}
	
	// 4. ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)
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
	
	// 5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	//	  factorial : (n)*(n-1)*(n-2)...3*2*1
	public static int check_fact(int num) {
		int result = 1;
		
		for(int i = num; i > 0; i--) {
			result *= i;
				
		}
		return result;
	}
	
	// ��� �Լ� : �ڱ� �ڽ��� �θ��� �Լ� (���� ������, �б� �C��, �Ӹ� ����)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1;
		}
		
		return num * recursive_factorial(num - 1);
		
	}
	
	
	// 6. ���� �ΰ� (a, b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
	//	  (0������ 1�� ��ȯ�ؾ���, Math.pow����)
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
