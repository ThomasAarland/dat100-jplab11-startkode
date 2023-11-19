package no.hvl.dat100.jplab11.oppgave4;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
	    try {
	        PrintWriter writer = new PrintWriter(mappe + "/" + filnavn);

	        Innlegg[] innlegg = samling.getSamling();

	        writer.println(innlegg.length);

	        for (Innlegg i : innlegg) {
	            if (i != null) {
	                writer.println(i.toString());
	            }
	        }

	        writer.close();
	        return true;
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
}
