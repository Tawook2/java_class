package quiz;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import myobj.fruit.Mango;

public class D04_MaxMango {

	// # 칼로리가 랜덤으로 설정되는 망고 클래스를 하나 생성하고
	// 100개의 망고중 가장 칼로리가 높은 망고를 선택해보세요
	
	
	// ※ 만약 칼로리가 같은 경우 더 높은 당도를 가진 인스턴스를 선택해야함
	
	
	public static void main(String[] args) {
		
		LinkedList<Mango> mango_list = new LinkedList<>();
		
		for(int i = 0; i < 100; i++) {
			mango_list.add(new Mango());
		}
		//System.out.println(mango_list);
		
		Collections.sort(mango_list, new Comparator<Mango>() {
			// 비교할 클래스, //Comparable 이 없는 객체는 Comparator 클래스를 써야한다
			@Override
			public int compare(Mango o1, Mango o2) {
				
				return (int)Math.ceil(o1.calorie() - o2.calorie());
			}

		});
		//System.out.println(mango_list);
		
		System.out.println(mango_list);
		
		Mango most_delicious = Collections.max(mango_list);
		
		System.out.println("가장 맛있는 망고의 칼로리 : " + most_delicious.calorie);
		System.out.println("가장 맛있는 망고의 당도 : " + most_delicious.sweet);
		
		
//		System.out.println(Collections.max(mango_list, new Comparator<Mango>() {
//
//			@Override
//			public int compare(Mango o1, Mango o2) {
//				
//				if(o1.calorie() == o2.calorie()) {
//					return (int)Math.ceil(o1.sweet() - o2.sweet()); 
//				}
//				else {
//				return (int)Math.ceil(o1.calorie() - o2.calorie());
//				}
//			}	
//						
//		}));
		
	}
	
	
}


