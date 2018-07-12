
public class Battleship_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start...");
		
		DownloadSigns download = new DownloadSigns();
		
		Battleship bt_game = new Battleship();
		
		int random_number = (int) (Math.random() * 10);

		int ships[] = {random_number, random_number+1, random_number+2};

		for(int i=0; i<=2 ; i++)
		{
			System.out.println(ships[i]);
		}
		
		bt_game.setShipPosition(ships);
		
//		String shot = "2";
		
		boolean czyIstnieje = true;
		
		while(czyIstnieje == true)
		{
			String shot = download.inputDate("Podaj liczbê");
			String shot_result = bt_game.check(shot);
			
			if(shot_result.equals("zatopiony"))
			{
				czyIstnieje = false;
				System.out.println("Koniec gry !!!");
			}
		}		
	}
}
