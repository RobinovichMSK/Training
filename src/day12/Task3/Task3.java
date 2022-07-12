package day12.Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Gruppa", 1990));
        bands.add(new MusicBand("Chto-to", 1994));
        bands.add(new MusicBand("Oprst", 1996));
        bands.add(new MusicBand("Kraski",1999));
        bands.add(new MusicBand("Ruki v Verh",2000));
        bands.add(new MusicBand("Shakira",2003));
        bands.add(new MusicBand("Pugacheva",2012));
        bands.add(new MusicBand("Kirkorov",2005));
        bands.add(new MusicBand("VIAGRA",2008));
        bands.add(new MusicBand("123o",2009));
        Collections.shuffle(bands);
        System.out.println(bands);
        groupsAfter2000(bands);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        for (MusicBand i : bands) {
            if (i.getYear() >= 2000) {
                System.out.println(i);
            }
        }
        return new ArrayList<>();
    }
}
