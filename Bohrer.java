package ihk;

public class Bohrer extends Werkzeug
{
	private int groesse;

	public Bohrer(String art, int verschleiss, int groesse)
	{
		super(art, verschleiss);
		this.groesse = groesse;
	}

	@Override
	public void ausgeben()
	{
		System.out.println("Ein Bohrer mit Verschleiss =" + verschleiss+ " mit Groesse " + groesse );
		
	}
	
	
}
