package arraypaket;
public class Lehrer extends Person
{
	private double gehalt;
	public double getGehalt()
	{
		return gehalt;
	}
	public void arbeite()
	{
		System.out.println("Ich bin Lehrer " + getName() + " und arbeite für " + gehalt + " im Monat!");
	}
	public Lehrer(String name, String alter, double gehalt)
	{
		super(name, alter);
		this.gehalt = gehalt;
	}	
}
