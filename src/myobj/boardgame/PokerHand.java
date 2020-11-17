package myobj.boardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class PokerHand {

	


	// PokerHand 클래스를 구현해보세요
	
	// 1. 다섯장의 PokerCard를 가지고 있어야함
	// (1.1) 덱완성
	// (1.2) 덱섞기
	//	- BlackJack

	
	// 2. 다섯장의 PokerCard의 숫자/무늬를 통해 족보를 완성해야 함
	//	- FiveDice
	
	
	// 3. 다른 PokerHand 인스턴스와 족보를 통한 크기비교가 가능해야 함
	//	- MaxMango
	
	// 4. 다섯장 중 원하는 카드만 공개하는 기능이 있어야 함
	//	- BlackJack
	
	// 5. 카드를 한장씩 추가하는 기능이 있어야 함
	//	- BlackJack+
	public static void main(String[] args) {
		ArrayList<Card> deck = new ArrayList<>(52);
		
		for(int i = 0; i < 52; i++) {
			deck.add(new Card(i));
		}
	
		System.out.println(deck);
		
		Collections.shuffle(deck);
		
		System.out.println(deck);
		
		
		
		Card[] cards = new Card[5];
		
		for(int i = 0; i < 5; i++) {
			cards[i] = deck.get(i);
			deck.remove(i);
		}
		
		System.out.println(Arrays.toString(cards));
	}
		
}




























