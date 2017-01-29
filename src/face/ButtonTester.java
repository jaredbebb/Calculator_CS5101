package face;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ButtonTester {
	Buttons buttontester = new Buttons();
	
	int caseOne, caseTwo, caseThree, caseFour;
	@Before
	public void setUp() throws Exception{
		caseOne = 1;
		caseTwo = 2;
		caseThree = 3;
		caseFour = 4;
	}
	
	@Test
	public void testNumParse(){
		assertEquals(3, buttontester.pressAdd(caseOne, caseTwo));
	}

}
