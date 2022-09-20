package arztpraxis;

public class Standardbehandlung extends Behandlung
{

	public Standardbehandlung(String kvNummer, String behandlung, double kostensatz)
	{
		super(kvNummer, behandlung, kostensatz);
	}

	@Override
	public double getKosten()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
