package it.univpm.Foot.parser;

import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import it.univpm.Foot.model.*;
import it.univpm.Foot.filter.BaseFilter;
/**
* Classe che analizza il codice json della chiamata alla rotta scorers dell'API di Football-data
* 
*/
public class ParserScorers {
	/**
	 * Vettore di Scorers nel quale vengono inseriti gli Scorers creati
	 * a partire dal JSON e poi viene restituito alla classe ChiamataScorers
	 */
	private Vector<Scorers> listaScorers;
	/**
	 * Metodo che analizza il json della chiamata scorers  e restituisce un vettore di marcatori
	 * 
	 * @param chiamata Fornisce il codice json che viene analizzato dal metodo
	 * @param _minNumberOfGoals Fornisce il numero minimo di Goal del marcatore
	 * @param _position Fornisce i ruolo del giocatore
	 * @return listaScorers Vettore di Scorers contenente gli scorers creati, poi restituito
	 */
	public Vector<Scorers> parse (String chiamata, Long _minNumberOfGoals, String _position){
		
		
	    listaScorers = new Vector<Scorers>();
	    
	    try {
	    	 String name = null;;
	    	 String position= null;
	    	 Long numberOfGoals= null;
	         String teamName= null;
			JSONParser parser = new JSONParser();
			
			JSONObject jO = (JSONObject) parser.parse(chiamata);
			
			JSONArray scorers = (JSONArray) jO.get("scorers");
			for (int i = 0; i < scorers.size(); i++) {
		
				JSONObject scorer = (JSONObject) scorers.get(i);
				JSONObject player = (JSONObject) scorer.get("player");
				JSONObject team = (JSONObject) scorer.get("team");
				if (scorer.get("numberOfGoals") != null) {
				    numberOfGoals = (Long) scorer.get("numberOfGoals");
				}	
				if (player!=null) {
					   name = (String) player.get("name");
					   position = (String) player.get("position");			   
					    
				}				
				//if ((_minNumberOfGoals==-1 || (numberOfGoals!=null && _minNumberOfGoals.longValue()<=numberOfGoals.longValue())) && (_position.equals("*") || (position!=null && _position.equals(position)))) {
				if (BaseFilter.minLongController(_minNumberOfGoals, numberOfGoals) && BaseFilter.stringController(_position, position)) {
                    // -1 è il valore jolly per _minNumberOfGoals
                    // * è il carattere jolly per _position
					if(team!=null) {
						   teamName = (String) team.get("name");					    
					}
					
					Scorers c = new Scorers (name, position, numberOfGoals, teamName);
					listaScorers.add(c);					
				}
				
			}
	      }catch (ParseException e) {
				e.printStackTrace();
		  }
	       return listaScorers;      
	   }

}
