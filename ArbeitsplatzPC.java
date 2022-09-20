package haup;

public class ArbeitsplatzPC
{
	private String macAdresse;
	private char netz;
	public ArbeitsplatzPC(String macAdresse, char netz)
	{
		this.macAdresse = macAdresse;
		this.netz = netz;
	}
	public String getMac()
	{
		return macAdresse;
	}
	public boolean setMac(String macAdresse)
	{
		this.macAdresse = macAdresse;
		return false;
	}
	public char getNetz()
	{
		return netz;
	}
	public boolean setNetz(char netz)
	{
		this.netz = netz;
		return false;
	}
	private boolean checknetz(char c)
	{
		return false;	
	}
	private boolean checkMac(String c)
	{
		//?????????
		return false;	
	}
	private boolean checkHex(char c)
	{
		return false;	
	}	
}
