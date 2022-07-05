package day9;

public class Student extends Human {
    protected String groupName;
    public Student (String nameHuman, String groupName) {
        super(nameHuman);
        this.groupName = groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public String getGroupName() {
        return groupName;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Etot student s imenem " + nameHuman);
    }
}
