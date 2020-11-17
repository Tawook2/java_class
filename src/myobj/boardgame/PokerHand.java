package myobj.boardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class PokerHand {

	


	// PokerHand Ŭ������ �����غ�����
	
	// 1. �ټ����� PokerCard�� ������ �־����
	// (1.1) ���ϼ�
	// (1.2) ������
	//	- BlackJack

	
	// 2. �ټ����� PokerCard�� ����/���̸� ���� ������ �ϼ��ؾ� ��
	//	- FiveDice
	
	
	// 3. �ٸ� PokerHand �ν��Ͻ��� ������ ���� ũ��񱳰� �����ؾ� ��
	//	- MaxMango
	
	// 4. �ټ��� �� ���ϴ� ī�常 �����ϴ� ����� �־�� ��
	//	- BlackJack
	
	// 5. ī�带 ���徿 �߰��ϴ� ����� �־�� ��
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




























