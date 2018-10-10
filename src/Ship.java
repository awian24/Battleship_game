import java.util.ArrayList;

class Ship {

	private ArrayList<String> shipPosition;
	private ArrayList<String> shotPosition = new ArrayList<String>();
	private int shipHit;
	private int boardTable[][] = new int[10][10];

	public void setShipPosition(ArrayList<String> sh)
	{
		shipPosition = sh;
	}
	
	public void getShipPosition()
	{
//		System.out.println(shipPosition.get(1));
	}

	public void addToTable(ArrayList<String> pos)
	{
		for(int i=0;i<pos.size();i++)
		{
			System.out.println((pos.get(i).charAt(0)-97));
			System.out.println((pos.get(i).charAt(1)-49));
			boardTable[(pos.get(i).charAt(0)-97)][(pos.get(i).charAt(1)-49)] = 1;
		}
	}
	
	public void drawBoard()
	{
		// Tablica do wy�witlenia
		// -1 - pud�o
		//  0 - brak strza�u
		//  1 - trafiony
		//  2 - zatopiony ???

		System.out.println("  ");
		System.out.println("   A B C D E F G H I J ");
		
		boardTable[1][0] = 2;
		boardTable[2][0] = 2;
		boardTable[3][0] = 2;

		for(int i=0; i<10;i++)
		{
			if(i==9)
			{
				System.out.print("10");
			}
			else
			{
				System.out.print(" " + (i+1) );
			}
			
			for(int j=0; j<10;j++)
			{
				if(boardTable[j][i] == 1)
				{
					System.out.print(" #");
				}
				else
				{
					System.out.print(" -");
				}
						
			}
			System.out.println(" ");
		}

		System.out.println("  ");
		
	}
	
	public String check(String string_shot)
	{
		String result = "Pud�o";
		
		if(shotPosition.contains(string_shot))
		{
			System.out.println("  ");
			System.out.println("Ju� odda�e� tu strza�. Strzelaj w inne pole !!!");
			result = "!";
		}
		else
		{
/*			int shotInt = Integer.parseInt(string_shot);
			
			shotPosition.add(string_shot);
			int shotPositionSize = shotPosition.size();
			System.out.println("shotPositionSize: " + shotPositionSize);

			for(int i=0; i<shotPositionSize; i++)
			{
				System.out.print(shotPosition.get(i) + ", ");
			}
			System.out.println(" ");
*/		
			int indeks = shipPosition.indexOf(string_shot);
			
			if(indeks >=0)
			{
				shipPosition.remove(indeks);
				
				if(shipPosition.isEmpty())
				{
					result = "Zatopiony";
				}
				else
				{
					result = "Trafiony";
				}
//				boardTable[shotInt] = 1;
			}
			else
			{
//				boardTable[shotInt] = -1;
			}

			System.out.println(result);
/*			
			drawBoard();
			for(int i=0; i<10; i++)
			{
				//System.out.print(boardTable[i]);
				if(boardTable[i] == 1)
				{
					System.out.print("x ");
				}
				else
				{
					if(boardTable[i] == -1)
					{
						System.out.print("o ");
					}
					else
					{
						System.out.print("- ");
					}
				}
			}
*/			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
		}
		
		return result;
	}
	
}
