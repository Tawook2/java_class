package myobj.item;

public class Monster {
	
	public static void main(String[] args) {
		Troll t01 = new Troll();
		Sword s01 = new Sword();
		
		s01.upgrade();
		
		s01.attack(t01);
		
		t01.detail();
		
	}
	
	String name;
	int level;
	int hp;
	
	public Monster() {}
	
	
	public Monster(String name, int level, int hp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		
		
		
	}
	public void detail() {
		
		System.out.printf("몬스터 정보 : %s - %d - %d",name, level, hp);
	}
}

