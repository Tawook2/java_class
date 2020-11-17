package quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/*
  	925: 13 24 32 34 39 42  + 4
 	926: 10 16 18 20 25 31  + 6
  	927: 4  15 22 38 41 43  + 26
  	928: 3  4  10 20 28 44  + 30
 	929: 7  9  12 15 19 23  + 4
 	930: 8  21 25 38 39 44  + 28
	931: 14 15 23 25 35 43  + 32
	932: 1	6  15 36 37 38  + 5
	933: 23 27 29 31 36 45  + 37
	934: 1  3  30 33 36 39  + 12
	935: 4  10 20 32 38 44  + 18
	
	4, 44, 15, 38, / 36, 23, 32
 
 */

public class D02_LottoSet {

	// 1 ���� 45������ �ߺ����� ���� ���� 6���� �̷���� HashSet�� �����غ�����
	public static Set<Integer> generate(){
		Random ran = new Random();
		
		Set<Integer> lotto = new HashSet<>();
		
		
		int count = 0;
		// Set�� �ߺ����� �߰����� �ʱ� ������ �˾Ƽ� ���̰� �þ�� �ʴ´�
		while (lotto.size() < 6) {
			lotto.add(ran.nextInt(45) +1);
			//System.out.println(++count + "ȸ �̾ҽ��ϴ�");
		}
		
		return lotto;
	}
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			System.out.println(generate());
		}
		
	}
}
