package haup;

import java.util.ArrayList;

public class DynamischeArraysUndFesteArrays
{

	public static void main(String[] args)
	{
		String[] festeListe = new String[10];
		ArrayList<String> dynamischeListe = new ArrayList<>();
		
		for(int zaehler =0; zaehler <100 ; zaehler++)
		{
			dynamischeListe.add("" + zaehler);
		}
		for(String x : dynamischeListe)
		{
			System.out.println(x);
		}
		System.out.println("groesse:" +dynamischeListe.size());
	}

}
