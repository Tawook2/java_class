package myobj.boardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Card {
	String cards;
	
	
	private Random ran;
	private Scanner sc;
	private List<Integer> card;	// 5개의 주사위 눈이 저장될 리스트
	private List<Integer> counts;	// 각 숫자가 몇번씩 등장했는지 세어 볼 리스트
	
	private String made;
	
	private static int NUM_OF_CARD = 5;
	private static int CATEGORY_CARD = 6;
	

	public Card(int card) {
		
		char[] shape = {'♥', '♠', '♣', '◆'};
		String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		int s_index = card / 13; 
		int v_index = card % 13; 
		
		this.cards = shape[s_index] + value[v_index];
		
		
	}

		
	@Override
	public String toString() {
	
		return this.cards;
	}
}
