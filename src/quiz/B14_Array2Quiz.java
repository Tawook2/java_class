package quiz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class B14_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] numArr = {
				{10, 10, 10, 10}, 
				{90, 50, 30, 70},
				{800, 500},
				{300, 300, 300}
		};
		
		int[] rowSum = new int[numArr.length];
		int[] colSum = new int[4];
		
		int sum = 0;
		int len = 0;
		
		// 1. numArr�� ���հ� ���(�Ҽ��� ��°�ڸ�)�� ���ؼ� ����غ����� O
		
		// 2. numArr�� �� ���� �հ� ���� ���� ��� ���ؼ� ����غ�����
		//		0���� �� : 10 + 10 + 10 + 10					O
		//		0���� �� : 10 + 90 + 800 + 300
	
		for(int i = 0; i < numArr.length; i++) {
			len += numArr[i].length;	
					
		
			for(int j = 0; j < numArr[i].length; j++) {
				//System.out.println(numArr[i][j]);
				sum += numArr[i][j];
				
				rowSum[i] += numArr[i][j];
				colSum[j] += numArr[i][j];		
			}
		}
		
		System.out.println("���� �� : " + Arrays.toString(rowSum));
		System.out.println("���� �� : " + Arrays.toString(colSum));
		System.out.printf("numArr�� ���� : %d - ��� : %.2f\n", sum, sum / (double) len);
		
		
		
//		for(int i = 0; i < numArr.length; i++) {
//			for(int j = 0; j < 4; j++) {
//				
//				if(j < numArr[i].length) {
//					colSum[j] += numArr[i][j];
//				}
//			}
//		}
	}
}
