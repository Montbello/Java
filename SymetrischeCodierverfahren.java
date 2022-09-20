package IhkPruefungsycodver;

public abstract class SymetrischeCodierverfahren
{
	protected String klarText;
	protected String privateKey;
	
	public SymetrischeCodierverfahren() {}

	public String getKlarText()
	{
		return klarText;
	}

	public void setKlarText(String klarText)
	{
		this.klarText = klarText;
	}

	public void setPrivateKey(String privateKey)
	{
		this.privateKey = privateKey;
	}
	
	public abstract String codieren();
}
