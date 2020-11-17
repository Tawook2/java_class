package sports;

public class BaseBall extends Sports{
	
	String location;
	
	BaseBall(){
		
	}
	
	BaseBall(String location){
		this.location = location;
	}

	@Override
	public void gameStart(int player) {
		
		System.out.printf("%s���� %d ���� �÷��̾�� ������ �����մϴ�\n", this.location, player);
		
	}

	@Override
	public void gameEnd(int score, int e_score) {
		
		System.out.printf("%d �� %d ���� ��Ⱑ ����Ǿ����ϴ�.\n");
		
	}

	@Override
	public void changeMember(String player_in, String player_out) {
		
		System.out.printf("%s IN -- %s OUT\n",player_in, player_out);
		
	}

	@Override
	public boolean timeOut(double attack_time) {
		
		boolean check;
		if(attack_time > 24)
			check = true;
		else
			check= false;
		return check;
	}

	

}
