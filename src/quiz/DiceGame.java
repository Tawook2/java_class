//package quiz;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Random;
//
//public class DiceGame {
//	
//	ArrayList<Integer> dice;
//	
//	public ArrayList<Integer> roll(){
//		ArrayList<Integer> dice = new ArrayList<>();
//		Random ran = new Random();
//		
//		for(int i = 0; i < 5; i++) {
//			
//			dice.add(ran.nextInt(6) + 1);
//			this.dice = dice;
//		}
//		return this.dice;
//	}
//	
//	
//	public void test() {
//		int House = 0;
//		ArrayList<Integer> large = new ArrayList<>();
//		ArrayList<Integer> large2 = new ArrayList<>();
//		
//		ArrayList<Integer> small = new ArrayList<>();
//		ArrayList<Integer> small2 = new ArrayList<>();
//		ArrayList<Integer> small3 = new ArrayList<>();
//		
//		for(int i = 0; i < dice.size(); i++) {
//			large.add(i+1);
//			large2.add(i+2);
//		}
//		
//		if(dice.containsAll(large) || dice.containsAll(large2)) {
//			System.out.println("라지스트레이트");
//			return;
//		}
//		
//		for(int k = 0; k < dice.size()-1; k++) {
//			small.add(k + 1);
//			small2.add(k + 2);
//			small3.add(k + 3);
//		}
//		if(dice.containsAll(small) || dice.containsAll(small2) || dice.containsAll(small3)) {
//			System.out.println("스몰스트레이트");
//			return;
//		}
//	
//		for(int j = 1; j < 7; j++) {
//			
//			House = Collections.frequency(this.dice, j);
//			
//			if(House == 5) {
//				System.out.println("5다이스");
//				break;
//			}
//			else if(House == 4) {
//				System.out.println("4다이스");
//				break;
//			}
//			else {
//				System.out.println("no match");
//				break;
//			}
//			
//		}
//		
//	}
//}
