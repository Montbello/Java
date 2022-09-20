package ihk;

public class Testprogramm
{

	public static void main(String[] args)
	{
		Industrieroboter robbi = new Industrieroboter();
		Bohrer bohrer1 = new Bohrer("Bosch", 0,100);
		Bohrer bohrer2 = new Bohrer("Makita", 0,100);

		robbi.werkzeugHinzufuegen(5, bohrer1);
		robbi.werkzeugHinzufuegen(5, bohrer2);
		robbi.werkzeugHinzufuegen(10, bohrer2);
		robbi.werkzeugHinzufuegen(-1, bohrer2);
		
		robbi.werkzeugEntfernen(5);
		robbi.werkzeugEntfernen(5);

		robbi.werkzeugEntfernen(10);
		robbi.werkzeugEntfernen(-1);
	
	}

}
/*es wurde im platz 5 ein neues Werkzeug hinzugefuegt!!
Ein Bohrer mit Verschleiss =0 mit Groesse 100
Platz ist schon belegt!!
FALSCHER PLATZ EINGEGEBEN!!
FALSCHER PLATZ EINGEGEBEN!!
es wurde im platz 5 das Werkzeug entfernt!!!!
Ein Bohrer mit Verschleiss =0 mit Groesse 100
Platz ist leer, kann man nix entfernen!!!
FALSCHER PLATZ EINGEGEBEN!!
FALSCHER PLATZ EINGEGEBEN!!
*/