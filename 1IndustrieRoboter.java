package roboterPaket;

public class IndustrieRoboter
{
	private static int maxAnzWerkzeuge =10;

	Werkzeug[] werkzeugkasten = new Werkzeug[maxAnzWerkzeuge];
	
	public static int getMaxAnzWerkzeuge()
	{
		return maxAnzWerkzeuge;
	}
	public IndustrieRoboter() {}
	
	public boolean werkzeugHinzufuegen(int platz, Werkzeug neu    )
	{
    	boolean ergebnis = false;
		
		if(platz >=0 && platz<10)
		{
			if(werkzeugkasten[platz]  == null)
			{
				werkzeugkasten[platz] =neu;
				ergebnis = true;
				neu.ausgeben();
			}
			else
			{
				System.out.println("platz ist schon belegt!!");
			}
		}
		else
		{
			System.out.println("Platz ausserhalb der Grenzen!!!");
		}
		
		
		return ergebnis;	
	}
	
	
	public boolean werkzeugEntfernen( int platz)
	{
		boolean ergebnis = false;
		
		if(platz >=0 && platz<10)
		{
			if(werkzeugkasten[platz]  != null)
			{
				System.out.println("es wurde entfernt:");
				werkzeugkasten[platz].ausgeben();;
				werkzeugkasten[platz] =null;
				ergebnis = true;
				
			}
			else
			{
				System.out.println("platz ist nicht belegt!!");
			}
		}
		else
		{
			System.out.println("Platz ausserhalb der Grenzen!!!");
		}
		
		
		
		return ergebnis;
	}
	
	
}
