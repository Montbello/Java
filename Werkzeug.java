package ihk;

public abstract class Werkzeug
{
	private String art;
	protected int verschleiss =0;
	public Werkzeug(String art, int verschleiss)
	{
		this.art = art;
		if(verschleiss<0)
		{
			verschleiss =0;
		}
		if (verschleiss>100)
		{
			verschleiss=100;
		}
		
		this.verschleiss = verschleiss;
	}
	
	public abstract void ausgeben();
}
