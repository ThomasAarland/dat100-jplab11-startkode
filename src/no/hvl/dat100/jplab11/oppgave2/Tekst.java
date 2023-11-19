package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave.Innlegg;


public class Tekst extends Innlegg {

    private String tekst;

    public Tekst(int id, String bruker, String dato, String tekst) {
        super(id, bruker, dato);
        this.tekst = tekst;
    }

    public Tekst(int id, String bruker, String dato, int likes, String tekst) {
        super(id, bruker, dato, likes);
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    @Override
    public String toString() {
        return "TEKST\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + tekst + "\n";
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {
        StringBuilder html = new StringBuilder();

        html.append("<h2>").append(getBruker()).append("@").append(getDato()).append(" [").append(getLikes()).append("]</h2>\n");
        html.append("<p>").append(getTekst()).append("</p>\n");

        return html.toString();
    }
}

