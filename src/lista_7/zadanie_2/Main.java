package lista_7.zadanie_2;

import org.json.JSONException;

public class Main {
    public static void main(String[] args) throws JSONException {
        SubjectMap subjectMap = new SubjectMap();
        Subject programming = new Subject("Programming", "WPPT", "Jane Foster", 82);
        subjectMap.addSubject(671,"Anatomy", "WPPT","John Doe",78);
        subjectMap.addSubject(862, programming);
        subjectMap.printInfo();
        System.out.println(programming.toJSON());
    }
}
