package myobj.world;

public class World {

	public static void main(String[] args) {
		
	
	//myobj ��Ű�� ���ο� static ������ �޼��帣 ���� o
	// Ŭ������ �ϳ� ���� �غ�����					o
	// (������/�����ڵ� ����, width/height ����)	o
		
		Species dog01 = new Species("Berry", 7);
		Species dog02 = new Species("Winny", 13);
		
		System.out.print(dog01.name + " : ");
		System.out.println(dog01.age);
		
		System.out.print(dog02.name + " : ");
		System.out.println(dog02.age);
		System.out.println("----------------------------------");
		System.out.println("��� : " + Species.continent);
		System.out.println("���� ���� : " + Species.unique_habit);
		System.out.println("��� ���� " + Species.avgOfLivespan);
		
		System.out.println("----------------------------------");
		Species.changeSpecies("North America", "scrambling", 20);
		
		System.out.println("��� : " + Species.continent);
		System.out.println("���� ���� : " + Species.unique_habit);
		System.out.println("��� ���� " + Species.avgOfLivespan);
	}
	
	
	
}


class Species {
	String name;
	int age;
	
	static String continent;
	static String unique_habit;
	static int avgOfLivespan;
	
	static {
		continent = "Europe";
		unique_habit = "howling";
		avgOfLivespan = 15;
	}
	
	public Species() {}
	
	public Species(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void changeSpecies(String continent, String unique_habit, int avgOfLivespan) {
		Species.continent = continent;
		Species.unique_habit = unique_habit;
		Species.avgOfLivespan = avgOfLivespan;
	}
	
	
}
