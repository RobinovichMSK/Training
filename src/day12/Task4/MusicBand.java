package day12.Task4;

import day12.Task5.MusicArtist;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List<String> member) {
        this.name = name;
        this.year = year;
        this.members = member;
    }

        public void setMembers(List<String> members) {
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }


    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members + '\'' +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for (String members : a.getMembers()){
            b.getMembers().add(members);
        }
        a.members.clear();
    }

    public void printMembers(){
        System.out.println(this.members);
    }
}
