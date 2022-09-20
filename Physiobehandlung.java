package arztpraxis;

public class Physiobehandlung extends Behandlung
{

	public Physiobehandlung(String kvNummer, String behandlung, double kostensatz)
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
