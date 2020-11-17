package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D07_countFruits {

	private enum Fruit{
		APPLE,
		BANANA,
		ORANGE,
		KIWI
	}
	
	// 다음 리스트를 이용해 각 과일이 몇 개인지를 저장한 Map을 생성해보세요
	
	static List<Fruit> fruits;
	
	static {
		fruits = new ArrayList<>();
		
		for(int i = 0; i < 50; i++) {
			fruits.add(Fruit.values()[(int)(Math.random() * 4)]);
		}
	}
	public static void main(String[] args) {
		System.out.println(fruits);
		
		Map<Fruit, Integer> map01 = new HashMap<>();
//		map01.put(Fruit.APPLE, Collections.frequency(fruits, Fruit.APPLE));
//		map01.put(Fruit.BANANA, Collections.frequency(fruits, Fruit.BANANA));
//		map01.put(Fruit.KIWI, Collections.frequency(fruits, Fruit.KIWI));
//		map01.put(Fruit.ORANGE, Collections.frequency(fruits, Fruit.ORANGE));
		
		for(Fruit fruit : fruits) {
			map01.put(fruit,  Collections.frequency(fruits, fruit));
			System.out.println(map01);
		}
		
		System.out.println(map01);
	}
}





























