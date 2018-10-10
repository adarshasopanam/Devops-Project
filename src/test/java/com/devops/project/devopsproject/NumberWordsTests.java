package com.devops.project.devopsproject;

import org.junit.*;

public class NumberWordsTests {
	private NumberWords numberWords ;
	private NumReceive nm ;
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
		nm=new NumReceive();
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals(  "NUMBER OUT OF RANGE", nm.Words( -1) ) ;
	}
	@Test
	public void numberOne() {
		Assert.assertEquals( "Result","ONE",numberWords.toWords( 1, " " ) ) ;
	}
	@Test
	public void numberOne1() {
		Assert.assertEquals( "Result","ONE",nm.Words( 1 ) ) ;
	}
	@Test
	public void numberTen() {
		Assert.assertEquals( "Result","TEN",numberWords.toWords( 10, " " ) ) ;
	}
	@Test
	public void numberTen1() {
		Assert.assertEquals( "Result","TEN",nm.Words( 10 ) ) ;
	}
	@Test
	public void numberTwenty() {
		Assert.assertEquals( "Result","TWENTY",numberWords.toWords( 20, " " ) ) ;
	}
	@Test
	public void numberTwenty1() {
		Assert.assertEquals( "Result","TWENTY",nm.Words( 20) ) ;
	}
	@Test
	public void numberThirty() {
		Assert.assertEquals( "Result","THIRTY",numberWords.toWords( 30, " " ) ) ;
	}
	@Test
	public void numberThirty1() {
		Assert.assertEquals( "Result","THIRTY",nm.Words( 30 ) ) ;
	}
	@Test
	public void numberFourty() {
		Assert.assertEquals( "Result","FOURTY",numberWords.toWords( 40, " " ) ) ;
	}
	@Test
	public void numberFourty1() {
		Assert.assertEquals( "Result","FOURTY",nm.Words( 40) ) ;
	}
	@Test
	public void numberFifty() {
		Assert.assertEquals( "Result","FIFTY",numberWords.toWords( 50, " " ) ) ;
	}
	@Test
	public void numberFifty1() {
		Assert.assertEquals( "Result","FIFTY",nm.Words( 50) ) ;
	}
	@Test
	public void numberSixty() {
		Assert.assertEquals( "Result","SIXTY",numberWords.toWords( 60, " " ) ) ;
	}
	@Test
	public void numberSixty1() {
		Assert.assertEquals( "Result","SIXTY",nm.Words( 60 ) ) ;
	}
	@Test
	public void numberSeventy() {
		Assert.assertEquals( "Result","SEVENTY",numberWords.toWords( 70, " " ) ) ;
	}
	@Test
	public void numberSeventy1() {
		Assert.assertEquals( "Result","SEVENTY",nm.Words( 70) ) ;
	}
	@Test
	public void numberEighty() {
		Assert.assertEquals( "Result","EIGHTY",numberWords.toWords( 80, " " ) ) ;
	}
	@Test
	public void numberEighty1() {
		Assert.assertEquals( "Result","EIGHTY",nm.Words( 80) ) ;
	}
	@Test
	public void numberNinety() {
		Assert.assertEquals( "Result","NINETY",numberWords.toWords( 90, " " ) ) ;
	}
	@Test
	public void numberNinety1() {
		Assert.assertEquals( "Result","NINETY",nm.Words( 90 ) ) ;
	}
	@Test
	public void numberHundred() {
		Assert.assertEquals( "Result","ONE HUNDRED",numberWords.toWords( 1, " HUNDRED" ) ) ;
	}
	@Test
	public void numberHundred1() {
		Assert.assertEquals( "Result","ONE HUNDRED",nm.Words( 100) ) ;
	}
	@Test
	public void numberEleven() {
		Assert.assertEquals( "Result","ELEVEN",numberWords.toWords( 11, " " ) ) ;
	}
	@Test
	public void numberEleven1() {
		Assert.assertEquals( "Result","ELEVEN",nm.Words( 11 ) ) ;
	}
	@Test
	public void numberTwelve() {
		Assert.assertEquals( "Result","TWELVE",numberWords.toWords( 12, " " ) ) ;
	}
	@Test
	public void numberTwelve1() {
		Assert.assertEquals( "Result","TWELVE",nm.Words( 12 ) ) ;
	}
	@Test
	public void numberThirteen() {
		Assert.assertEquals( "Result","THIRTEEN",numberWords.toWords( 13, " " ) ) ;
	}
	@Test
	public void numberThirteen1() {
		Assert.assertEquals( "Result","THIRTEEN",nm.Words( 13 ) ) ;
	}
	@Test
	public void numberFourteen() {
		Assert.assertEquals( "Result","FOURTEEN",numberWords.toWords( 14, " " ) ) ;
	}
	@Test
	public void numberFourteen1() {
		Assert.assertEquals( "Result","FOURTEEN",nm.Words( 14 ) ) ;
	}
	@Test
	public void numberFifteen() {
		Assert.assertEquals( "Result","FIFTEEN",numberWords.toWords( 15, " " ) ) ;
	}
	@Test
	public void numberFifteen1() {
		Assert.assertEquals( "Result","FIFTEEN",nm.Words( 15) ) ;
	}
	@Test
	public void numberSixteen() {
		Assert.assertEquals( "Result","SIXTEEN",numberWords.toWords( 16, " " ) ) ;
	}
	@Test
	public void numberSixteen1() {
		Assert.assertEquals( "Result","SIXTEEN",nm.Words( 16 ) ) ;
	}
	@Test
	public void numberSeventeen() {
		Assert.assertEquals( "Result","SEVENTEEN",numberWords.toWords( 17, " " ) ) ;
	}
	@Test
	public void numberSeventeen1() {
		Assert.assertEquals( "Result","SEVENTEEN",nm.Words( 17 ) ) ;
	}
	@Test
	public void numberEighteen() {
		Assert.assertEquals( "Result","EIGHTEEN",numberWords.toWords( 18, " " ) ) ;
	}
	@Test
	public void numberEighteen1() {
		Assert.assertEquals( "Result","EIGHTEEN",nm.Words( 18 ) ) ;
	}
	@Test
	public void numberNineteen() {
		Assert.assertEquals( "Result","NINETEEN",numberWords.toWords( 19, " " ) ) ;
	}
	@Test
	public void numberNineteen1() {
		Assert.assertEquals( "Result","NINETEEN",nm.Words( 19 ) ) ;
	}
	@Test
	public void numberNinetynine() {
		Assert.assertEquals( "Result","NINETY  NINE",numberWords.toWords( 99, " " ) ) ;
	}
	@Test
	public void numberNinetynine1() {
		Assert.assertEquals( "Result","NINETY  NINE",nm.Words( 99 ) ) ;
	}
	@Test
	public void numberNineHundred() {
		Assert.assertEquals( "Result","NINE HUNDRED",numberWords.toWords( 9, " HUNDRED" ) ) ;
	}
	@Test
	public void numberNineHundred1() {
		Assert.assertEquals( "Result","NINE HUNDRED",nm.Words( 900 ) ) ;
	}
	@Test
	public void numberTwo1() {
		Assert.assertEquals( "Result","TWO",numberWords.toWords( 2," " ) ) ;
	}
	@Test
	public void numberThree1() {
		Assert.assertEquals( "Result","THREE",numberWords.toWords( 3, " " ) ) ;
	}
	@Test
	public void numberFour1() {
		Assert.assertEquals( "Result","FOUR",numberWords.toWords( 4," " ) ) ;
	}
	@Test
	public void numberFive1() {
		Assert.assertEquals( "Result","FIVE",numberWords.toWords( 5 ," ") ) ;
	}
	@Test
	public void numberSix1() {
		Assert.assertEquals( "Result","SIX",numberWords.toWords( 6," " ) ) ;
	}
	@Test
	public void numberSeven1() {
		Assert.assertEquals( "Result","SEVEN",numberWords.toWords( 7," " ) ) ;
	}
	@Test
	public void numberEight1() {
		Assert.assertEquals( "Result","EIGHT",numberWords.toWords( 8 ," ") ) ;
	}
	@Test
	public void numberNine1() {
		Assert.assertEquals( "Result","NINE",numberWords.toWords( 9," " ) ) ;
	}
	@Test
	public void numberTwo() {
		Assert.assertEquals( "Result","TWO",nm.Words( 2 ) ) ;
	}
	@Test
	public void numberThree() {
		Assert.assertEquals( "Result","THREE",nm.Words( 3 ) ) ;
	}
	@Test
	public void numberFour() {
		Assert.assertEquals( "Result","FOUR",nm.Words( 4 ) ) ;
	}
	@Test
	public void numberFive() {
		Assert.assertEquals( "Result","FIVE",nm.Words( 5 ) ) ;
	}
	@Test
	public void numberSix() {
		Assert.assertEquals( "Result","SIX",nm.Words( 6 ) ) ;
	}
	@Test
	public void numberSeven() {
		Assert.assertEquals( "Result","SEVEN",nm.Words( 7 ) ) ;
	}
	@Test
	public void numberEight() {
		Assert.assertEquals( "Result","EIGHT",nm.Words( 8 ) ) ;
	}
	@Test
	public void numberNine() {
		Assert.assertEquals( "Result","NINE",nm.Words( 9 ) ) ;
	}
	@Test
	public void numberNineHundredNinetyNine() {
		Assert.assertEquals( "Result","NINE HUNDREDNINETY  NINE",nm.Words( 999 ) ) ;
	}
	 @Test(expected = NumberFormatException.class)
	    public void testNumberFormatException() {
	        String value="ABCDE";
	        int number=Integer.parseInt(value);
	    }
}
