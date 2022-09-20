package arztpraxis;

public abstract class Behandlung
{
	private String kvNummer;
	private String behandlung;
	private double kostensatz;

	public String getKvNummer()
	{
		return kvNummer;
	}

	public String getBehandlung()
	{
		return behandlung;
	}

	public double getKostensatz()
	{
		return kostensatz;
	}
	

	public Behandlung(String kvNummer, String behandlung, double kostensatz)
	{
		this.kvNummer = kvNummer;
		this.behandlung = behandlung;
		this.kostensatz = kostensatz;
	}

	public abstract double getKosten();
}
