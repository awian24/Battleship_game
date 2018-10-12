import java.util.*;

public class Battleship {
	
	private DownloadSigns download = new DownloadSigns();
	private LotteryShips lottery = new LotteryShips();
	private ArrayList<Ship> shipList = new ArrayList<Ship>();
	private DrawingBoard draw = new DrawingBoard();
	private int moveCounter = 0;
	
	private void initGame()
	{
		System.out.println("Start...");
		Ship Ship_1 = new Ship();
//		Ship Ship_2 = new Ship();
		shipList.add(Ship_1);
//		shipList.add(Ship_2);
		
		for(Ship addShip:shipList)
		{
			ArrayList<String> newPosition = lottery.arrangeShips(3);
			addShip.setShipPosition(newPosition);
		}
		draw.drawBoard();
	}
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Battleship game = new Battleship();
		game.initGame();
		game.startGame();
		System.out.println("KONIEC GRY");
	}
}
