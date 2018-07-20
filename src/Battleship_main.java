import java.util.ArrayList;
import java.lang.Runtime;
import  java.io.IOException;

public class Battleship_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start...");
		
		DownloadSigns download = new DownloadSigns();
		
		Battleship bt_game = new Battleship();
		
		int random_number = (int) (Math.random() * 10);

//		int ships[] = {random_number, random_number+1, random_number+2};

		ArrayList<String> ships = new ArrayList<String>();
		String random_1 = Integer.toString(random_number);
		String random_2 = Integer.toString(random_number+1);
		String random_3 = Integer.toString(random_number+2);
		ships.add(random_1);
		ships.add(random_2);
		ships.add(random_3);
		
/*
		for(int i=0; i<=2 ; i++)
		{
			System.out.println(ships.get(i));
		}
*/		
		bt_game.setShipPosition(ships);
		
//		String shot = "2";
		
		boolean czyIstnieje = true;
		
		while(czyIstnieje == true)
		{
			String shot = download.inputDate("Podaj liczbê");
			String shot_result = bt_game.check(shot);
			
			if(shot_result.equals("Zatopiony"))
			{
				czyIstnieje = false;
				System.out.println("Koniec gry !!!");
			}
		}		
	}
}
