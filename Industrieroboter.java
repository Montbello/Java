package ihk;

public class Industrieroboter
{
	private static int maxAnzWerkzeuge=10;
	Werkzeug[] werkzeugkasten = new Werkzeug[maxAnzWerkzeuge];

	public static int getMaxAnzWerkzeuge()
	{
		return maxAnzWerkzeuge;
	}

	public Industrieroboter() {}
	
	public boolean werkzeugHinzufuegen(int platz, Werkzeug neu)
	{
		boolean ergebnis = false;
		
		if(platz>=0 && platz<10)
		{
			if(werkzeugkasten[platz]==null)
			{
				werkzeugkasten[platz] = neu;
				ergebnis = true;
				System.out.println("es wurde im platz " + platz + " ein neues Werkzeug hinzugefuegt!!");
				neu.ausgeben();
			}
			else
			{
				System.out.println("Platz ist schon belegt!!");
			}
		}
		else
		{
			System.out.println("FALSCHER PLATZ EINGEGEBEN!!");
		}
		
		return ergebnis;
	}
	public boolean werkzeugEntfernen(int platz)
	{
		boolean ergebnis = false;
		
		if(platz>=0 && platz<10)
		{
			if(werkzeugkasten[platz]!=null)
			{
				
				ergebnis = true;
				System.out.println("es wurde im platz " + platz + " das Werkzeug entfernt!!!!");
				werkzeugkasten[platz].ausgeben();
				werkzeugkasten[platz] = null;
			}
			else
			{
				System.out.println("Platz ist leer, kann man nix entfernen!!!");
			}
		}
		else
		{
			System.out.println("FALSCHER PLATZ EINGEGEBEN!!");
		}
		
		return ergebnis;		
	}
}
