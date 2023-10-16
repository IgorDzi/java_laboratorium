package lista_1;

import java.util.Scanner;

public class Ex6 {
    /**
     * metoda tworząca datę z wprowadzonych danych
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dzień, miesiąc oraz rok: ");
        int dzien = scanner.nextInt();
        int miesiac = scanner.nextInt();
        int rok = scanner.nextInt();

        try {
            String data2 = data(dzien, miesiac, rok);
            System.out.println(data2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * metoda sprawdzająca czy rok jest rokiem przestępnym
     * @param year rok
     * @return true: jeżeli jest; false: jeżeli nie jest
     */
    public static boolean is_leap_year(int year) {
        boolean isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);
        return isLeapYear;
    }

    /**
     * Metoda tworząca datę sprawdzając poprawność wprowadzenia danych
     * @param dzien dzień
     * @param miesiac miesiąc
     * @param rok rok
     * @return utworzona data
     */
    public static String data(int dzien, int miesiac, int rok) {
        int dopuszczalnyDzien = 31;

        if (miesiac < 1 || miesiac > 12) {
            throw new IllegalArgumentException("Podano nieprawidlowy miesiac");
        }

        if (miesiac == 4 || miesiac == 6 || miesiac == 9 || miesiac == 11) {
            dopuszczalnyDzien = 30;
        }

        if (miesiac == 2) {
            if (is_leap_year(rok)){
                dopuszczalnyDzien = 29;
            }
            else {
                dopuszczalnyDzien = 28;
            }

        }

        if ((dzien < 1) || (dzien > dopuszczalnyDzien)) {
            throw new IllegalArgumentException("Podano nieprawidłowy dzień.");
        }

        String nowyDzien = String.format("%02d", dzien);
        String nowyMiesiac = String.format("%02d", miesiac);
        return nowyDzien + "-" + nowyMiesiac + "-" + rok;
    }
}
