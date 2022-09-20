package freieSportlerEV;

public abstract class Sportler
{
	private String name;
	private String vorname;
	private String geburtsDatum;
	private String eintrittsdatum;
	private double beitrag =50;
	private Sportart sportartenListe;
	public String getName()
	{
		return name;
	}
	public String getVorname()
	{
		return vorname;
	}
	public String getGeburtsDatum()
	{
		return geburtsDatum;
	}
	public String getEintrittsdatum()
	{
		return eintrittsdatum;
	}
	public double getBeitrag()
	{
		return beitrag;
	}
	public Sportart getSportartenListe()
	{
		return sportartenListe;
	}
	public Sportler(String name, String vorname, String geburtsDatum, String eintrittsdatum, double beitrag,
			Sportart sportartenListe)
	{
		this.name = name;
		this.vorname = vorname;
		this.geburtsDatum = geburtsDatum;
		this.eintrittsdatum = eintrittsdatum;
		this.beitrag = beitrag;
		this.sportartenListe = sportartenListe;
	}
	
	
}
