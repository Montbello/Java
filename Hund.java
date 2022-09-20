package uvo_Projekt;
public class Hund extends UVO
{
	public Hund(String name)
	{
		super(name);
	}

	@Override
	public void esseEtwas()
	{
		System.out.println(getName()+ " sagt:WAUUU ich esse als Hund!");		
	}

}
