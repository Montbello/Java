package ppt;

import javax.swing.*;

public class Test
{
	public static void rechnungsbetragRechnen()
	{
		//Eingabe Rabatt!!
		String sumsatz = JOptionPane.showInputDialog("Bitte Umsatz eingeben");
		double umsatz = Double.parseDouble(sumsatz);
		double rabatt;
		if(umsatz>100)
		{
			if(umsatz >500)
			{
				rabatt = 10;
			}
			else
			{
				rabatt=5;
			}
		}
		else
		{
			rabatt =0;
		}
		double rechnungsBetrag = umsatz - rabatt*umsatz/100;
		System.out.println(rechnungsBetrag);
		
		
	}
	public static void Beispiel1()
	{
		//Eingabe Radius!!
		String serg = JOptionPane.showInputDialog("Bitte Radius eingeben");
		double radius = Double.parseDouble(serg);
		
		
		double Flaeche = radius*radius*3.14;
		System.out.println("Flaeche ist " +Flaeche);
	}
	public static void Beispiel2()
	{
		int A = 5;
		int B = 3;
		int C = A*B;
		System.out.println(C); 
	}
	public static void  Aufgabe2()
	{
		int x = 2;
		int y = 6;
		int z = y-x;
		y=4;
		z = z+y;
		System.out.println(z); 
	}

	public static void kaffeeKochen()
	{
		boolean tankLeer =true;
		System.out.println("KafeeFilter wird eingelegt");
		System.out.println("Kafeepulver wird eingefüllt");
		
		if(tankLeer)
		{
			System.out.println("Wasser einfuellen");
		}
		else
		{
			//gar nix
		}
		
		System.out.println("Maschine einschalten");
		
	}
	public static void zahlX2OderPlusEins()
	{
		String szahl = JOptionPane.showInputDialog("Bitte Zahl eingeben");
		int zahl = Integer.parseInt(szahl);
		if(zahl%2==0)
		{
			zahl = zahl*2;
		}
		else
		{
			zahl = zahl+1;
		}
		System.out.println(zahl);		
		
	}
	public static void SchaltjahrOderNich()
	{
		String sjahr = JOptionPane.showInputDialog("Bitte Jahr eingeben");
		int jahr = Integer.parseInt(sjahr);
		if(jahr%4 ==0)
		{
			if(jahr%100 ==0)
			{
				if(jahr%400==0)
				{
					System.out.println("ES IST ein SCHALTJAHR");
				}
				else
				{
					System.out.println("Es ist KEIN Schaltjahr!!!");
				}
			}
			else
			{
				System.out.println("Es IST ein Schaltjahr!!");
			}
		}
		else
		{
			System.out.println("KEIN SCHALTJAHR!!");
		}
	}
	public static void swcaDerErste()
	{
		String szahl = JOptionPane.showInputDialog("Bitte Zahl zwischen 0 und 3 eingeben");
		int zahl = Integer.parseInt(szahl);
		switch(zahl)
		{
		case 1:
			System.out.println("Anzeigen");
			break;
		case 2:
			System.out.println("Drucken");
			break;
		case 3:
			System.out.println("Neueingabe");
			break;
		case 0:
			System.out.println("Beenden");
			break;
			
		default:
			System.out.println("Falsche zahl!");
			break;
		}

	}
	public static void messeUndLaufe()
	{
		int puls = 70;
		while(puls<160)
		{
			System.out.println("LAUFE EINE RUNDE... " +puls);
			puls = messePulsNochmal();
		}
	}
	
	private static int messePulsNochmal()
	{
		return (int)(Math.random()*200);
	}
	public static void main(String[] args)
	{
		//Beispiel1();
		//Beispiel2();
		//Aufgabe2();
		//kaffeeKochen();
		//rechnungsbetragRechnen();
		//zahlX2OderPlusEins();
		//SchaltjahrOderNich();
		//swcaDerErste();
		messeUndLaufe();
	}

}
