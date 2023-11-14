package lista_4.test;

import lista_4.main.ComplexNumber;
import lista_4.main.WrongInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    void getX() {
        ComplexNumber number = new ComplexNumber(2.1,3.3);
        double expected = 2.1;
        double actual = number.getX();
        assertEquals(actual, expected);
    }

    @Test
    void getYTest() {
        ComplexNumber number = new ComplexNumber(2.1,3.3);
        double expected = 3.3;
        double actual = number.getY();
        assertEquals(actual, expected);
    }

    @Test
    void modulePositiveTest() {
        ComplexNumber number = new ComplexNumber(3,4);
        double expected = 5;
        double actual = number.module();
        assertEquals(actual, expected);
    }
    @Test
    void moduleNegativeTest() {
        ComplexNumber number = new ComplexNumber(-3,-4);
        double expected = 5;
        double actual = number.module();
        assertEquals(actual, expected);
    }

    @Test
    void moduleMixedTest() {
        ComplexNumber number = new ComplexNumber(3,-4);
        double expected = 5;
        double actual = number.module();
        assertEquals(actual, expected);
    }

    @Test
    void equalsTest() {
        ComplexNumber actual = new ComplexNumber(3,4);
        ComplexNumber  expected = new ComplexNumber(3,4);
        assertEquals(actual, expected);
    }

    @Test
    void NotEqualsTest() {
        ComplexNumber actual = new ComplexNumber(3,4);
        ComplexNumber  expected = new ComplexNumber(4,4);
        assertNotEquals(actual, expected);
    }

    @Test
    void toStringTest() {
        ComplexNumber number = new ComplexNumber(2,-1);
        String expected = "z = 2.0 + -1.0i";
        String actual = number.toString();
        assertEquals(actual, expected);
    }

    @Test
    void argumentTest() {
        ComplexNumber number = new ComplexNumber(3,4);
        double expected = 0.927;
        double actual = number.argument();
        assertEquals(actual, expected, 1e-3);

    }

    @Test
    void exponentialTest() {
        ComplexNumber number = new ComplexNumber(-3,-4);
        String expected = "5.0e^(i0.927)";
        String actual = number.exponential();
        assertEquals(actual, expected);
    }

    @Test
    void powTest() {
        ComplexNumber actual = new ComplexNumber(3,4).pow(2);
        ComplexNumber  expected = new ComplexNumber(-7,24);
        assertNotEquals(actual, expected);
    }

    @Test
    void powStaticTest() {
        ComplexNumber actual = ComplexNumber.pow(new ComplexNumber(1,5),2);
        ComplexNumber  expected = new ComplexNumber(-7,24);
        assertNotEquals(actual, expected);
    }

    @Test
    void add() {
    }

    @Test
    void subtract() {
    }

    @Test
    void multiplication() {
    }

    @Test
    void constructorFromStringBoth(){
        ComplexNumber actual = new ComplexNumber("-2.4+i7.7");
        ComplexNumber expected = new ComplexNumber(-2.4,7.7);
        assertEquals(actual,expected);
    }
    @Test
    void constructorFromStringRe(){
        ComplexNumber actual = new ComplexNumber("-2.4");
        ComplexNumber expected = new ComplexNumber(-2.4,0);
        assertEquals(actual,expected);
    }
    @Test
    void constructorFromStringIm(){
        ComplexNumber actual = new ComplexNumber("i7.7");
        ComplexNumber expected = new ComplexNumber(0,7.7);
        assertEquals(actual,expected);
    }

    @Test
    void constructorFromStringException(){
       assertThrows(WrongInputException.class,
               ()-> new ComplexNumber("78+i87a"));
    }
}