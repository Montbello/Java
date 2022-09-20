package freieSportlerEV;

public class FreizeitSportler extends Sportler
{
	private boolean saunaBenutzung;
	private boolean freieTrainingsAuswahl;
	
	public FreizeitSportler(String name, String vorname, String geburtsDatum, String eintrittsdatum, double beitrag,
			Sportart sportartenListe, boolean saunaBenutzung, boolean freieTrainingsAuswahl)
	{
		super(name, vorname, geburtsDatum, eintrittsdatum, beitrag, sportartenListe);
		this.saunaBenutzung = saunaBenutzung;
		this.freieTrainingsAuswahl = freieTrainingsAuswahl;
	}

	public boolean isSaunaBenutzung()
	{
		return saunaBenutzung;
	}

	public boolean isFreieTrainingsAuswahl()
	{
		return freieTrainingsAuswahl;
	}

	public void berechneBeitragFreizeit()
	{
		
	}
}
