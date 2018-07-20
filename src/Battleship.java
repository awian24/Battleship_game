import java.util.*;

public class Battleship {
	
	private DownloadSigns download = new DownloadSigns();
	private LotteryShips lottery = new LotteryShips();
	private ArrayList<Ship> shipList = new ArrayList<Ship>();
	private int moveCounter = 0;
	
	private void initGame()
	{
		System.out.println("Start...");
		Ship newShip = new Ship();
		shipList.add(newShip);
		
		for(Ship addShip:shipList)
		{
			ArrayList<String> newPosition = lottery.arrangeShips(3);
			addShip.setShipPosition(newPosition);
		}

		shipList.get(0).getShipPosition();
	}
	
	private void startGame()
	{
		while(!shipList.isEmpty())
		{
			String shot = download.inputDate("Podaj pole: ");

			checkShot(shot);
		}
//		endGame();
	}
	
	private void checkShot(String shotUser)
	{
		moveCounter++;
//		String result = "Pud³o";
		
			
			String shot_result = shipList.get(0).check(shotUser);
			if(shot_result.equals("Zatopiony"))
			{
				System.out.println("Koniec gry !!!");
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Battleship game = new Battleship();
		game.initGame();
		game.startGame();		
	}
}
