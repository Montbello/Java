package drachental;

public class Opfer
{
	private String name;
	
	public Opfer(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void schreie(Drache derVerursacher)
	{
		System.out.println("HILFEEEEE!!");
		System.out.println(derVerursacher.getName() + " will mich fressen!");
	}

}
