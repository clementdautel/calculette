import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculetteTest {

	private Calculette c;

	@Before
	public void initCalculette(){
		this.c = new Calculette();
	}

	@Test
	public void getResultZero(){
		c.click(0);
		assertEquals(0,this.c.getResult());
	}

	@Test
	public void clickOneGetResultOne(){
		c.click(1);
		assertEquals(1,this.c.getResult());
	}

	@Test
	public void clickOnePlusOneGetResultTwo(){
		c.click(1)
		.click("+")
		.click(1)
		.click("=");
		assertEquals(2,this.c.getResult());
	}
	
	@Test
	public void clickOnePlusOneThenThreeGetResultTwo(){
		c.click(1)
		.click("+")
		.click(1)
		.click(3)
		.click("=");
		assertEquals(14,this.c.getResult());
	}
	
	@Test
	public void clickTwoMinusOneGetResultOne() {
		c.click(3)
		.click("-")
		.click(2)
		.click("=");
		assertEquals(1, this.c.getResult());
	}
	
//	@Test
//	public void clickTwoTimesTwoGetResultFour() {
//		c.click(2)
//		.click("*")
//		.click(6);
//		assertEquals(12, this.c.getResult());
//	}
//	
//	@Test
//	public void clickTwoTimesZeroGetResultZero() {
//		c.click(2)
//		.click("*")
//		.click(0);
//		assertEquals(0, this.c.getResult());
//	}
//	
//	@Test
//	public void clickSixDividesTwoGetResultThree() {
//		c.click(15)
//		.click("/")
//		.click(2);
//		assertEquals(7.5, this.c.getResult(),0);
//	}
//	@Test
//	public void clickSixDividesZeroGetResultError() {
//		c.click(6)
//		.click("/")
//		.click(0);
//		assertEquals(0, this.c.getResult());
//	}
//	
//	@Test
//	public void clickTenModuloThreeGetResult() {
//		c.click(9)
//		.click("%")
//		.click(4);
//		assertEquals(1, this.c.getResult());
//	}
	

}
