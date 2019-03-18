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
//	ritorna la lista con i voti e poi dovro stamparla pero è piu versatile separiamo la ricerca dalla formattazione del risultato
	public List<Voti> cercaVoti(int voto){
		List<Voti> result=new ArrayList<Voti>();
		for(Voti v: this.voti)
			if(v.getPunti()==voto) {
				result.add(v);
			}
				
		return result;
		
	}
}
