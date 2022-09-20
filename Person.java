package arraypaket;
public class Person
{
	private String name;
	private String alter;
	public void arbeite()
	{
		System.out.println("ich, " + name + " arbeite!");
	}
	public String getName()
	{
		return name;
	}
	public String getAlter()
	{
		return alter;
	}
	public Person(String name, String alter)
	{
		this.name = name;
		this.alter = alter;
	}
}
