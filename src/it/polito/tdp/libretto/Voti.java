package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voti {
	private int punti;
	private String corso;
	private LocalDate data;
	public Voti(int voto, String corso, LocalDate data) {
		super();
		this.punti = voto;
		this.corso = corso;
		this.data = data;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int voto) {
		this.punti = voto;
	}
	public String getCorso() {
		return corso;
	}
	public void setCorso(String corso) {
		this.corso = corso;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
//	scelto il metodo formst dalla classe tendina per vderlo in questo formato
	public String toString() {
		return String.format("Voti [punti=%s, corso=%s, data=%s]", punti, corso, data);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corso == null) ? 0 : corso.hashCode());
		return result;
	}
	// aggiungo il metodo equals per confrontare il nome del coros per dare una regola di distinzione di due oggetti
	// resuorce -- hash code e equals e dico cosa voglio
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voti other = (Voti) obj;
		if (corso == null) {
			if (other.corso != null)
				return false;
		} else if (!corso.equals(other.corso))
			return false;
		return true;
	}
	
	
	

}
