import java.io.*;

class DownloadSigns {

	public String inputDate(String komunikat)
	{
		String wierszWej = null;
		System.out.print(komunikat + " ");
		try
		{
			BufferedReader sw = new BufferedReader( new InputStreamReader(System.in));
			wierszWej = sw.readLine();
		} 
		catch (IOException e)
		{		
			System.out.println("I0Exception: " + e);
		}
		
		return wierszWej.toLowerCase();
	}	
}
