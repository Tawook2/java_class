package quiz;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import myobj.fruit.Mango;

public class D04_MaxMango {

	// # Į�θ��� �������� �����Ǵ� ���� Ŭ������ �ϳ� �����ϰ�
	// 100���� ������ ���� Į�θ��� ���� ���� �����غ�����
	
	
	// �� ���� Į�θ��� ���� ��� �� ���� �絵�� ���� �ν��Ͻ��� �����ؾ���
	
	
	public static void main(String[] args) {
		
		LinkedList<Mango> mango_list = new LinkedList<>();
		
		for(int i = 0; i < 100; i++) {
			mango_list.add(new Mango());
		}
		//System.out.println(mango_list);
		
		Collections.sort(mango_list, new Comparator<Mango>() {
			// ���� Ŭ����, //Comparable �� ���� ��ü�� Comparator Ŭ������ ����Ѵ�
			@Override
			public int compare(Mango o1, Mango o2) {
				
				return (int)Math.ceil(o1.calorie() - o2.calorie());
			}

		});
		//System.out.println(mango_list);
		
		System.out.println(mango_list);
		
		Mango most_delicious = Collections.max(mango_list);
		
		System.out.println("���� ���ִ� ������ Į�θ� : " + most_delicious.calorie);
		System.out.println("���� ���ִ� ������ �絵 : " + most_delicious.sweet);
		
		
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


