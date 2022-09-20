package arraypaket;

public class Test
{
	public static void main(String[] args)
	{
		Person hans = new Person("Hans Meyer", "33"); 
		hans.arbeite();
		Person tommy = new Student("Thomas Meyer", "22", "XY1234");
		Lehrer schmidt = new Lehrer("Tobias Schmidt", "66", 3250.55 );
		
		tommy.arbeite();
		schmidt.arbeite();
	}
}
