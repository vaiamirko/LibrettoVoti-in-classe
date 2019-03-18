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
	
	
	
	
}
