import java.util.ArrayList;

class Ship {

	private ArrayList<String> shipPosition;
	private ArrayList<String> shotPosition = new ArrayList<String>();
//	private int shipHit;


	public void setShipPosition(ArrayList<String> sh)
	{
		shipPosition = sh;
	}
	
	public void getShipPosition()
	{
//		System.out.println(shipPosition.get(1));
	}

	public String check(String string_shot)
	{
		String result = "Pud³o";
		
		if(shotPosition.contains(string_shot))
		{
			System.out.println("  ");
			System.out.println("Ju¿ odda³eœ tu strza³. Strzelaj w inne pole !!!");
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
*/
		}
		
		return result;
	}
	
}
