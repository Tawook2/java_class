package myobj.item;

class Troll extends Monster{
	public Troll() {
		
		super("트런들", 10, 100000);
	}
	@Override
	public void detail() {
		
		System.out.printf("몬스터 정보(보스) : %s - %d - %d",name, level, hp);
	}
}