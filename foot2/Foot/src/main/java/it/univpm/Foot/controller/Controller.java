package it.univpm.Foot.controller;


import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.Foot.model.Competizioni;
import it.univpm.Foot.model.Scorers;
import it.univpm.Foot.model.StatsCompetitions;
import it.univpm.Foot.model.StatsScorers;
import it.univpm.Foot.stats.StatsOnCompetitions;
import it.univpm.Foot.stats.StatsOnScorers;
import it.univpm.Foot.api.*;
import it.univpm.Foot.exceptions.BaseException;


/**
 * Classe che contiene le rotte di tipo GET /competitions, /scorers
 * che restituiscono Vettori di competizioni e di marcatori
 * e le rotte di tipo GET /statsCompetitions e /statsScorers che restituiscono
 * statistiche sulle competizioni e sui marcatori 
 * 
 */

@RestController
public class Controller { 
	
	
	/**
	 * 
	 * Metodo associato alla rotta get /competitions, che è in grado di ritornare un
	 * Vettore di competizioni in base ai parametri passati dall'utente
	 * 
	 * @param countryCode Gestisce le competizioni in base alla nazionalità
	 * @param competition Gestisce le competizioni in base al codice della competizione
	 * @return Vettore di Competizioni 
	 * @throws BaseException Se si lascia un parametro vuoto viene lanciata l'eccezione BaseException che visualizzerà il seguente
	 *                        messaggio: "Parametro vuoto!! Inserire almeno il carattere Jolly *"
	 *                       
	 */
	@GetMapping("/competitions")
	public  Vector<Competizioni> competitions (@RequestParam String countryCode, String competition) throws BaseException {		
			if(competition.isEmpty() || countryCode.isEmpty()) throw new BaseException("Parametro vuoto!! Inserire almeno il carattere Jolly *");
		    return ChiamataCompetitions.chiamata(countryCode, competition); 		
		}
	
	/**
	 * 
	 * Metodo associato alla rotta get /scorers, che è in grado di ritornare un
	 * Vettore di marcatori in base ai parametri passati dall'utente
	 * 
	 * @param position Gestisce i marcatori in base al ruolo
	 * @param competition Gestisce le competizioni in base al codice della competizione
	 * @param minNumberOfGoals Gestisce i marcatori in base al numero minimo dei goal segnati
	 * @return Vettore di Scorers
	 * @throws BaseException Se si lascia vuoto il parametro competition o position viene lanciata l'eccezione BaseException che visualizzerà il seguente
	 *                        messaggio: "I parametri competition o position sono vuoti!! Inserire almeno il carattere Jolly *"
	 */
	
	@GetMapping("/scorers")
	public Vector<Scorers> scorers (@RequestParam String competition, Long minNumberOfGoals, String position)throws BaseException {
		if(competition.isEmpty() || position.isEmpty()) throw new BaseException("I parametri competition o position sono vuoti!! Inserire almeno il carattere Jolly *");
		return ChiamataScorers.chiamata(competition, minNumberOfGoals, position); 
	 }
	

	/**
	 * 
	 * Metodo associato alla rotta get /statsCompetitions, che è in grado di ritornare un
	 * oggetto statsCompetitions che fornisce un statistica sulle competizioni in base ai parametri passati dall'utente
	 * 
	 * @param countryCode Gestisce le competizioni in base alla nazionalità
	 * @param competition Gestisce le competizioni in base al codice della competizione
	 * @return Oggetto di Competizioni
	 * @throws BaseException Se si lascia un parametro vuoto viene lanciata l'eccezione BaseException che visualizzerà il seguente
	 *                        messaggio: "Parametro vuoto!! Inserire almeno il carattere Jolly *"
	 */
	
	@GetMapping("/statsCompetitions")
	public StatsCompetitions statsCompetitions(@RequestParam String countryCode, String competition)  throws BaseException {
		if(competition.isEmpty() || countryCode.isEmpty()) throw new BaseException("Parametro vuoto!! Inserire almeno il carattere Jolly *");
		return StatsOnCompetitions.getResult(countryCode, competition); 
		
	 }
	
	/**
	 * 
	 * Metodo associato alla rotta get /statsScorers, che è in grado di ritornare un
	 * oggetto StatsScorers che fornisce una statistica sui marcatori in base ai parametri passati dall'utente
	 * 
	 * @param competition Gestisce le competizioni in base al codice della competizione
	 * @return Oggetto di Scorers
	 * @throws BaseException Se si lascia il parametro vuoto viene lanciata l'eccezione BaseException che visualizzerà il seguente
	 *                        messaggio: "Parametro vuoto! Puoi inserire solo: BL1,PL,SA,PD,FL1,DED,PPL,CL,WC"
	 */
	
	@GetMapping("/statsScorers")
	public StatsScorers statsScorers(@RequestParam String competition) throws BaseException {
		if (competition.equals("BL1") || competition.equals("SA") ||competition.equals("PD") ||
				    competition.equals("FL1") ||competition.equals("PPL") ||competition.equals("WC"))
			return StatsOnScorers.getResult(competition); 
		else throw new BaseException("Parametro vuoto o errato! Puoi inserire solo: BL1,SA,PD,FL1,PPL,WC");
				
	 }	
}
