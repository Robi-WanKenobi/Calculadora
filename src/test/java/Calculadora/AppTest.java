package Calculadora;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest
{
    @org.junit.Test
    public void validSuma()
    {
        assertTrue(new Suma(4,6).calculate() == 10);
    }
    @org.junit.Test
    public void invalidSuma()
    {
        assertFalse(new Suma(50,90).calculate() != 140);
    }
    @org.junit.Test
    public void validResta(){
        assertTrue(new Resta(5,4).calculate() == 1);
    }
    @org.junit.Test
    public void invalidResta(){
        assertFalse(new Resta(8,6).calculate()!= 2);
    }
    @org.junit.Test
    public void negativeResta(){
        assertTrue(new Resta(8,9).calculate()<0);
    }
    @org.junit.Test
    public void validMultiplicacion(){
        assertEquals(20,new Multiplicacion(4,5).calculate(),0.01);
    }
    @org.junit.Test
    public void negativeMultiplicacion(){
        assertTrue(new Multiplicacion(-5,2).calculate() < 0);
    }
    @org.junit.Test
    public void validDivision(){
        try {
            assertTrue(new Division(6,3).calculate() == 2);
        } catch (InfiniteException e) {
            e.getMessage();
        }
    }
    @org.junit.Test
    public void infiniteResult(){
        try {
            assertTrue(new Division(6,0).calculate() == 2);
        } catch (InfiniteException e) {
            e.getMessage();
        }
    }
}
