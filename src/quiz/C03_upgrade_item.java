package quiz;

import myobj.item.Monster;
import myobj.item.Sword;

public class C03_upgrade_item {

	public static void main(String[] args) {
		
		
		Sword s01 = new Sword(3, 0, 1);
		Sword s02 = new Sword(5, 0, 2);
		Sword s03 = new Sword(10, 0, 3);
		Sword s04 = new Sword(100, 1, 4);
		Sword s05 = new Sword(100, 0, 5);
		
		
		
//		s01.upgrade();
//		s02.upgrade();
		s03.upgrade();
		
//		s04.upgrade();
		s05.upgrade();
//		
//		s01.attack();
//		s02.attack();
//		s03.attack();
//		s04.attack();
		
		
		
		
		
	}
}
