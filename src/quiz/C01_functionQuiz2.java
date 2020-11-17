package quiz;

import java.util.Arrays;

public class C01_functionQuiz2 {
	
	public static int max = 0;
	public static int min = 0;

	public static void main(String[] args) {
		
		// 1. �ּҰ��� �ִ밪�� �Ű������� �ް�, �� ������ ��� ���� �����ϴ�
		//	  int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ��������
		//	  (�ּҰ� �̻�, �ִ밪 �̸�)
		
		// 2. �ִ밪�� �Ű������� ���� ������, 0���� �ִ밪 �̸��� ��� ���� �����ϴ�
		//	  range2 �Լ��� ��������
		
		// 3. ���ڿ� �迭�� ���� ������, �ش� �迭�� ��� �̾� ���̴�
		//	  join �Լ��� ����� ������
		//	ex:{"apple", "banana", "orange" }
		//		-> "apple/banana/orange"
		
		// 4. ���ڿ� Ÿ���� ����, ���� ����(base_from), �ٲٷ��� ����(base_to)
		//	  �� ���޹����� base_from�� �����̾��� �ش� ���ڸ� base_to������ num��
		//	  base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Ϲ��� ����� ������
		//	  �� ����, ������ �߸��� ��� null�� ��ȯ�մϴ�
		//	  �� ��ȯ�� �� �ִ� �ִ� ������ 36�����̰� �ּ� ������ 2��
		
		
		int num1 = 100;
		int num2 = 1;
		
		int base_from = 10;
		int base_to = 2;
		
		String[] fruits = new String[] {"apple", "banana", "orange"};
		
		
		// # �Լ��� �����ε�
		//	- ���� �Լ� �̸����� �پ��� ������ �Լ��� ������ �� �ִ�
		//	- �ٸ� ������ �Լ��� �����ޱ� ���ؼ���
		//	  �Ű������� ���� Ȥ�� Ÿ���� �޶�� �Ѵ�
		
		System.out.println(Arrays.toString(range(num1, num2)));
		
		System.out.println(Arrays.toString(range2(num1)));
		
		// println�� �پ��� �Ű����� Ÿ���� ���� �� �ֵ��� �����ε� �Ǿ� �ִ�
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
	
	// 1. �ּҰ��� �ִ밪�� �Ű������� �ް�, �� ������ ��� ���� �����ϴ�
			//	  int�迭�� �����Ͽ� ��ȯ�ϴ� range�Լ��� ��������
			//	  (�ּҰ� �̻�, �ִ밪 �̸�)
	
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
	
	// 2. �ִ밪�� �Ű������� ���� ������, 0���� �ִ밪 �̸��� ��� ���� �����ϴ�
	//	  range2 �Լ��� ��������.
	public static int[] range2(int num1) {
	
		max = num1;
		
		int[] numArray2 = new int[max];
		
		for(int i = 0; i < numArray2.length; i++) {
			numArray2[i] = i;
		}
		
		return numArray2;
	}
	
	// 3. ���ڿ� �迭�� ���� ������, �ش� �迭�� ��� �̾� ���̴�
	//	  join �Լ��� ����� ������
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
	// 4. ���ڿ� Ÿ���� ����, ���� ����(base_from), �ٲٷ��� ����(base_to)
	//	  �� ���޹����� base_from�� �����̾��� �ش� ���ڸ� base_from������ num��
	//	  base_to ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ��� ����� ������
	//	  �� ����, ������ �߸��� ��� null�� ��ȯ�մϴ�
	//	  �� ��ȯ�� �� �ִ� �ִ� ������ 36�����̰� �ּ� ������ 2��
	
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
			System.err.println("RadixError : ��밡���� ������ 2���� 36�Դϴ�.");
			return null;
		}
		
		//------------------------------------
		int pow = num.length() - 1;  // 2 - 1 = 1
		long real_value = 0;
		
		for(int i = pow; i > -1; i--) { // 1 ~ 0
			
			char digit = num.charAt(pow - i); // 1 - 1 = 0, 1 - 0 = 1
			int value = getValue(digit);
		//-------------------------------------	
			// 8�����ε� 8�̻��� ���ڰ� ������ ����
			if(value >= base_from) {
				System.err.println("base_from �̻��� ���� ���� ���ڰ� �ֽ��ϴ�.");
				return null;
			}
			
			System.out.println(digit);
			System.out.println("\t���� �� : " + value);
			System.out.println("\t" +Math.pow(base_from, i) + "�� �ڸ�");
			
			real_value += value * Math.pow(base_from, i);
			//real_value +=
		}
		
		System.out.println(base_from + "���ڿ� \"" +  num + "\"�� ���� ���� ������ " + real_value + "�Դϴ�.");
		
		StringBuilder result = new StringBuilder();
		
		
		// 123456 10���� 123456���� ��ȯ�ϴ� ���
		
		
		while(real_value > 0) {
			result.append(getSymbol((int)(real_value % base_to)));
			real_value /= base_to;
		}
		
		return result.reverse().toString();
	}
	
	
	
	
	
	
	
	
	
	
//	�� ���� 10������ ��
//	public static StringBuilder transform(String num, int base_form, int base_to) {
//		StringBuilder result = new StringBuilder("");
//		
//		// ���������� 1 �ȳ��������� 0
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








































