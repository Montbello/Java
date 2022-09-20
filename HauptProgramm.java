package IhkPruefungsycodver;

public class HauptProgramm
{

	public static void main(String[] args)
	{
		Viegenere v = new Viegenere();
		v.setKlarText("DERADLERISTGELANDET");
		v.setPrivateKey("PRUEFUNG");
		
		String s = v.codieren();
		System.out.println(s);

	}

}
