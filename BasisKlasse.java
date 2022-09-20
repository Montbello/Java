package vererbungsBeispiel;

public class BasisKlasse
{
	public String name;

	
	public void zeige_dich(int anzahl)
	{
		for(int i =0; i < anzahl; i++)
		{
			System.out.println(i+" ich heisse "+ name);
		}
	}
	
	public void zeige_dich()
	{
		System.out.println("ich heisse "+ name);
	} 

}
