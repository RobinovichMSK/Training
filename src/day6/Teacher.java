package day6;

import java.util.Random;

public class Teacher {
    private String teacherName;
    private final String teacherLesson;

    public Teacher(String teacherName, String teacherLesson) {
        this.teacherName = teacherName;
        this.teacherLesson = teacherLesson;
    }

    public void setTeacherName(String teacherName) {
        teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherLesson(String teacherLesson) {
        teacherLesson = teacherLesson;
    }

    public String getTeacherLesson() {
        return teacherLesson;
    }

    public String evaluate(Student student1){
        String mark = "";
        Random rdm = new Random();
        int random = rdm.nextInt(4)+2;
        switch (random) {
            case 2 -> mark = "ploxo";
            case 3 -> mark = "udovletvoritelno";
            case 4 -> mark = "horosho";
            case 5 -> mark = "otlichno";
        }
        System.out.printf("Prepod %s ocenil studenta s imenem %s po predmetu %s na ocenku %s.\n", teacherName, student1.getStudentName(), teacherLesson, mark);
        return mark;
    }
}