package lista_7.zadanie_1;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ComplexNumber actual = new ComplexNumber("0.99988-0.01579i");
        ComplexNumber expected = new ComplexNumber(-2.4,7.7);
        System.out.println(actual);
        System.out.println(expected);
        Map<Double, ComplexNumber> complexNumbers = ComplexNumber.readComplexData("src/lista_7/zadanie_1/data.dat");
        complexNumbers.forEach((key, value) -> System.out.println(key + ": " + value));
        ComplexNumber.saveComplexData(complexNumbers,false);
    }

}
