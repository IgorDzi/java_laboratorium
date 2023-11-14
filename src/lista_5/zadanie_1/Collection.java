package lista_5.zadanie_1;

import java.util.HashSet;
import java.util.Set;

public class Collection {


    public static Set<Integer> union(Set<Integer> SetA, Set<Integer> SetB) {
        Set<Integer> result = new HashSet<>(SetA);
        result.addAll(SetB);
        return result;
    }
    public static Set<Integer>  difference(Set<Integer> SetA, Set<Integer> SetB){
        Set<Integer> result = new HashSet<>(SetA);
        result.removeAll(SetB);
        return  result;
    }

    public static Set<Integer> intersection(Set<Integer> SetA, Set<Integer> SetB){
        Set<Integer> result = new HashSet<>(SetA);
        result.retainAll(SetB);
        return result;
    }

    public static Set<Integer> symmetricDifference(Set<Integer> SetA, Set<Integer> SetB){
        Set<Integer> resultA = new HashSet<>(SetA);
        resultA.removeAll(SetB);
        Set<Integer> resultB = new HashSet<>(SetB);
        resultB.removeAll(SetA);
        return Collection.union(resultA,resultB);
    }
    public static boolean compare(Set<Integer> SetA, Set<Integer> SetB){
        return SetA.equals(SetB);
    }
}
