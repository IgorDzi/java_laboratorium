package lista_7.zadanie_2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Subject programming = new Subject("Programming", "WPPT", "John Doe",
                15,SubjectType.LABORATORY,CreditType.NON_EXAM);
        programming.saveJSON();
        Subject programmingRead = Subject.readJSON("Programming.json");
        System.out.println(programmingRead.getInfo());

    }
}
