package no.hvl.dat100.jplab11.oppgave5;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import no.hvl.dat100.jplab11.oppgave3.Blogg;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave2.Tekst;
import no.hvl.dat100.jplab11.oppgave2.Bilde;

public class LesBlogg {

    public static Blogg les(String mappe, String filnavn) {
        Blogg blogg = null;

        try {
            File file = new File(mappe + "/" + filnavn);
            Scanner scanner = new Scanner(file);

            int antallInnlegg = Integer.parseInt(scanner.nextLine());
            blogg = new Blogg(antallInnlegg);

            for (int i = 0; i < antallInnlegg; i++) {
                String type = scanner.nextLine();

                if (type.equals("TEKST")) {
                    int id = Integer.parseInt(scanner.nextLine());
                    String bruker = scanner.nextLine();
                    String dato = scanner.nextLine();
                    int likes = Integer.parseInt(scanner.nextLine());
                    String tekst = scanner.nextLine();

                    Innlegg innlegg = new Tekst(id, bruker, dato, likes, tekst);
                    blogg.leggTil(innlegg);
                } else if (type.equals("BILDE")) {
                    int id = Integer.parseInt(scanner.nextLine());
                    String bruker = scanner.nextLine();
                    String dato = scanner.nextLine();
                    int likes = Integer.parseInt(scanner.nextLine());
                    String tekst = scanner.nextLine();
                    String url = scanner.nextLine();

                    Innlegg innlegg = new Bilde(id, bruker, dato, likes, tekst, url);
                    blogg.leggTil(innlegg);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return blogg;
    }
}
