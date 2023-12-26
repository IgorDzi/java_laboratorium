package lista_7.zadanie_1;

import java.io.*;
import java.util.*;

public class ComplexNumber extends Vector2D {

    /**
     * @param x - część rzeczywista liczby zespolonej
     * @param y - część urojona liczby zespolonej
     */
    public ComplexNumber(double x, double y) {
        super(x, y);
    }
    public ComplexNumber(String number){
        super(parseNumber(number)[0], parseNumber(number)[1]);

    }
    private ComplexNumber(Vector2D vector) {
        super(vector.getX(), vector.getY());
    }
    public static Map<Double,ComplexNumber> readComplexData(String fileName) throws IOException {
        Map<Double,ComplexNumber> complexNumbers = new TreeMap<>();
        File myFile = new File(fileName);
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


        return complexNumbers;
    }
    public static void saveComplexData(Map<Double,ComplexNumber> complexNumberMap, String fileName, boolean overwrite) throws IOException {
        File myFile = new File(fileName);
        BufferedWriter bf;
        if (overwrite){
            FileWriter fileWriter = new FileWriter(myFile);
            bf = new BufferedWriter(fileWriter);
            bf.write("# t mod arg");
            bf.newLine();
        }
        else {
            FileWriter fileWriter = new FileWriter(myFile, true);
            bf = new BufferedWriter(fileWriter);
        }

        complexNumberMap.forEach((key, value) -> {
            try {
                String line = key + " " + value.module() + " " + value.argument();
                bf.write(line);
                bf.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bf.close();
    }
    public static void saveComplexData(Map<Double,ComplexNumber> complexNumberMap, boolean overwrite) throws IOException {
        saveComplexData(complexNumberMap, "out_data.dat", overwrite);
    }

    /**
     * @param number liczba urojona jako tekst
     * @return Odpowiednią wartość Input w zależności od postaci liczby urojonej
     */
    private static Input checkInput(String number){
        String s = number.replaceAll("\\s+", "");
        int plusCount = (int) s.chars().filter(ch -> ch == '+').count();
        int iCount = (int) s.chars().filter(ch -> ch == 'i').count();
        int minusCount = (int) s.chars().filter(ch -> ch == '-').count();
        if (!s.matches("[0-9.+i\\-]+") || plusCount>1 || iCount>1 || minusCount>2){
            return Input.INCORRECT;
        }
        if (plusCount == 1){
            return Input.IMAGINERYPOSTIVE;
        }
        else {
            return Input.IMAGINERYNEGATIVE;
        }


    }

    /**
     * @param number liczba urojona w postaci tekstu
     * @return zmieniona liczba urojona na parametry do utworzenia obiektu
     */
    private static double[] parseNumber(String number){
        String s = number.replaceAll("\\s+", "");
        switch (checkInput(s)){

            case IMAGINERYNEGATIVE -> {
                String[] half = s.split("[-]+");
                if (half.length == 3){
                    half[0]= half[1];
                    half[1] = half[2];
                }
                return new double[]{Double.parseDouble(half[0]),
                        -1*Double.parseDouble(half[1].substring(0,half[1].length()-1))};

            }
            case IMAGINERYPOSTIVE -> {
                String[] half = s.split("[+]+");
                return new double[]{Double.parseDouble(half[0]),
                        Double.parseDouble(half[1].substring(0,half[1].length()-1))};
            }
            default -> throw new WrongInputException();
        }
    }

    /**
     * @return argument liczby zespolonej
     */
    public double argument() {
        return Math.atan(y / x);
    }

    /**
     * @return postać wykładnicza liczby zespolonej
     */
    public String exponential() {
        int roundInt = (int) (argument()*1000);
        double roundArgument = (double) roundInt /1000;
        return (module() + "e^(i" +  roundArgument + ")");
    }

    /**
     * @param power n-ta potęga liczby zespolonej
     * @return liczba zespolona podniesiona do n-tej potęgi
     */
    public ComplexNumber pow(double power){
        double real = Math.pow(module(), power) * (Math.cos(power * argument()));
        double imaginary = Math.pow(module(), power) * (Math.sin(power * argument()));
        return new ComplexNumber(real, imaginary);
    }
    public static ComplexNumber pow(ComplexNumber number, double power){
        double real = Math.pow(number.module(), power) * Math.cos(power * number.argument());
        double imaginary = Math.pow(number.module(), power) * Math.sin(power * number.argument());
        return new ComplexNumber(real, imaginary);
    }



    @Override
    public Vector2D add(Vector2D addend) {
        return new ComplexNumber(super.add(addend));
    }

    @Override
    public Vector2D subtract(Vector2D minuend){
        return new ComplexNumber(super.add(minuend));
    }

    @Override
    public Vector2D multiplication(double value) {
        return new ComplexNumber(super.multiplication(value));
    }

    @Override
    public String toString() {
        return "z = " + x + " + " + (y + "i");
    }


}