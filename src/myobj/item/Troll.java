package myobj.item;

class Troll extends Monster{
	public Troll() {
		
		super("Ʈ����", 10, 100000);
	}
	@Override
	public void detail() {
		
		System.out.printf("���� ����(����) : %s - %d - %d",name, level, hp);
	}
}