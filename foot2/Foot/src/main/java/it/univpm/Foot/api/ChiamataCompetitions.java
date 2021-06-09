package it.univpm.Foot.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

import it.univpm.Foot.exceptions.BaseException;
import it.univpm.Foot.model.*;
import it.univpm.Foot.parser.ParserCompetizioni;

/**
 * Classe contenente la chiamata alla rotta competitions (statsCompetitions)
 * 
 *
 */
public class ChiamataCompetitions {
	
	/**
	 * Metodo static che effettua la chiamata alla rotta competitions 
	 * e passa il json al metodo parse della classe ParserCompetizioni
	 * 
	 * @param countryCode Gestisce le competizioni in base alla nazionalità
	 * @param competition Gestisce le competizioni in base al codice della competizione
	 * @return listaCompetizioni Vettore di Competizioni ritornato dal metodo parse della classe ParserCompetizioni
	 */
public static Vector<Competizioni> chiamata(String countryCode, String competition) throws BaseException {
		
		Vector<Competizioni> listaCompetizioni = new Vector<Competizioni>();
		
		try {
			
			URL url = new URL("https://api.football-data.org/v2/competitions");
			System.out.println("url=" + url.getPath());
			HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
			openConnection.setRequestProperty("Content-Type", "application/json");
		    openConnection.setRequestProperty("X-Auth-Token", "771da6c4069d4c9da973228cde593d7b");
					
			BufferedReader input = new BufferedReader(new InputStreamReader(openConnection.getInputStream()));
			
			String json = input.readLine();
			
			ParserCompetizioni eP = new ParserCompetizioni();
			
			listaCompetizioni = eP.parse(json, countryCode, competition);
		} catch (Throwable e) {
			e.printStackTrace(); 
			BaseException pe =  new BaseException(e);
			throw pe;
		}
		
		return listaCompetizioni;
 }

}
