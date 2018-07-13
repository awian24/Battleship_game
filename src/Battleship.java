import java.util.ArrayList;

class Battleship {

	private ArrayList<String> shipPosition;
	private ArrayList<String> shotPosition = new ArrayList<String>();
	private int shipHit;

	public void setShipPosition(ArrayList<String> sh)
	{
		shipPosition = sh;
	}
	
	public void getShipPosition()
	{
//		System.out.println(shipPosition[1]);
	}
	
	public String check(String string_shot)
	{
		String result = "Pud³o";

		if(shotPosition.contains(string_shot))
		{
			System.out.println("Ju¿ odda³eœ tu strza³. Strzelaj w inne pole !!!");
			result = "!";
		}
		else
		{
			shotPosition.add(string_shot);
			int shotPositionSize = shotPosition.size();
			System.out.println("shotPositionSize: " + shotPositionSize);
			
			for(int i=0; i<shotPositionSize; i++)
			{
				System.out.print(shotPosition.get(i) + ", ");
			}
			System.out.println(" ");
		
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
			}
			System.out.println(result);
		}
		
		return result;
	}
	
}
