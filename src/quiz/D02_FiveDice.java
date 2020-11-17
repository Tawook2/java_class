package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class D02_FiveDice {
	

	// �������� 5���� �ֻ����� ���� ������ (�ֻ����� ���� 1 ~ 6)	o
	
	// Ǯ�Ͽ콺 (���� ���ڰ� 2��/3��)
	// ���� ��Ʈ����Ʈ (1234/2345/3456)
	// ���� ��Ʈ����Ʈ (12345/23456)
	// 4���̽� (���� ���� 4��)
	// 5���̽� (���� ���� 5��)
	
	// �� �����ϴ� Ŭ������ �ۼ��ϰ� �׽�Ʈ �غ�����
	
	// �� �ٸ� ���Ͽ� �ۼ��ϰ� ���⼭�� ���� ���⸸ �� ��
	private Random ran;
	private Scanner sc;
	private List<Integer> dices;	// 5���� �ֻ��� ���� ����� ����Ʈ
	private List<Integer> counts;	// �� ���ڰ� ����� �����ߴ��� ���� �� ����Ʈ
	
	private String made;
	
	private static int NUM_OF_DICE = 5;
	private static int DICE_FACET = 6;
	
	private final static Set<Set<Integer>> LARGE_CASES;
	private final static Set<Set<Integer>> SMALL_CASES;
	
	static {
		LARGE_CASES = new HashSet<>(2);
		
		for(int i = 1; i <= 2; i++) {
			Set<Integer> large = new HashSet<>(5);
			Collections.addAll(large, i, i+1, i+2, i+3, i+4);
			LARGE_CASES.add(large);
		}
	}
	
	static {
		SMALL_CASES = new HashSet<>();
		
		for(int i = 1; i <= 3; i++) {
			Set<Integer> small = new HashSet<>(4);
			Collections.addAll(small, i, i+1, i+2, i+3);
			SMALL_CASES.add(small);
		}
	}
	
	public D02_FiveDice() {
		ran = new Random();
		made = "UNCHECKED";
		// �ֻ����� 5�� �̻����� �þ�� �ʱ� ������ �÷��� �뷮�� 5�� �����Ѵ�
		// �� ArrayList�� �ʱ� �뷮�� ���� ���ԵǸ� �˾Ƽ� �뷮�� 1.5�辿 ������Ų��
		
		dices = new ArrayList<>(NUM_OF_DICE);
		counts = new ArrayList<>(DICE_FACET);
		Collections.addAll(dices, 0, 0, 0, 0, 0);
		Collections.addAll(counts, 0, 0, 0, 0, 0, 0);
		
		
		
	}
	
	private void count() {
		for(int i = 0; i < DICE_FACET; i++) {
			int dice_num = i + 1;
			counts.set(i, Collections.frequency(dices, dice_num));
		}
	}
	
	private String check() {
		// check by counts
		if(counts.contains(5)) {
			return "FIVE DICE!!";
		}else if(counts.contains(4)) {
			return "FOUR DICE!!";
		}else if(counts.contains(2) && counts.contains(3))
			return "FULL HOUSE";
		
		// check by dices
		for(Set<Integer> ls : LARGE_CASES) {
			if(dices.containsAll(ls)) {
				return "LARGE STRAIGHT!!";
			}
		}
		
		for(Set<Integer> ss : SMALL_CASES) {
			if(dices.containsAll(ss)) {
				return "SMALL STRAIGHT!!";
			}
		}
		
		return "NO MATCHES";
	}
	
	public void roll() {
		made = "UNCHECKED";
		
		for(int i = 0; i < NUM_OF_DICE; i++) {
			dices.set(i, ran.nextInt(DICE_FACET) + 1);
		}
		count();
		print();
	}
	
	
	
	private String decide() {
		System.out.println("�ֻ����� �ѹ� �� ������ �ڽ��ϱ�?");
		sc = new Scanner(System.in);
		String msg = sc.nextLine().toLowerCase();
		return msg;
	}
	
	
//	public void reroll(D02_FiveDice FD) {		
//		String decided = decide();
//		
//		if(decided.equals("yes")) {
//			System.out.println("���° �ֻ����� �����ðڽ��ϱ�?");
//			
//			
//			int which_one = sc.nextInt();
//			
//			
//			
//			dices.remove(which_one -1);
//			dices.add(which_one -1 , ran.nextInt(DICE_FACET) + 1);
//			
//			count();
//			
//			System.out.println("����� : " + dices + " : " + check());
//			return;
//			
//		} else if(decided.equals("no")) {			
//			System.out.println("����� : " + dices + " : "  + check());
//			return;
//		}
//	}
	
	public void print() {
		System.out.println(dices + " : ");
		
		if(made.equals("UNCHECKED")) {
			made = check();
		}
		
		
		System.out.println(made);
	}
	
	public void reroll(Set<Integer> rerolls) {
		
		if(rerolls.size() == 0) {
			System.out.println("NOTHING CHANGES");
			return;
		}
		
		made = "UNCHECKED";
		
		for(int i : rerolls) {
			int to_change = ran.nextInt(DICE_FACET) + 1;
			dices.set(i - 1, to_change);
			System.out.printf("DICE %d HAS CHANGED : %d\n", i, to_change);
		}
		
		count();		
		print();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		D02_FiveDice dice01 = new D02_FiveDice();
		
		// ���� �Ŀ� ���ϴ� �ֻ����� ������ (0 ~ 5 ��) 
		// ��� �ٽ� ���� �� �ִ� ����� �߰��غ�����
		//dice01.roll();
		//dice01.reroll(dice01);
		
		Scanner sc = new Scanner(System.in);
		dice01.roll();
		
		while(true) {
			
			
			System.out.println("�ٲٱ� �׽�Ʈ > ");
			
			Set<Integer> rerolls = new HashSet<>();
			int i = -1;
			while((i = sc.nextInt()) != -1) {
				rerolls.add(i);
				
			}
			System.out.println("�ٽ� �������ϴ� �ε��� : " + rerolls);
			dice01.reroll(rerolls);
			
			Thread.sleep(2000);
		}
		
	
	}
	
	
}




















