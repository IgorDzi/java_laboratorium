package lista_7.zadanie_1;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ComplexNumber actual = new ComplexNumber("0.99988-0.01579i");
        ComplexNumber expected = new ComplexNumber(-2.4,7.7);
        System.out.println(actual);
        System.out.println(expected);
        Map<Double,ComplexNumber> complexNumbers = new HashMap<>();
        File myFile = new File("/Users/Igor/IdeaProjects/java_laboratorium/src/lista_7/zadanie_1/data.dat");
        FileReader fr = new FileReader(myFile);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        line = br.readLine();
        while (line != null){
            String[] cut = line.split(" ");
            double index = Double.parseDouble(cut[0]);
            ComplexNumber number = new ComplexNumber(cut[1]);
            complexNumbers.put(index,number);
            line = br.readLine();
        }
        br.close();
        complexNumbers.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println(complexNumbers.size());



    }

}
