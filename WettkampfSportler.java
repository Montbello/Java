package freieSportlerEV;

public class WettkampfSportler extends Sportler
{
	private String niveau;
	private Wettkampf wettKampfListe;
	

	public WettkampfSportler(String name, String vorname, String geburtsDatum, String eintrittsdatum, double beitrag,
			Sportart sportartenListe, String niveau, Wettkampf wettKampfListe)
	{
		super(name, vorname, geburtsDatum, eintrittsdatum, beitrag, sportartenListe);
		this.niveau = niveau;
		this.wettKampfListe = wettKampfListe;
	}
	public String getNiveau()
	{
		return niveau;
	}
	public Wettkampf getWettKampfListe()
	{
		return wettKampfListe;
	}
	public void berechneBeitragWettkampf()
	{
		
	}
}
