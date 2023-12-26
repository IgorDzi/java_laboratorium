package lista_7.zadanie_2;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JSONException, IOException {
        SubjectMap subjectMap = new SubjectMap();
        Subject programming = new Subject("Programming", "WPPT", "Jane Foster", 82);
        subjectMap.addSubject(671,"Anatomy", "WPPT","John Doe",78);
        subjectMap.addSubject(862, programming);
        subjectMap.printInfo();
        JSONArray programmingJSON = programming.toJSON();
        Subject.saveJSON(programmingJSON,"src/lista_7/zadanie_2/data_out.json");


    }
}
