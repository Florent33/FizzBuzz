
public class FizzBuzz {

	public String MonResultat() {
		// TODO Auto-generated method stub
		return "2";
	}
	
	public String EstMultipleDe3(int nombre) {
		return "Fizz";
	}
	
	public String EstMultipleDe5(int nombre) {
		return "Buzz";
	}

	public String EstMultipleDe3_ET_EstMultipleDe5(int nombre) {
		return "FizzBuzz";
	}
	
	public void AfficherTableau() {
		for(int nombre=1; nombre<=100; nombre++)
		{
			if(nombre%3 == 0)
			  System.out.println("Fizz");
			if(nombre%5==0)
				System.out.println("Buzz");
			if(nombre%15==0)
				System.out.println("FizzBuzz");
			System.out.println(nombre);
		}
	}
}