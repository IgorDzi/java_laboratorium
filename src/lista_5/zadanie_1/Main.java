package lista_5.zadanie_1;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> setA = Set.of(1,2,3);
        Set<Integer> setB = Set.of(2,4,5);
        Set<Integer> setC = Set.of(2,4,5);
        System.out.println(Collection.union(setA,setB));
        System.out.println(Collection.difference(setA,setB));
        System.out.println(Collection.intersection(setA,setB));
        System.out.println(Collection.symmetricDifference(setA,setB));
        System.out.println(Collection.compare(setA,setB));
        System.out.println(Collection.compare(setC,setB));
    }
}
