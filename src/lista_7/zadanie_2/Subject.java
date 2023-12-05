package lista_7.zadanie_2;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Subject {
    private final String subjectName;
    private final String departamentName;
    private final String lecturerName;
    private final int studentCount;

    public String getSubjectName() {
        return subjectName;
    }

    public String getDepartmentName() {
        return departamentName;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getInfo(){
        StringBuilder info = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        info.append("Subject: ").append(subjectName).append(newLine);
        info.append("Department: ").append(departamentName).append(newLine);
        info.append("Lecturer: ").append(lecturerName).append(newLine);
        info.append("Students: ").append(studentCount);
        return String.valueOf(info);

    }

    @Override
    public String toString(){
        return subjectName;
    }
    public JSONArray toJSON() throws JSONException {
        JSONArray personArr = new JSONArray();
        JSONObject p1 = new JSONObject();
        p1.put("subject", subjectName);
        p1.put("department", departamentName);
        p1.put("lecturer",lecturerName);
        p1.put("students",studentCount);
        personArr.put(p1);
        return personArr;
    }

    public Subject(String subjectName, String departamentName, String lecturerName, int studentCount) {
        this.subjectName = subjectName;
        this.departamentName = departamentName;
        this.lecturerName = lecturerName;
        this.studentCount = studentCount;
    }



}
