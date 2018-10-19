
public class Battleship {
	
	
	private static Battleship instance = null;

	public static Battleship getInstance() {
		return instance;
	}
	
	private void initGame()
	{
		System.out.println("Start...");
		
	}
/*	
	private void startGame()
	{
		while(!shipList.isEmpty())
		{
			String shot = download.inputDate("Podaj pole:");

			checkShot(shot);
			draw.drawBoard();
		}
//		endGame();
	}
	
	private void checkShot(String shotUser)
	{
		moveCounter++;
		
		String shot_result = shipList.get(0).check(shotUser);
		if(shot_result.equals("Trafiony") || shot_result.equals("Zatopiony"))
		{
			draw.addToTable(shotUser);
		}
		if(shot_result.equals("Zatopiony"))
		{
			shipList.remove(shipList.get(0));
		}
	}
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Battleship game = new Battleship();
		Board board_game = new Board();
		board_game.wyczyscPlansze();
		board_game.rozkladLosowy();
//		game.startGame();
		System.out.println("KONIEC GRY");
	}

	/*
	 * Konstruktor klasy Battlehip
	 */
	
	private Battleship(){
		super();
		instance = this;
		initGame();
	}
	
}
