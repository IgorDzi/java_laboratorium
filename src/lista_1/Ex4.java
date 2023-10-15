package lista_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
    /**
     * metoda tworząca tablice o wymiarach 'n' na 'n' ('n' -podane przez użytkownika) wypełnioną iloczynami
     * kolejnych liczb naturalnych w zakresie od 1 do 9
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą z przedziału [1,9]: ");
        int n = 0;
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Błędne wprowadzenie danych");
        }
        scanner.close();

        if ((n > 9) || (n < 1)) {
            System.out.print("Podano liczbę spoza dopuszczalnego przedziału.");
        } else {
            int[][] tabA = new int[n + 1][n + 1];
            for (int i = 1; i < (tabA.length); i++) {
                for (int j = 1; j < (tabA[i].length); j++) {
                    tabA[i][j] = i * j;
                    System.out.print(tabA[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }
}



