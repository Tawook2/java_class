package quiz;

import java.util.Arrays;

public class C01_functionQuiz2 {
	
	public static int max = 0;
	public static int min = 0;

	public static void main(String[] args) {
		
		// 1. 최소값과 최대값을 매개변수로 받고, 그 사이의 모든 값을 포함하는
		//	  int배열을 생성하여 반환하는 range함수를 만들어보세요
		//	  (최소값 이상, 최대값 미만)
		
		// 2. 최대값을 매개변수로 전달 받으면, 0부터 최대값 미만의 모든 값을 포함하는
		//	  range2 함수를 만들어보세요
		
		// 3. 문자열 배열을 전달 받으면, 해당 배열을 모두 이어 붙이는
		//	  join 함수를 만들어 보세요
		//	ex:{"apple", "banana", "orange" }
		//		-> "apple/banana/orange"
		
		// 4. 문자열 타입의 숫자, 원래 진법(base_from), 바꾸려는 진법(base_to)
		//	  를 전달받으면 base_from의 진법이었던 해당 숫자를 base_to진법의 num을
		//	  base_to 진법의 문자열로 변환하여 반환하는 하무를 만들어 보세요
		//	  ※ 만약, 진법이 잘못된 경우 null을 반환합니다
		//	  ※ 변환할 수 있는 최대 진법은 36진번이고 최소 진법은 2다
		
		
		int num1 = 100;
		int num2 = 1;
		
		int base_from = 10;
		int base_to = 2;
		
		String[] fruits = new String[] {"apple", "banana", "orange"};
		
		
		// # 함수의 오버로딩
		//	- 같은 함수 이름으로 다양한 형태의 함수를 정의할 수 있다
		//	- 다른 형태의 함수로 인정받기 위해서는
		//	  매개변수의 개수 혹은 타입이 달라야 한다
		
		System.out.println(Arrays.toString(range(num1, num2)));
		
		System.out.println(Arrays.toString(range2(num1)));
		
		// println은 다양한 매개변수 타입을 받을 수 있도록 오버로딩 되어 있다
		System.out.println(123);
		System.out.println("123");
		System.out.println('a');
		System.out.println(123.123);
		
		System.out.println("-------------------------------------");
		
		System.out.println(join(fruits, "$"));
		
		//System.out.println(transform("1101", 2, 10));
		
		System.out.println("-------------------------------------");
		System.out.println(convert_base("10", 10, 2));
		System.out.println(convert_base("1010", 2, 10));
		System.out.println(convert_base("123", 2, 2));
		
	}
	
	// 1. 최소값과 최대값을 매개변수로 받고, 그 사이의 모든 값을 포함하는
			//	  int배열을 생성하여 반환하는 range함수를 만들어보세요
			//	  (최소값 이상, 최대값 미만)
	
	public static int[] range(int num1, int num2) { 
		if(num1 > num2) {
			max = num1;
			min = num2;
		}
		else {
			max = num2;
			min = num1;
		}
		
		int[] numArray1 = new int[max-min];
		
		for(int i = min; i < numArray1.length; i++) {
			numArray1[i] = i;
		}
		
		return numArray1;
		
	}
	
	// 2. 최대값을 매개변수로 전달 받으면, 0부터 최대값 미만의 모든 값을 포함하는
	//	  range2 함수를 만들어보세요.
	public static int[] range2(int num1) {
	
		max = num1;
		
		int[] numArray2 = new int[max];
		
		for(int i = 0; i < numArray2.length; i++) {
			numArray2[i] = i;
		}
		
		return numArray2;
	}
	
	// 3. 문자열 배열을 전달 받으면, 해당 배열을 모두 이어 붙이는
	//	  join 함수를 만들어 보세요
	//	ex:{"apple", "banana", "orange" }
	//		-> "apple/banana/orange"
	
	public static String join(String[] fruits, String sep) {
		
		StringBuilder mix = new StringBuilder("");
		
		for(int i = 0; i < fruits.length; i++) {
			mix.append(fruits[i]);
			mix.append(sep);
		}
		return mix.toString();
	}
//--------------------------------------------------------------------------------------------------	
	// 4. 문자열 타입의 숫자, 원래 진법(base_from), 바꾸려는 진법(base_to)
	//	  를 전달받으면 base_from의 진법이었던 해당 숫자를 base_from진법의 num을
	//	  base_to 진법의 문자열로 변환하여 반환하는 함수를 만들어 보세요
	//	  ※ 만약, 진법이 잘못된 경우 null을 반환합니다
	//	  ※ 변환할 수 있는 최대 진법은 36진번이고 최소 진법은 2다
	
	public static char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	
	public static char getSymbol(int value) {
		
		return digits[value];
	}
	
	
	public static int getValue(char digit) {
		
		for (int i = 0; i < digits.length; i++) {
			
			if(digits[i] == digit) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static String convert_base(String num, int base_from, int base_to) {
		num = num.toUpperCase();
		
		
		if(base_from < 2 || base_from > 36 || base_to < 2 || base_from > 36) {
			System.err.println("RadixError : 사용가능한 진법은 2부터 36입니다.");
			return null;
		}
		
		//------------------------------------
		int pow = num.length() - 1;  // 2 - 1 = 1
		long real_value = 0;
		
		for(int i = pow; i > -1; i--) { // 1 ~ 0
			
			char digit = num.charAt(pow - i); // 1 - 1 = 0, 1 - 0 = 1
			int value = getValue(digit);
		//-------------------------------------	
			// 8진법인데 8이상의 숫자가 있으면 에러
			if(value >= base_from) {
				System.err.println("base_from 이상의 값을 지닌 문자가 있습니다.");
				return null;
			}
			
			System.out.println(digit);
			System.out.println("\t실제 값 : " + value);
			System.out.println("\t" +Math.pow(base_from, i) + "의 자리");
			
			real_value += value * Math.pow(base_from, i);
			//real_value +=
		}
		
		System.out.println(base_from + "문자열 \"" +  num + "\"의 값은 값은 실제로 " + real_value + "입니다.");
		
		StringBuilder result = new StringBuilder();
		
		
		// 123456 10진수 123456으로 변환하는 방법
		
		
		while(real_value > 0) {
			result.append(getSymbol((int)(real_value % base_to)));
			real_value /= base_to;
		}
		
		return result.reverse().toString();
	}
	
	
	
	
	
	
	
	
	
	
//	※ 내꺼 10진수만 됨
//	public static StringBuilder transform(String num, int base_form, int base_to) {
//		StringBuilder result = new StringBuilder("");
//		
//		// 나누어지면 1 안나누어지면 0
//		int num_result = 0;
//		int input_num = Integer.parseInt(num);
//		
//		for(int i = 0; i < num.length(); i++) {
//			
//			while(input_num > 0) {
//				num_result += ((input_num % base_to)) * (Math.pow(base_form, i));
//				
//				i++;
//				input_num /= base_to;
//				
//			}
//			
//			
//		}
//		result.append(num_result);
//		
//		
//		return result;
//	}
	
		
}








































