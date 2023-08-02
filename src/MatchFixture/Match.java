package MatchFixture;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Match {
    public static void main(String[] args) {
        List<String> home=new ArrayList<>();
        List<String> guest=new ArrayList<>();
        home.add("Galatasaray");
        home.add("Fenerbahçe");
        guest.add("Bursaspor");       //GİVE THE VALUES OF ARRAYS
        guest.add("Gaziantepspor");
        guest.add("Beşiktaş");
        Fixture match=new Fixture(home,guest);
        match.Round();

    }
}
