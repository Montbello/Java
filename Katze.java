package uvo_Projekt;

public class Katze extends UVO
{
	public Katze(String n)
	{
		super(n);
	}
	@Override
	public void esseEtwas()
	{
		System.out.println(getName()+ " miaut: ICH ESSE ALS KATZE!!");
	}


}
