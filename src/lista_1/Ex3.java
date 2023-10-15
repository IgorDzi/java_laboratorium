package lista_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    /**
     * metoda zamieniająca kod HEX na dane kolorów rgb
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String k;
        while(true){
        System.out.print("Podaj kod HEX: ");
            try{
                 k = scanner.nextLine();
                 Long.parseLong(k,16);
                 if(k.length() != 6){throw new InputMismatchException();
                 }
                 break;
            }

            catch (InputMismatchException | NumberFormatException e){
                System.out.println("Nieprawidłowe dane wejściowe!");
            }
        }


        scanner.close();

        String s1 = k.substring(0, 2);
        String s2 = k.substring(2, 4);
        String s3 = k.substring(4, 6);

        int r = Integer.parseInt(s1, 16);
        int g = Integer.parseInt(s2, 16);
        int b = Integer.parseInt(s3, 16);
        System.out.printf("(" + r + "," + b + "," + g + ")");

    }
}
