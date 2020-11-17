package myobj.item;

import java.util.Random;

public class Sword {
	int level; 							// ��� 4 3 2 1
	int numOfUpgrade;
	int attack_damage;	
	int numOfTry;
	
	// int[] upgrade_table; // ��ȭ ���� Ȯ�� ���̺�
	// double[] amp_table;	// ������ ���ݷ� ������ ���̺�
	
	public Sword() {
		this(3, 0, 1);
	}
	
	public Sword(int damage, int upgrade, int level) {
		
		this.level = level;
		this.numOfUpgrade = upgrade;
		this.attack_damage = damage;	
	}
	
	
	// �ʵ�
	//	- ���ݷ�										o
	//	- ��ȭ��ġ										o
	
	//	- ������ ��ȭȮ�� (��޸��� ��ȭ Ȯ���� �ٸ�)			o
	//	- ������ ���ݷ� ������							o
	
	// �޼���
	// - ��ȭ�ϱ�(�������� ���� ���� ���а� �����)				o
	//	 �� �ִ� ��ȭ �������� �����ϱ⿡ �ɸ� ��ȭ Ƚ���� ���		o
	
	// �� �ν��Ͻ� �޼��带 ���� ���� static�� �����Ѵ�
	//	  static �޼���� �ν��Ͻ� ������ Ȱ��Ȱ �� ����
	
	// - ���� (��󿡰� ���ݷ� ��ŭ�� �������� ����)			o
	// �� ����� �Ǵ� ��ü�� HP�� �־�� �Ѵ�					o
	
	// �� ��� �ı� ??									x
	
	// ��ȭ �Լ�
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
				System.err.println("��ȭ �� �� ���� ����Դϴ�. �ٽ� �ѹ� Ȯ�����ּ��� ! ");
				break;
			}
			if(level == 5)
				break;
		}
		System.out.printf("��ȭ Ƚ�� : %d - �� ���ݷ� : %d - ��ȭ �õ� Ƚ�� : %d\n\n", numOfUpgrade, attack_damage, numOfTry);
	}
	
	// ��ȭ Ȯ�� ���� �Լ�
		public void upgrade_logic(int percentage, int num, int destroy) {
			
			
			if(percentage > num) {
				if(numOfUpgrade == 11) {
					System.err.println("12�� ���� ��� �ı� �� �� �� �ֽ��ϴ� (���� !)");
				}
				System.out.printf(" + %d ��ȭ�� �����Ͽ����ϴ� !\n", numOfUpgrade + 1);
				numOfUpgrade++;
				attack_damage += level * 10;
				numOfTry++;
				num++;
			}
			else {
				System.err.printf(" + %d ��ȭ ���� �Ф�\n", numOfUpgrade + 1 );
				if(destroy > 988) {
					System.err.println("�� ! ");
					System.err.println("��� �ı��Ǿ����ϴ�");
					level = 5;
					
				}
				numOfTry++;
			}
		}
		
	

	// ����
	public void attack(Monster mon) {
		
		//Monster wolf01 = new Monster("���� �Ѹ���", 3, 5000);
		
		System.out.println("����!!");
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
		System.out.printf("%s (��)�� %d ��ŭ �������� �Ծ����ϴ�. (����ü�� : %d)\n", mon.name, attack_damage, mon.hp);
	
	}
}











































