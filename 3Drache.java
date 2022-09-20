package drachental;

import java.util.ArrayList;

public class Drache
{
	private String name;
	
	public ArrayList<String> ungezieferListe = new ArrayList<>();
	public String getName()
	{
		return name;
	}
	private boolean hungrig =true;
	private int anzahlLeben =10;
	public Drache(String name)
	{
		this.name = name;
	}
	
	public void bruelle(String text)
	{
		System.out.println("ich, " + name + " bruelle: " + text);
	}
	public void schnappe(Opfer dasArmeSchwein)
	{
		for(String x : ungezieferListe)
		{
			bruelle("Verfluchte Ungeziefer! Kratz Kratz!");
		}
		if(anzahlLeben>0)
		{
			bruelle("Lecker... ein Opfer!!");
			bruelle("der " +dasArmeSchwein.getName());
			
			bruelle("ich muss dich würzen bevor ich dich fresse!");
			dasArmeSchwein.schreie(this);	//Damit er weiss, welcher Drache der Boesewicht ist
			bruelle("Rüelps.. Mahlzeit!!");
		}
		else
		{
			bruelle("Shit.. bin Mausetot!!");
		}
	}
	public void steckeSchlagEin(int staerke)
	{
		bruelle("AUTCH!!");
		anzahlLeben = anzahlLeben-staerke;
	}
	
}
