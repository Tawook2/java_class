//package myobj.poker;
//
//
//// Rank를 enum으로 직접 구현해보새요
//public class Rank2 {
//
//	static String[] names;
//	static Integer[] rankValues;
//	
//
//	
//	static {
//		names = new String[] {"ACE", "DEUCE", "THREE", "FOUR", "FIVE", "SIX",
//				"SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
//	
//		rankValues = new Integer[] {
//				12, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
//		};
//		ACE = new Rank2(0);
//		DEUCE = new Rank2(1);
//		THREE = new Rank2(2);
//		FOUR = new Rank2(3);
//		FIVE = new Rank2(4);
//		SIX = new Rank2(5);
//		SEVEN = new Rank2(6);
//		EIGHT = new Rank2(7);
//		NINE = new Rank2(8);
//		TEN = new Rank2(9);
//		JACK = new Rank2(10);
//		QUEEN = new Rank2(11);
//		KING = new Rank2(12);
//		
//		values = new Rank2[] {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN,
//							 EIGHT, NINE, TEN, JACK, QUEEN, KING
//		};
//	};
//	
//	String name;
//	Integer rankValue;
//	int order;
//	
//	// private 생성자 : 외부에서는 인스턴스를 생성할 수 없게 만들기
//	private Rank2(int index) {
//		this.order = index;
//		this.name = names[index];
//		this.rankValue = rankValues[index];
//	}
//	
//	@Override
//	public String toString() {
//	
//		return name;
//	}
//	
//	
//}







































