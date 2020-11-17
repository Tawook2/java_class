package myobj.item;

import java.util.Random;

public class Sword {
	int level; 							// 등급 4 3 2 1
	int numOfUpgrade;
	int attack_damage;	
	int numOfTry;
	
	// int[] upgrade_table; // 강화 성공 확률 데이블
	// double[] amp_table;	// 레벨별 공격력 증가량 테이블
	
	public Sword() {
		this(3, 0, 1);
	}
	
	public Sword(int damage, int upgrade, int level) {
		
		this.level = level;
		this.numOfUpgrade = upgrade;
		this.attack_damage = damage;	
	}
	
	
	// 필드
	//	- 공격력										o
	//	- 강화수치										o
	
	//	- 레벨별 강화확률 (등급마다 강화 확률이 다름)			o
	//	- 레벨별 공격력 증가폭							o
	
	// 메서드
	// - 강화하기(성공률에 따라 성공 실패가 적용됨)				o
	//	 ※ 최대 강화 레벨까지 도달하기에 걸린 강화 횟수를 출력		o
	
	// ※ 인스턴스 메서드를 만들 때는 static을 빼야한다
	//	  static 메서드는 인스턴스 변수를 활용활 수 없다
	
	// - 공격 (대상에게 공격력 만큼의 데미지를 입힘)			o
	// ※ 대상이 되는 객체는 HP가 있어야 한다					o
	
	// ※ 장비 파괴 ??									x
	
	// 강화 함수
	public void upgrade() {
		Random ran = new Random();
		int num = 0;
		
		while(numOfUpgrade < 15) {
			
			int percentage = ran.nextInt(100);
			int destroy = ran.nextInt(1000);
			
			switch(level) {
			case 1:
				upgrade_logic(percentage, 5, destroy);
				break;
			case 2:
				upgrade_logic(percentage, 25, destroy);
				break;
			case 3:
				upgrade_logic(percentage, 70, destroy);
				break;
			case 4:
				upgrade_logic(percentage, 85, destroy);
				break;
			default:
				System.err.println("강화 할 수 없는 장비입니다. 다시 한번 확인해주세요 ! ");
				break;
			}
			if(level == 5)
				break;
		}
		System.out.printf("강화 횟수 : %d - 총 공격력 : %d - 강화 시도 횟수 : %d\n\n", numOfUpgrade, attack_damage, numOfTry);
	}
	
	// 강화 확률 조정 함수
		public void upgrade_logic(int percentage, int num, int destroy) {
			
			
			if(percentage > num) {
				if(numOfUpgrade == 11) {
					System.err.println("12강 부터 장비가 파괴 될 수 도 있습니다 (주의 !)");
				}
				System.out.printf(" + %d 강화에 성공하였습니다 !\n", numOfUpgrade + 1);
				numOfUpgrade++;
				attack_damage += level * 10;
				numOfTry++;
				num++;
			}
			else {
				System.err.printf(" + %d 강화 실패 ㅠㅠ\n", numOfUpgrade + 1 );
				if(destroy > 988) {
					System.err.println("펑 ! ");
					System.err.println("장비가 파괴되었습니다");
					level = 5;
					
				}
				numOfTry++;
			}
		}
		
	

	// 공격
	public void attack(Monster mon) {
		
		//Monster wolf01 = new Monster("늑대 한마리", 3, 5000);
		
		System.out.println("공격!!");
		Random ran = new Random();
		int critical_attack = ran.nextInt(100);
		if(critical_attack > 50) {
			System.out.println("Critial !");
			attack_damage = (int) (attack_damage * 2.5);
			mon.hp -= attack_damage;
		}
		else {
			mon.hp -= attack_damage;
		}
		System.out.printf("%s (이)가 %d 만큼 데미지를 입었습니다. (남은체력 : %d)\n", mon.name, attack_damage, mon.hp);
	
	}
}











































