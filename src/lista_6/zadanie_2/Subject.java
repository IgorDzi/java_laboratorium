package lista_6.zadanie_2;



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

    /**
     * @return String zawierający informacje o przedmiocie
     */
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

    @Override
    public String toString(){
        return subjectName;
    }



}
