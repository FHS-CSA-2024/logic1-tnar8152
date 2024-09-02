package src.test.java;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class String1Test. Dont edit or it will mess up your grade :)
 *
 * @author Mr. Johnson
 * @version 8/26/24 v1 (a version number or a date)
 */
public class TestLogic1{
    private Logic1 testLogic = new Logic1();

    @Test
    public void old35Test(){
        assertEquals(true, old35(3));
		assertEquals(true, old35(10));
		assertEquals(false, old35(15));
    }

    @Test
    public void specialElevenTest(){
        assertEquals(true, specialEleven(22));
		assertEquals(true, specialEleven(23));
		assertEquals(false, specialEleven(24));
    }
	
		
	@Test
    public void more20Test(){
		assertEquals(false, more20(20));
		assertEquals(true, more20(21));
		assertEquals(true, more20(42));
    }
	
	    @Test
    public void less20Test(){
		assertEquals(true, less20(18));
		assertEquals(true, less20(59));
		assertEquals(false, less20(20));
    }
	
	@Test
    public void nearTenTest(){
		assertEquals(true, nearTen(12));
		assertEquals(false, nearTen(17));
		assertEquals(true, nearTen(19));
    }
	
	@Test
    public void sortaSumTest(){
		assertEquals(7   , sortaSum(3, 4));
		assertEquals(20  , sortaSum(9, 4));
		assertEquals(21  , sortaSum(10, 11));
    }
	
	@Test
    public void in1To10Test(){
		assertEquals(true, in1To10(5, false));
		assertEquals(false, in1To10(11, false));
		assertEquals(true, in1To10(11, true));
    }
	
	@Test
    public void teenSumTest(){
		assertEquals(7   , teenSum(3, 4));
		assertEquals(19  , teenSum(10, 13));
		assertEquals(19  , teenSum(13, 2));
    }

	@Test
    public void love6Test(){
		assertEquals(true, love6(6, 4));
		assertEquals(false, love6(4, 5));
		assertEquals(true, love6(1, 5));
    }
	
	@Test
    public void lastDigitTest(){
		assertEquals(true, lastDigit(23, 19, 13));
		assertEquals(false, lastDigit(23, 19, 12));
		assertEquals(true, lastDigit(23, 19, 3));
    }

	@Test
    public void answerCellTest(){
		assertEquals(true, answerCell(false, false, false));
		assertEquals(false, answerCell(false, false, true));
		assertEquals(false, answerCell(true, false, false));
    }
	
	@Test
    public void alarmClockTest(){
		assertEquals("7:00", alarmClock(1, false));
		assertEquals("7:00", alarmClock(5, false));
		assertEquals("10:00", alarmClock(0, false));
    }

	@Test
    public void teaPartyTest(){
		assertEquals(1   , teaParty(6, 8));
		assertEquals(0   , teaParty(3, 8));
		assertEquals(2   , teaParty(20, 6));
    }
	
	@Test
    public void redTicketTest(){
		assertEquals(10  , redTicket(2, 2, 2));
		assertEquals(0   , redTicket(2, 2, 1));
		assertEquals(5   , redTicket(0, 0, 0));
    }
	
	@Test
    public void greenTicketTest(){
		assertEquals(0   , greenTicket(1, 2, 3));
		assertEquals(20  , greenTicket(2, 2, 2));
		assertEquals(10  , greenTicket(1, 1, 2));
    }
	
	@Test
    public void squirrelPlayTest(){
		assertEquals(true, squirrelPlay(70, false));
		assertEquals(false, squirrelPlay(95, false));
		assertEquals(true, squirrelPlay(95, true));
    }
	
	@Test
    public void caughtSpeedingTest(){
		assertEquals(0   , caughtSpeeding(60, false));
		assertEquals(1   , caughtSpeeding(65, false));
		assertEquals(0   , caughtSpeeding(65, true));
    }
	
	@Test
    public void dateFashionTest(){
		assertEquals(2   , dateFashion(5, 10));
		assertEquals(0   , dateFashion(5, 2));
		assertEquals(1   , dateFashion(5, 5));
    }
	
	@Test
    public void fizzString2Test(){
		assertEquals("1!", fizzString2(1));
		assertEquals("Buzz!", fizzString2(5));
		assertEquals("Fizz!", fizzString2(3));
		assertEquals("FizzBuzz!", fizzString2(15));
    }
	
	@Test
    public void sodaPartyTest(){
		assertEquals(false, sodaParty(30, false));
		assertEquals(true, sodaParty(50, false));
		assertEquals(true, sodaParty(70, true));
    }
	
}
