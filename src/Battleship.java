
class Battleship {

	private int shipPosition[];

	public void setShipPosition(int sh[])
	{
		shipPosition = sh;
	}
	
	public void getShipPosition()
	{
		System.out.println(shipPosition[1]);
	}
	
	public String check(String string_shot)
	{
		int shot = Integer.parseInt(string_shot);
		
		String result = "Pud³o";
		
		for(int area : shipPosition)
		{
			if (shot == area)
			{
				result = "Trafiony";
			}
		}
		
		return result;
	}
	
}
