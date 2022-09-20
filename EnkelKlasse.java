package vererbungsBeispiel;

public class EnkelKlasse extends KindesKlasse
{
	int anzahlSpielzeuge;
	
	public void zeige_dich()
	{
		System.out.println("ich heisse "+ name);
		System.out.println("ich bin " + alter + " Jahre alt!");
		System.out.println("ich habe " +anzahlSpielzeuge + " Spielzeuge!!");
	} 
}
