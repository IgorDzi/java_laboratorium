package lista_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    void module() {
        assertEquals(5, new ComplexNumber(4,3).module());
    }


    @Test
    void testEquals() {
        assertEquals(new ComplexNumber(1,1), new ComplexNumber(1,1));
    }

    @Test
    void testToString() {
        assertEquals("z = 2.0 + 3.0i", new ComplexNumber(2,3).toString());
    }

    @Test
    void testArgument() {
        assertEquals(0.7853981633974483, new ComplexNumber(1,1).argument());
    }

    @Test
    void testExponential() {
        assertEquals("5.0e^(i0.9272952180016122)", new ComplexNumber(3,4).exponential());
    }

    @Test
    void pow() {
        ComplexNumber expected = new ComplexNumber(-7,24);
        ComplexNumber actual = new ComplexNumber(3,4).pow(2);
        assertEquals(expected.getX(), Math.round(actual.getX()));
        assertEquals(expected.getY(), Math.round(actual.getY()));
    }

    @Test
    void testPow() {
        ComplexNumber expected = new ComplexNumber(-7,24);
        ComplexNumber actual = ComplexNumber.pow(new ComplexNumber(3,4),2);
        assertEquals(expected.getX(), Math.round(actual.getX()));
        assertEquals(expected.getY(), Math.round(actual.getY()));
    }

    @Test
    void testAdd() {
        assertEquals(new ComplexNumber(3,4), new ComplexNumber(1,1).add(new ComplexNumber(2,3)));
    }
    
}