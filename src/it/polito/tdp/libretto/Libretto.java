package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voti> voti;

	public Libretto() {
		super();
		this.voti =new ArrayList<Voti>();}
		
	
	
	
	public void add(int voto,String corso,LocalDate data) {
		
		
	}
	/**
	 * aggiunge un nuovo voto al libretto
	 * 
	 * @param v il{@link Voto} da aggiungere
	 */

	public void add(Voti v) {
		voti.add(v);
		
		
	}
//	stampa i voti
	public void StampaVoti(int voto) {
		
	}
//	ritorna una string con un elenco di voti e poi dovro stamparla
	public String StampaVoti2 (int voto) {
		return null;
		
	}
	/**
	 * seleziona un sottoinsiem di voti che hanno il punteggio specificato
	 * @param voto
	 * @return
	 */
//	ritorna la lista con i voti e poi dovro stamparla pero è piu versatile separiamo la ricerca dalla formattazione del risultato
	public List<Voti> cercaVoti(int voto){
		List<Voti> result=new ArrayList<Voti>();
		for(Voti v: this.voti) {
			if(v.getPunti()==voto) {
				result.add(v);
			}
		}
		
		return result;
		
	}
	/**
	 * ricerca un  {@link} Voti} relativo al corso di cui e specjfjcato il nome
	 * 
	 * @param nomeEsame
	 * @return {@link voto}
	 */
	public Voti cercaEsami(String nomeEsame) {
		for(Voti v:this.voti) {
			// usassi == confronterei la posizione nella memoria degli oggetti e non il contenuto si può usare solo con gli int
			// compare to confronta lettera per lettera per vederese uno e < o > ma non si usa per tuti gli oggetti usarlo al posto di equals
			// per pigrizia e un errore
			if(v.getCorso().equals(nomeEsame)) {
				return v;
			}
		}
		return null;}
		
	/**
	 * dato un {@link Voti} determina se esite già un voto con uguale corso e uguale punteggio
	 * @param v
	 * @return {@code true} se ha trovato un corso e punteggio uguali , {@code false} se non ha trovato ilcorso o o ha trovato con voto diverso
	 */
	public boolean esisteGiaVoto(Voti v) {
		Voti trovato =this.cercaEsami(v.getCorso());
		if(trovato==null)
			return false;
		if(trovato.getPunti()==v.getPunti()) {
			return true;}
		else {
			return false;}
		
		}
		
		
		
	
		
		
	
	
}
