package it.univpm.Foot.api;

import java.util.Vector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import it.univpm.Foot.model.*;
import it.univpm.Foot.parser.ParserScorers;

/**
 * Classe contenente la chiamata alla rotta scorers (statsScorers)
 * 
 *
 */
public class ChiamataScorers {
	
	/**
	 * Metodo static che effettua la chiamata alla rotta scorers 
	 * e passa il json al metodo parse della classe ParserScorers
	 * 
	 * @param position Gestisce i giocatori in base al ruolo
	 * @param competition Gestisce le competizioni in base al codice della competizione
	 * @param minNumberOfGoals gestisce i giocatori in base al numero minimo dei goal segnati
	 * @return listaScorers Vettore di Scorers ritornato dal metodo parse della classe ParserScorers
	 */
	public static Vector<Scorers> chiamata(String competition, Long minNumberOfGoals, String position) {
			
			Vector<Scorers> listaScorers = new Vector<Scorers>();
			
			try {
				
				URL url=null;
			
				if ("*".equals(competition)) {
					url = new URL("http://api.football-data.org/v2/competitions/scorers");
				} else {
					url = new URL("http://api.football-data.org/v2/competitions/" + competition + "/scorers");
				}
				
				
				HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
				openConnection.setRequestProperty("Content-Type", "application/json");
			    openConnection.setRequestProperty("X-Auth-Token", "771da6c4069d4c9da973228cde593d7b");
						
				BufferedReader input = new BufferedReader(new InputStreamReader(openConnection.getInputStream()));
				
				String json = input.readLine();
				
				ParserScorers eP = new ParserScorers();
				
				listaScorers = eP.parse(json, minNumberOfGoals, position);
				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return listaScorers;
	 }
}
