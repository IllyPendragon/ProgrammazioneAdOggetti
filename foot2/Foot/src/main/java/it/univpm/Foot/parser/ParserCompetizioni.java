package it.univpm.Foot.parser;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import it.univpm.Foot.model.*;
import it.univpm.Foot.exceptions.BaseException;
import it.univpm.Foot.filter.CompetitionsFilter;

 /**
 * Classe che analizza il codice json della chiamata alla rotta competition dell'API di Football-data
 * 
 */
 
public class ParserCompetizioni {
	
	/**
	 * Vettore di Competizioni nel quale vengono inserite le competizioni create
	 * a partire dal JSON e poi viene restituito alla classe ChiamataCompetitions
	 */
	private Vector<Competizioni> listaCompetizioni;
	
	/**
	 * Metodo che analizza il json della chiamata competiotions  e restituisce un vettore di competizioni
	 * 
	 * @param chiamata Fornisce il codice json che viene analizzato dal metodo
	 * @param _countryCode Fornisce il codice della nazionale di cui si desidera ottenere le informazioni
	 * @param _competition Fornisce il codice della competizione
	 * @throws BaseException Eccezione
	 * @return listaCompetizioni Vettore di Competizioni contenente le competizioni create, poi restituito
	 */
	public Vector<Competizioni> parse (String chiamata, String _countryCode, String _competition) throws BaseException {
		
	    listaCompetizioni = new Vector<Competizioni>();
	    
	    try {
			
			JSONParser parser = new JSONParser();
			
			JSONObject jO = (JSONObject) parser.parse(chiamata);
			JSONArray competitions = (JSONArray) jO.get("competitions");
			
			JSONObject competizioniTemp = null;
			JSONObject currentSeason = null;
			JSONObject area = null;
			
			String dataIniziale = null;
			String dataFinale = null;
			String vincitore = null;
			String nome = null;
			String codice = null;
			String nationality = null;
			String countryCode = null;
			Long currentMatchday = null;
			Long teamsNumber = null;
			Long numberOfAvailableSeasons = null;
			
			for (int i = 0; i < competitions.size(); i++) {
				
				competizioniTemp = (JSONObject) competitions.get(i);
				nome = (String) competizioniTemp.get("name");
				codice = (String) competizioniTemp.get("code");
				numberOfAvailableSeasons = (Long) competizioniTemp.get("numberOfAvailableSeasons");
				
				area = (JSONObject) competizioniTemp.get("area");
			    nationality = (String) area.get("name");
			    countryCode = (String) area.get("countryCode");
				
			    if (CompetitionsFilter.stringController(_countryCode, countryCode) && CompetitionsFilter.stringController(_competition, codice)) {	
			    	// entra dentro questo if se _countryCode=countryCode e _competition=codice oppure si usano carattero jolly (*)
					if(competizioniTemp.get("currentSeason")!=null) {
						   currentSeason = (JSONObject) competizioniTemp.get("currentSeason");
						   dataIniziale = (String) currentSeason.get("startDate");
						   dataFinale = (String) currentSeason.get("endDate");
						   currentMatchday = (Long) currentSeason.get("currentMatchday");
						   teamsNumber = null; 
						   
						   teamsNumber = CompetitionsFilter.teamsNumberFilter(currentMatchday);
						   
						   JSONObject winTemp = null;
							if (currentSeason.get("winner")!=null) {
							   winTemp = (JSONObject) currentSeason.get("winner");
							   vincitore = (String) winTemp.get("name"); 
							}  
					}
					
					Competizioni c = new Competizioni (nome, codice, dataIniziale, dataFinale, vincitore, nationality, countryCode, currentMatchday, teamsNumber, numberOfAvailableSeasons);
					listaCompetizioni.add(c);			    	
			    }

			}
	     }catch (Throwable e) { 
				BaseException pe =  new BaseException(e);
				throw pe;	
	     }
	     return listaCompetizioni;      
	   }

}
