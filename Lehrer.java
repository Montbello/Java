package arraypaket;

public class Lehrer extends Person
{
	private double gehalt;

	public double getGehalt()
	{
		return gehalt;
	}

	public Lehrer(String name, String alter, double gehalt)
	{
		super(name, alter);
		this.gehalt = gehalt;
	}	
}
