package lista_1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ex1 {

    /**
     * Metoda przyjmująca od użytkownika prędkości początkową oraz kąt uderzenia i na
     * ich podstawie wyliczą zasięg, oraz maksymalną wysokości rzutu ukośnego
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v0;
        while (true) {
            System.out.print("Podaj prędkość: ");
            try {
                v0 = scanner.nextDouble();
                if (v0 < 0) {throw new InputMismatchException();}
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Nieprawidłowe dane wejściowe!");
                scanner.nextLine();

            }

        }

        double angle;
        while (true) {
            System.out.print("Podaj kąt uderzenia: ");
            try {
                angle = scanner.nextDouble();
                if (angle < 0 || angle > 90) {throw new InputMismatchException();}
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Nieprawidłowe dane wejściowe!");
                scanner.nextLine();

            }

        }


        double angle_radian = Math.toRadians(angle);
        scanner.close();

            double distance = (Math.pow(v0, 2) * Math.sin(2 * angle_radian)) / 9.81;
            double maxHeight = (Math.pow(v0, 2) * Math.sin(angle_radian) * Math.sin(angle_radian) / (2 * 9.81));

            System.out.println("Zasięg: " + distance + " m");
            System.out.println("Maksymalna wysokość: " + maxHeight + " m");
    }
}
