package lista_5.zadanie_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {
    private static Set<Integer> setA;
    private static Set<Integer> setB;
    private static Set<Integer> setC;

    @BeforeAll
    static void setUp(){
        setA = Set.of(1,2,3);
        setB = Set.of(2,4,5);
        setC = Set.of(2,4,5);
    }
    @Test
    void unionTest() {
        Set<Integer> expected = Set.of(1,2,3,4,5);
        assertEquals(expected, Collection.union(setA,setB));
    }

    @Test
    void differenceTest() {
        Set<Integer> expected = Set.of(1,3);
        assertEquals(expected, Collection.difference(setA,setB));
    }

    @Test
    void intersectionTest() {
        Set<Integer> expected = Set.of(2);
        assertEquals(expected, Collection.intersection(setA,setB));
    }

    @Test
    void symmetricDifferenceTest() {
        Set<Integer> expected = Set.of(1,3,4,5);
        assertEquals(expected, Collection.symmetricDifference(setA,setB));
    }

    @Test
    void compareTrueTest() {
        assertTrue(Collection.compare(setC,setB));
    }

    @Test
    void compareFalseTest() {
        assertFalse(Collection.compare(setA,setB));
    }
}