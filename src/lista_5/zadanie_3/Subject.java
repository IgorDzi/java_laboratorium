package lista_5.zadanie_3;



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

    public Subject(String subjectName, String departamentName, String lecturerName, int studentCount) {
        this.subjectName = subjectName;
        this.departamentName = departamentName;
        this.lecturerName = lecturerName;
        this.studentCount = studentCount;
    }



}
