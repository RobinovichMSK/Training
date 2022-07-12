package day12.Task5;

import day12.Task5.MusicBand;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicBand> bands = new ArrayList<>();

        List<MusicArtist> artists = new ArrayList<>();
        artists.add(new MusicArtist("ALLLLALALA",0));
        artists.add(new MusicArtist("Gordon",44));

        List<MusicArtist> artists2 = new ArrayList<>();
        artists2.add (new MusicArtist("Ushi nogi", 4));

        List<MusicArtist> artists3 = new ArrayList<>();
        artists3.add(new MusicArtist("Gogol mogal ",999));

        List<MusicArtist> artists4 = new ArrayList<>();
        artists4.add(new MusicArtist("Stas",58));

        List<MusicArtist> artists5 = new ArrayList<>();
        artists5.add(new MusicArtist("Olga Orlova",254));

        List<MusicArtist> artists6 = new ArrayList<>();
        artists6.add(new MusicArtist("Tip ", 77));

        List<MusicArtist> artists7 = new ArrayList<>();
        artists7.add(new MusicArtist("Besstijiy",1));

        List<MusicArtist> artists8 = new ArrayList<>();
        artists8.add(new MusicArtist("Sherlakc ",88));

        List<MusicArtist> artists9 = new ArrayList<>();
        artists9.add(new MusicArtist("Nikson ",77));

        List<MusicArtist> artists10 = new ArrayList<>();
        artists10.add(new MusicArtist("Prosto CHEL ",321));

        bands.add(new MusicBand("Gruppa", 1990,artists));
        bands.add(new MusicBand("Chto-to", 1994, artists2));
        bands.add(new MusicBand("Oprst", 1996, artists3));
        bands.add(new MusicBand("Kraski", 1999, artists4));
        bands.add(new MusicBand("Ruki v Verh", 2000, artists5));
        bands.add(new MusicBand("Shakira", 2003, artists6));
        bands.add(new MusicBand("Pugacheva", 2012, artists7));
        bands.add(new MusicBand("Kirkorov", 2005, artists8));
        bands.add(new MusicBand("VIAGRA", 2008, artists9));
        bands.add(new MusicBand("123o", 2009, artists10));

        for (MusicBand a : bands) {
            System.out.println(a);
        }

        System.out.println();

        MusicBand.transferArtists(bands.get(0), bands.get(9));
        for (MusicBand band : bands)
            band.printArtists();
    }
}
