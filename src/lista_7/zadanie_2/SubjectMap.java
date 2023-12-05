package lista_7.zadanie_2;

import java.util.HashMap;
import java.util.Map;

public class SubjectMap {
    private Map<Integer, Subject> subjectMap;

    public SubjectMap() {
        this.subjectMap = new HashMap<>();
    }
    public void saveToJSON(String fileName){

    }

    public void addSubject(int subjectID, Subject subject){
        this.subjectMap.put(subjectID,subject);
    }
    public void addSubject(int subjectID, String subjectName, String departamentName, String lecturerName, int studentCount){
        Subject subject = new Subject(subjectName, departamentName, lecturerName, studentCount);
        this.subjectMap.put(subjectID, subject);
    }
    public Subject getSubject(int subjectID){
        return this.subjectMap.get(subjectID);
    }

    public void printInfo(){
        for (Map.Entry<Integer, Subject> subject : subjectMap.entrySet()){
            System.out.println(subject.getKey() + "\n" + subject.getValue().getInfo());
        }
    }
}
