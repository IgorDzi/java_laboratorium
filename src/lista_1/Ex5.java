package lista_1;

import java.util.Scanner;

public class Ex5 {
    /**
     * metoda licząca równanie prostej na podstawie współrzędnych dwóch punktów
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędne pierwszego punktu: ");
        double pierwszyPunktX = scanner.nextDouble();
        double pierwszyPunktY = scanner.nextDouble();
        System.out.println("Podaj współrzędne drugiego punktu: ");
        double drugiPunktX = scanner.nextDouble();
        double drugiPunktY = scanner.nextDouble();

        scanner.close();

        try {
            double[] rowananie = wspolczynniki(pierwszyPunktX, drugiPunktX, pierwszyPunktY, drugiPunktY);
            System.out.println("y = " + rowananie[0] + "x + " + rowananie[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * metoda licząca współczynniki 'a' i 'b' równania prostej
     * @param pierwszyPunktX współrzędna x pierwszego punktu
     * @param drugiPunktX współrzędna y pierwszego punktu
     * @param pierwszyPunktY współrzędna x drugiego punktu
     * @param drugiPunktY współrzędna y drugiego punktu
     * @return lista ze współczynnikami prostej
     */
    public static double[] wspolczynniki(double pierwszyPunktX, double drugiPunktX, double pierwszyPunktY, double drugiPunktY) {
        if ((drugiPunktX == pierwszyPunktX) && (drugiPunktY == pierwszyPunktY)){
            throw new IllegalArgumentException("Współrzędne punktów nie mogą być takie same.");
        }
        double a = (drugiPunktY - pierwszyPunktY) / (drugiPunktX - pierwszyPunktX);
        double b = pierwszyPunktY - (a * pierwszyPunktX);
        return new double[]{a, b};
    }
}
