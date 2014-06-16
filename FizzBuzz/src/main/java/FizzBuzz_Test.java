import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzz_Test {

	private FizzBuzz monFizzBuzz;
	
	@Before
	public void Setup() {
		monFizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void EstUnNombreQuelconque() {
		assertEquals("2", this.monFizzBuzz.MonResultat());
	}
	
	@Test
	public void EstMultipleDe3() {
		assertEquals("Fizz", this.monFizzBuzz.EstMultipleDe3(3));
	}
	
	@Test
	public void EstMultipleDe5() {
		assertEquals("Buzz", this.monFizzBuzz.EstMultipleDe5(5));
	}
	
	@Test
	public void EstMultipleDe3_ET_EstMultipleDe5() {
		assertEquals("FizzBuzz", this.monFizzBuzz.EstMultipleDe3_ET_EstMultipleDe5(15));
	}
	
	@Test
	public void AfficherTableau() {
		this.monFizzBuzz.AfficherTableau();
	}
}