package lista_7.zadanie_2;


import com.google.gson.Gson;

import java.io.*;

public class Subject {
    private final String subjectName;
    private final String departamentName;
    private final String lecturerName;
    private final int studentCount;

    private final SubjectType subjectType;
    private final CreditType creditType;



    public Subject(String subjectName, String departamentName, String lecturerName, int studentCount, SubjectType subjectType, CreditType creditType) {
        this.subjectName = subjectName;
        this.departamentName = departamentName;
        this.lecturerName = lecturerName;
        this.studentCount = studentCount;
        this.subjectType = subjectType;
        this.creditType = creditType;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public CreditType getCreditType() {
        return creditType;
    }

    public String getInfo(){
        StringBuilder info = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        info.append("Subject: ").append(subjectName).append(newLine);
        info.append("Department: ").append(departamentName).append(newLine);
        info.append("Lecturer: ").append(lecturerName).append(newLine);
        info.append("Type: ").append(subjectType).append(newLine);
        info.append("Credit: ").append(creditType).append(newLine);
        info.append("Students: ").append(studentCount);
        return String.valueOf(info);

    }
    public void saveJSON(String fileName) throws IOException {
        File myFile = new File(fileName);
        FileWriter fileWriter = new FileWriter(myFile);
        Gson gson = new Gson();
        gson.toJson(this,fileWriter);
        fileWriter.close();
    }
    public void saveJSON() throws IOException {
        String fileName = getSubjectName() + ".json";
        File myFile = new File(fileName);
        FileWriter fileWriter = new FileWriter(myFile);
        Gson gson = new Gson();
        gson.toJson(this,fileWriter);
        fileWriter.close();
    }

    public static Subject readJSON(String fileName) throws IOException {
        File myFile = new File(fileName);
        FileReader fileReader = new FileReader(fileName);
        Gson gson = new Gson();
        return gson.fromJson(fileReader, Subject.class);
    }

    @Override
    public String toString(){
        return subjectName;
    }



}
