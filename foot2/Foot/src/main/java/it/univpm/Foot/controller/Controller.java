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

/**
 * Classe che contiene le rotte get /competitions, /scorers
 * che restituiscono Vettori di competizioni e scorers
 * e le rotte get /statsCompetitions e /statsScorers che restituiscono
 * statistiche sulle competizioni e scorers 
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
	 * 
	 */
	
	@GetMapping("/competitions")
	public Vector<Competizioni> competitions (@RequestParam String countryCode, String competition) {
		System.out.println("inizio JsonRest");
		return ChiamataCompetitions.chiamata(countryCode, competition); 		
	 }
	
	
	/**
	 * 
	 * Metodo associato alla rotta get /scorers, che è in grado di ritornare un
	 * Vettore di scorers in base ai parametri passati dall'utente
	 * 
	 * @param position Gestisce i giocatori in base al ruolo
	 * @param competition Gestisce le competizioni in base al codice della competizione
	 * @param minNumberOfGoals gestisce i giocatori in base al numero minimo dei goal segnati
	 * @return Vettore di Scorers
	 * 
	 */
	
	@GetMapping("/scorers")
	public Vector<Scorers> scorers (@RequestParam String competition, Long minNumberOfGoals, String position) {
		System.out.println("inizio JsonRest");
		return ChiamataScorers.chiamata(competition, minNumberOfGoals, position); 
		
	 }
	

	/**
	 * 
	 * Metodo associato alla rotta get /statsCompetitions, che è in grado di ritornare un
	 * oggetto statsCompetitions che fornisce un statistica in base ai parametri passati dall'utente
	 * 
	 * @param countryCode Gestisce le competizioni in base alla nazionalità
	 * @param competition Gestisce le competizioni in base al codice della competizione
	 * @return Oggetto di Competizioni
	 * 
	 */
	
	@GetMapping("/statsCompetitions")
	public StatsCompetitions statsCompetitions(@RequestParam String countryCode, String competition) {
		System.out.println("inizio JsonRest");
		return StatsOnCompetitions.getResult(countryCode, competition); 
		
	 }
	
	/**
	 * 
	 * Metodo associato alla rotta get /statsScorers, che è in grado di ritornare un
	 * ogetto StatsScorers di scorers che fornisce una statistica in base ai parametri passati dall'utente
	 * 
	 * @param competition Gestisce le competizioni in base al codice della competizione
	 * @return Oggetto di Scorers
	 * 
	 */
	
	@GetMapping("/statsScorers")
	public StatsScorers statsScorers(@RequestParam String competition) {
		System.out.println("inizio JsonRest");
		return StatsOnScorers.getResult(competition); 
		
	 }	
}