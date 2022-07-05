package day9;

public class Teacher extends Human {
    private String subjectName;
    public Teacher (String nameHuman, String subjectName) {
        super(nameHuman);
        this.subjectName = subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Etot prepodavatel s imenem " + nameHuman);
    }
}
