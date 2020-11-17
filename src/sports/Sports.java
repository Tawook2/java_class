package sports;

abstract public class Sports {
	
	abstract public void gameStart(int player);
	
	abstract public void changeMember(String player_in, String player_out);
	
	abstract public boolean timeOut(double attack_time);
	
	abstract public void gameEnd(int score, int e_score);
	
	
	public static void main(String[] args) {
		BaseBall bs01 = new BaseBall("KOR");
		bs01.gameStart(14);
		
		BasketBall bk01 = new BasketBall("USA");
		bk01.gameStart(6);
		bk01.gameEnd(10, 21);
		bk01.changeMember("유비", "장비");
		boolean time = bk01.timeOut(23);
		System.out.println(time);
	}
}
