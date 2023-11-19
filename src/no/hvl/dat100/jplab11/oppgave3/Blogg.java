package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledig;
    
	public Blogg() {
        this.innleggtabell = new Innlegg[20];
        this.nesteledig = 0;
    }

	public Blogg(int lengde) {
        this.innleggtabell = new Innlegg[lengde];
        this.nesteledig = 0;
    }

	public int getAntall() {
        return nesteledig;
	}
	
	public Innlegg[] getSamling() {
        return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

	public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {

        if (finnes(innlegg) || !ledigPlass()) {
            return false;
        }
        innleggtabell[nesteledig] = innlegg;
        nesteledig++;
        return true;
        }
	
	public String toString() {
        String str = nesteledig + "\n";
        for (Innlegg innlegg : innleggtabell) {
            str += innlegg.toString();
        }
        return str;
    }

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
        Innlegg[] temp = new Innlegg[innleggtabell.length * 2];
        System.arraycopy(innleggtabell, 0, temp, 0, innleggtabell.length);
        innleggtabell = temp;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

        if (finnes(innlegg)) {
            return false;
        }
        if (!ledigPlass()) {
            utvid();
        }
        innleggtabell[nesteledig] = innlegg;
        nesteledig++;
        return true;
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
        int pos = finnInnlegg(innlegg);
        if (pos >= 0) {
            nesteledig--;
            innleggtabell[pos] = innleggtabell[nesteledig];
            innleggtabell[nesteledig] = null;
            return true;
        }
        return false;
	}
	
	public int[] search(String keyword) {
		
        int[] result = new int[nesteledig];
        int count = 0;
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].toString().contains(keyword)) {
                result[count] = i;
                count++;
            }
        }
        return result;

	}
}