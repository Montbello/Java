package uvo_Projekt;
public abstract class UVO
{
	private String name;

	public abstract void esseEtwas();
	
	public UVO(String name)
	{
		this.name = name;
	}
	protected String getName()
	{
		return name;
	}
}
