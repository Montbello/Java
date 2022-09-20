package arraypaket;

public class Student extends Person
{
	private String matrikelNr;

	public Student(String name, String alter, String matrikelNr)
	{
		super(name, alter);
		this.matrikelNr = matrikelNr;
	}
	public void arbeite()
	{
		System.out.println("ich, " + getName() + " bin Student und arbeite nicht!");
	}
	public String getMatrikelNr()
	{
		return matrikelNr;
	}
	
}
