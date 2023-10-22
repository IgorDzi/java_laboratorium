package lista_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {

    @Test
    void module() {
        assertEquals(5, new Vector2D(4,3).module());
    }

    @Test
    void add() {
        assertEquals(new Vector2D(3,4), new Vector2D(1,1).add(new Vector2D(2,3)));
    }

    @Test
    void testAdd() {
        assertEquals(new Vector2D(5,2), Vector2D.add(new Vector2D(2,3), new Vector2D(3,-1)));
    }

    @Test
    void subtract() {
        assertEquals(new Vector2D(1,1), new Vector2D(3,3).subtract(new Vector2D(2,2)));
    }

    @Test
    void testSubtract() {
        assertEquals(new Vector2D(1,1), Vector2D.subtract(new Vector2D(2,3), new Vector2D(1,2)));
    }

    @Test
    void multiplication() {
        assertEquals(new Vector2D(15,12), new Vector2D(5,4).multiplication(3));
    }

    @Test
    void testMultiplication() {
        assertEquals(new Vector2D(8,6), Vector2D.multiplication(new Vector2D(4,3),2));
    }

    @Test
    void testEquals() {
        assertEquals(new Vector2D(2, 2), new Vector2D(2, 2));
    }

    @Test
    void testToString() {
        assertEquals("[1.0, 1.0]", new Vector2D(1,1).toString());
    }
}