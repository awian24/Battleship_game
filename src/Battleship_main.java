
public class Battleship_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start...");
		
		Battleship bt_game = new Battleship();
		
		int ships[] = {1,4};
		
		bt_game.setShipPosition(ships);
		
		String shot = "4";
		
		bt_game.getShipPosition();
		
		
	}

}
