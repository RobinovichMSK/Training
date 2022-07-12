package day12.Task4;

import java.util.ArrayList;
import java.util.List;


public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();

        List<String> members = new ArrayList<>();
        members.add("ALLLLALALA");
        members.add("Gordon");

        List<String> members2 = new ArrayList<>();
        members2.add("Ushi nogi");

        List<String> members3 = new ArrayList<>();
        members3.add("Gogol mogal ");

        List<String> members4 = new ArrayList<>();
        members4.add("Stas");


        List<String> members5 = new ArrayList<>();
        members5.add("Ivan Konkov");
        members5.add("Svetlana Svttikova");
        members5.add("Olga Orlova");

        List<String> members6 = new ArrayList<>();
        members6.add("Tip ");

        List<String> members7 = new ArrayList<>();
        members7.add("Bob Dilan");
        members7.add("Besstijiy");

        List<String> members8 = new ArrayList<>();
        members8.add("Sherlakc ");
        members8.add("Watson ");

        List<String> members9 = new ArrayList<>();
        members9.add("Nikson ");

        List<String> members10 = new ArrayList<>();
        members10.add("Prosto CHEL ");

        bands.add(new MusicBand("Gruppa", 1990, members));
        bands.add(new MusicBand("Chto-to", 1994, members2));
        bands.add(new MusicBand("Oprst", 1996, members3));
        bands.add(new MusicBand("Kraski", 1999, members4));
        bands.add(new MusicBand("Ruki v Verh", 2000, members5));
        bands.add(new MusicBand("Shakira", 2003, members6));
        bands.add(new MusicBand("Pugacheva", 2012, members7));
        bands.add(new MusicBand("Kirkorov", 2005, members8));
        bands.add(new MusicBand("VIAGRA", 2008, members9));
        bands.add(new MusicBand("123o", 2009, members10));

        for (MusicBand a : bands) {
            System.out.println(a);
        }

        System.out.println();

        MusicBand.transferMembers(bands.get(0), bands.get(9));

        for (MusicBand band : bands)
            band.printMembers();
    }
}
