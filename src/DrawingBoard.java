public class DrawingBoard {
	
	private int boardTable[][] = new int[10][10];
	
	public void addToTable(String pos)
	{
//			System.out.println((pos.get(i).charAt(0)-97));
//			System.out.println((pos.get(i).charAt(1)-49));
			boardTable[(pos.charAt(1)-49)][(pos.charAt(0)-97)] = 1;
	}
	
	public void drawBoard()
	{
		// Tablica do wyœwitlenia
		// -1 - pud³o
		//  0 - brak strza³u
		//  1 - trafiony
		//  2 - zatopiony ???

		System.out.println("  ");
		System.out.println("   A B C D E F G H I J ");

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
				if(boardTable[i][j] == 1)
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
	

}
