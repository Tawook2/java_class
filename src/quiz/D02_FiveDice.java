package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class D02_FiveDice {
	

	// 랜덤으로 5개의 주사위를 굴린 다음에 (주사위의 눈은 1 ~ 6)	o
	
	// 풀하우스 (같은 숫자가 2개/3개)
	// 스몰 스트레이트 (1234/2345/3456)
	// 라지 스트레이트 (12345/23456)
	// 4다이스 (같은 숫자 4개)
	// 5다이스 (같은 숫자 5개)
	
	// 를 구분하는 클래스를 작성하고 테스트 해보세요
	
	// ※ 다른 파일에 작성하고 여기서는 갖다 쓰기만 할 것
	private Random ran;
	private Scanner sc;
	private List<Integer> dices;	// 5개의 주사위 눈이 저장될 리스트
	private List<Integer> counts;	// 각 숫자가 몇번씩 등장했는지 세어 볼 리스트
	
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
		// 주사위는 5개 이상으로 늘어나지 않기 때문에 컬렉션 용량을 5로 설정한다
		// ※ ArrayList는 초기 용량이 가득 차게되면 알아서 용량을 1.5배씩 증가시킨다
		
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
		System.out.println("주사위를 한번 더 굴리시 겠습니까?");
		sc = new Scanner(System.in);
		String msg = sc.nextLine().toLowerCase();
		return msg;
	}
	
	
//	public void reroll(D02_FiveDice FD) {		
//		String decided = decide();
//		
//		if(decided.equals("yes")) {
//			System.out.println("몇번째 주사위를 굴리시겠습니까?");
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
//			System.out.println("결과는 : " + dices + " : " + check());
//			return;
//			
//		} else if(decided.equals("no")) {			
//			System.out.println("결과는 : " + dices + " : "  + check());
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
		
		// 던진 후에 원하는 주사위를 여러개 (0 ~ 5 개) 
		// 골라 다시 던질 수 있는 기능을 추가해보세요
		//dice01.roll();
		//dice01.reroll(dice01);
		
		Scanner sc = new Scanner(System.in);
		dice01.roll();
		
		while(true) {
			
			
			System.out.println("바꾸기 테스트 > ");
			
			Set<Integer> rerolls = new HashSet<>();
			int i = -1;
			while((i = sc.nextInt()) != -1) {
				rerolls.add(i);
				
			}
			System.out.println("다시 굴려야하는 인덱스 : " + rerolls);
			dice01.reroll(rerolls);
			
			Thread.sleep(2000);
		}
		
	
	}
	
	
}




















