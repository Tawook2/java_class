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
		
		// 1. numArr의 총합과 평균(소수점 둘째자리)을 구해서 출력해보세요 O
		
		// 2. numArr의 각 행의 합과 열의 합을 모두 구해서 출력해보세요
		//		0행의 합 : 10 + 10 + 10 + 10					O
		//		0열의 합 : 10 + 90 + 800 + 300
	
		for(int i = 0; i < numArr.length; i++) {
			len += numArr[i].length;	
					
		
			for(int j = 0; j < numArr[i].length; j++) {
				//System.out.println(numArr[i][j]);
				sum += numArr[i][j];
				
				rowSum[i] += numArr[i][j];
				colSum[j] += numArr[i][j];		
			}
		}
		
		System.out.println("행의 합 : " + Arrays.toString(rowSum));
		System.out.println("열의 합 : " + Arrays.toString(colSum));
		System.out.printf("numArr의 총합 : %d - 평균 : %.2f\n", sum, sum / (double) len);
		
		
		
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
