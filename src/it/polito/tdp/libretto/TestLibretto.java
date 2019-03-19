package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
/**
 * richiamerò i metodo di libretto per vedere se funzionano
 * cosi neanche per sbaglio usero dei dati privati
 * e piu pulito separare la classe di test e la classe di lavoro
 * 
 * il debug non mi stampa il voto perche non ha un metodo toString
 * 
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libretto libr=new Libretto();
		libr.add(new Voti(30,"Analsi I",LocalDate.of(2017, 01, 15)));
		libr.add(new Voti(21,"Analisi II",LocalDate.of(2018, 01, 25)));
		libr.add(new Voti(25,"Fisica I",LocalDate.of(2017, 6, 10)));
		libr.add(new Voti(28,"Fisica II",LocalDate.of(2018, 9, 03)));
		libr.add(new Voti(18,"Geometria",LocalDate.of(2017, 01, 15)));
		libr.add(new Voti(20,"Economia",LocalDate.of(2018, 01, 28)));
		libr.add(new Voti(25,"Ricerca Operativa",LocalDate.of(2018, 6, 15)));
		libr.add(new Voti(24,"Complementi di Economia",LocalDate.of(2018, 02, 15)));
		libr.add(new Voti(25,"logistica",LocalDate.of(2019, 2, 1)));
		libr.add(new Voti(27,"Programmazione ad Oggetti",LocalDate.of(2019, 01, 25)));
		
		
		List<Voti> venticinque=libr.cercaVoti(25);
		System.out.println(venticinque);
// abbiamo in tutto sempre 10 voti abbiamo aggiunto ad una lista un oggetto che gia c'era nel creare result 
//		sto usando oggetti che gia avevo sto utilizzando semplicemente i reference agli oggetti 
		
		Voti a1= libr.cercaEsami("Analsi I");
		Voti a2=libr.cercaEsami("Analisi III");
		System.out.println(a1);
		System.out.println(a2);
		Voti giusto=new Voti(18,"Geometria",LocalDate.now());
		Voti sbagliato=new Voti(28,"Geometria",LocalDate.now());
		Voti mancante=new Voti(30,"Merendine",LocalDate.now());
		System.out.format("il voto %s è %s\n", giusto.toString(),libr.esisteGiaVoto(giusto));
		System.out.format("il voto %s è %s\n", sbagliato.toString(),libr.esisteGiaVoto(sbagliato));
		
		
	}

}
