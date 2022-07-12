package day12.Task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> artists;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List<MusicArtist> artists) {
        this.name = name;
        this.year = year;
        this.artists = artists;
    }

    public List<MusicArtist> getArtists() {
        return artists;
    }

    public void setArtists(List<MusicArtist> artists) {
        this.artists = artists;
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
                ", artists=" + artists +
                '}';
    }

    public static void transferArtists(MusicBand a, MusicBand b) {
        for (MusicArtist artists : a.getArtists()) {
            b.getArtists().add(artists);
        }
        a.artists.clear();
    }
    public void printArtists() {
        System.out.println(this.artists);
    }
}
