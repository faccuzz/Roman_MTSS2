
package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerToRomanTest {
 @Test
    public void testConvertValidNumber() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("M", IntegerToRoman.convert(1000));

    }

    @Test
    public void testConvertInvalidNumber() {
        assertEquals("Invalid number", 
IntegerToRoman.convert(0));
        assertEquals("Invalid number", 
IntegerToRoman.convert(-10));
    }
    /*
    @AfterAll
    public void allTestsCompleted() {
        System.out.println("All tests completed successfully. 
Everything is OK.");
    }
    */


}

