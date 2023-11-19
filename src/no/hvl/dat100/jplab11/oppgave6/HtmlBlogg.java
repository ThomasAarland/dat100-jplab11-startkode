package no.hvl.dat100.jplab11.oppgave6;

import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class HtmlBlogg extends Blogg {

	public HtmlBlogg() {
		super();
	}
	
	private static String HTMLPREFIX = 
			"<html>\n\t<head>\n\t\t<title>DAT100 Blogg</title>\n\t</head>\n\t<body>\n";
	
	private static String HTMLPOSTFIX = 
			"\t</body>\n</html>";
	
    @Override
    public String toString() {
        StringBuilder html = new StringBuilder();
        Innlegg[] samling = getSamling();
        int antall = getAntall();
        
        if (samling != null) {
            for (int i = 0; i < antall; i++) {
                if (samling[i] != null) {
                    html.append(samling[i].toHTML());
                    html.append("<hr>\n");
                }
            }
        }
        
        return html.toString();
    }
}
