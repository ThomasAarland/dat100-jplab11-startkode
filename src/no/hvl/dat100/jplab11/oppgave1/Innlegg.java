package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;


public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;

	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes=0;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes= likes;
	}
	
	public String getBruker() {
		
		return bruker;
	}

	public void setBruker(String bruker) {
this.bruker = bruker;
}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes++;
}
	
	public boolean erLik(Innlegg innlegg) {

		return this.getId()==innlegg.getId();
		
	}
	
	@Override
	public String toString() {
		
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
	    StringBuilder html = new StringBuilder();
	    html.append("<p>ID: ").append(id).append("</p>\n");
	    html.append("<p>Bruker: ").append(bruker).append("</p>\n");
	    html.append("<p>Dato: ").append(dato).append("</p>\n");
	    html.append("<p>Likes: ").append(likes).append("</p>\n");
	    html.append("<hr>\n");
	    return html.toString();
	}
}
