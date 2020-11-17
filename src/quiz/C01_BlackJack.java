package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_BlackJack {

	
	// # ������ ����� ������ (https://www.247blackjack.com)
	
	
	// * ���� ����
	// 1. ����(��ǻ��)�� �÷��̾ ī�带 2�徿 �޴´�
	//	  �� ��, ������ ī��� �� �� �������´�.
	// 2. ����ڴ� ī�带 ���� �� ������(hit) ������(stand)�� �����Ѵ�
	// 3. ����ڰ� ���߸� ������ ������ �ִ� ī�带 ������ �� ��Ģ�� ���� ī�带 �̴´�
	//	  (���� ī�� ���� 16�����϶� ������ �̰�, 17�̻��̸� ������ �����)
	// 4. �������� ���� ���ų� ��Ȯ�ϰ� 21�̶�� �¸� (���� �ݾ׸�ŭ �÷��̾��� ���� ������)
	//	  �������� ���� ���ų� 21�� ������ �й� (���� �ݾ׸�ŭ �÷��̾��� ���� ��������)
	//	  ������ ī������ ���ٸ� ���º�
	
	// �� A�� ���� 21�� �������� 1�� ����ϰ� 21���� �϶��� 11�� ����Ѵ�
	// �� J, Q, K�� 10�� �ش��Ѵ�
	// �� �� ī��� ���纰�� ���徿 �����Ѵ�
	
	// �ٸ� �Լ������� ������ ����� �� �ֵ��� �Լ� �ۿ� ������ ������ �� �ִ�
	public static int[] deck;
	public static int[] player;
	public static int[] dealer;
	
	public static int[] game_index;

	
// ---- ī�� ����
	
	public static int[] shuffle() {
		int[] deck = new int[52];
		
		// 52 % 13 : 0 - 12 �����̵�, 13 - 25 ��Ʈ, ...
		// "CA", "C2", ... "CK" / "SA"
		//
		
		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		for(int  i = 0; i < 200; i++) {
			int ran = (int)(Math.random() * 51 + 1);
			
			int temp = deck[0];
			deck[0] = deck[ran];
			deck[ran] = temp;
			
		}
		
		return deck;
	}
	
// ---- ī�� �̱�	
	
	public static void draw(int drawer) {	//{2, 2, 4}
		switch(drawer) {
		case 0:
			dealer[game_index[0]++] = deck[game_index[2]++];
			break;
		case 1:
			player[game_index[1]++] = deck[game_index[2]++];
			break;
		}
		
		
	}
	
// ---- ���� ��ȣ ���	
	
	public static String prettyCard(int card) {
		char[] shape = {'��', '��', '��', '��'};
		String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9",
					"10", "J", "Q", "K"};
		
		
		int s_index = card / 13;
		int v_index = card % 13; 
		
		return shape[s_index] + value[v_index];
	}
	
// ---- ī�� ��� -----------------------------------------------------	
	
	public static void print_game(int mode) {
		
		System.out.println("DEALER : ");
		for(int i = 0; i < game_index[0]; i++) {
			if(i == 0 && mode == 0) {
				System.out.print("X ");
			}else {
				System.out.print(prettyCard(dealer[i]) + " ");
			}
		}
		
		if(mode == 0) {
			System.out.println();
		}else{
			System.out.printf("(%d)\n", check_value(0));
		}
		
		System.out.println("PLAYER : ");
		for(int i = 0; i < game_index[1]; i++) {
			System.out.print(prettyCard(player[i]) + " ");
		}
		System.out.printf("(%d)\n\n",check_value(1));
	
	}
	
// ---- 21 �Ѵ��� Ȯ��	---------------------------------------------------
	
	public static int getSum(int[] values) {
		int sum = 0;
		int ace = 0;
		for(int i = 0; i < values.length; i++) {
			if(values[i] == 0) {
				sum += 11;
			}else if(values[i] >= 10) {
				sum += 10;
			}else {
				sum += values[i] + 1;
			}
			
		}
		
		// A�� 1�� �̻� �����ϸ鼭 ���� 21�� ���� �� A�� 1�� �����Ѵ�
		while(sum > 21 && ace > 0) {
			sum -= 10;
			ace -= 1;
		}
		
		return sum;
	}
	
	
// ---- ī�� �� Ȯ�� -----------------------------------------------------------
	
	public static int check_value(int user) {
		int[] values = new int[game_index[user]];
		
		for(int i = 0; i < values.length; i++) {
			values[i] = user == 0 ? dealer[i] % 13 : player[i] % 13;
		}
		
		return getSum(values);
		
		
	}

// ---- GAME FUNCTION ---------------------------------------------------------
	
	public static int game_start() {
		// 1.������ ������ �� �ϳ� �����Ѵ�
		deck = shuffle();
		
		// ���࿡ �ʿ��� �������� �ʱ�ȭ �Ѵ�
		player = new int[20];
		dealer = new int[20];
		game_index = new int[3];
		
		
		// 2. ������� ������ ������ �����Ѵ�
		//System.out.println(Arrays.toString(deck));
		
		// (1) ī�� �̱� (���� �ι�, �÷��̾� �ι�)
		draw(0);
		draw(0);
		draw(1);
		draw(1);
		
		//System.out.println("���� : " + Arrays.toString(dealer));
		//System.out.println("���� : " + Arrays.toString(player));
		
		Scanner console = new Scanner(System.in);
		int player_value;
		// # �÷��̾��� ����
		while((player_value = check_value(1)) < 21) {
			// # ���� ���� ���
			print_game(0);
			
			System.out.println("1.hit\t2.stand\n>> ");
			int select = console.nextInt();
			
			if(select == 2) {
				break;
			}
			else if(select == 1) {
				draw(1);	
			}
		}
		
		// ������ ���� �̰� ��� ������ ����� �� ����� ����
		
		
		print_game(1);
	
		int dealer_value;
		while((dealer_value = check_value(0)) <= 16) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			draw(0);
			print_game(1);
			dealer_value = check_value(0);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// ����� ����
		return check_game(dealer_value, player_value);
	}
	
	public static int check_game(int d, int p) {
		if(d > 21 && p > 21) {
			return 0;
		}
		if(d == p) {
			return 0;
		}else if(p <= 21 && d > 21) {
			return p == 21 ? 2 : 1;
		} else if (p <= 21 && p > d) {
			return p == 21 ? 2 : 1;
		}
		else {
			return -1;
		}
	}
	
// ---- MAIN -----------------------------------------------------------	
	
	public static void main(String[] args) {
		int player_money = 10000;
		
		while(player_money > 0) {
			int betting = 5000;
			player_money -= betting;
			
			int game_result = game_start();
			
			System.out.println("============================");
			StringBuilder msg = new StringBuilder("���� ��� : ");
			
			
		
			switch (game_result) {
			case 1:
				player_money += betting * 2;
				msg.append("�¸�");
				break;
			case 2:
				player_money += (int)(betting * 2.5);
				msg.append("21�� �¸�\n");
				break;
			case 0:
				player_money += betting;
				msg.append("���º�\n");
			default:
				msg.append("�й�\n");
				break;
			}
			
			msg.append("���� �ܾ� : " + player_money + "��\n");
			System.out.println(msg);
			System.out.println("============================");
		}
	}
}


































