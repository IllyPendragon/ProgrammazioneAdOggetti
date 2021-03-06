package it.univpm.Foot.stats;

import java.util.Vector;

import it.univpm.Foot.api.ChiamataCompetitions;
import it.univpm.Foot.exceptions.BaseException;
import it.univpm.Foot.filter.StatsFilter;
import it.univpm.Foot.model.Competizioni;
import it.univpm.Foot.model.StatsCompetitions;
/**
 * Classe che consente di determinare le statistiche sulle competizioni
 *
 */
public class StatsOnCompetitions {

	/**
	 * Costruttore di default
	 */
	public StatsOnCompetitions() {
	}
	/**
	 * Metodo che consente di determinare il numero minimo/massimo/medio di squadre,
	 * la durata media delle competizioni e la quantità media di stagioni
	 * 
	 * @param _countryCode Fornisce il codice di nazionalità della competizione
	 * @param _competition Fornisce la competizione
	 * @throws BaseException Eccezione
	 * @return sc Oggetto di StatsCompetition che contine le statistiche sulle competizioni
	 */
	public static StatsCompetitions getResult(String _countryCode, String _competition) throws BaseException {
		StatsCompetitions sc = new StatsCompetitions();
		try {
			Vector<Competizioni> listaCompetizioni = new Vector<Competizioni>();
			listaCompetizioni = ChiamataCompetitions.chiamata(_countryCode, _competition);		
			// numero di competizioni
			sc.setNumCompetions((long) listaCompetizioni.size());
			
			Competizioni co = null;
			
			int[] nArray = new int[listaCompetizioni.size()];
			int[] nArray2 = new int[listaCompetizioni.size()];
			int[] timeInDaysArray = new int[listaCompetizioni.size()];
			
			
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			
			for (int i = 0; i < listaCompetizioni.size(); i++) {
				co = listaCompetizioni.get(i);
				if (co.getTeamsNumber()!=null) {
					count1++;
	                nArray[i] = co.getTeamsNumber().intValue();
				}
				if (co.getNumberOfAvailableSeasons()!=null) {
					count2++;
					nArray2[i] = co.getNumberOfAvailableSeasons().intValue();
				} 
				if (co.getDataIniziale()!=null && co.getDataIniziale()!=null) {
					try {
						count3++;
						timeInDaysArray[i] = StatsFilter.timeInDays(co.getDataIniziale(), co.getDataFinale()).intValue();		 				
					}catch (Throwable e) {
						e.printStackTrace(); 
						BaseException pe =  new BaseException("Errore nel calcolo del tempo in giorni!");
						throw pe;
					}
				}
				
			}
			// Numero minimo di squadre
			sc.setMinNumberTeams(StatsFilter.min(nArray));
			// Numero massimo di squadre
			sc.setMaxNumberTeams(StatsFilter.max(nArray));
			// Numero medio di squadre
			sc.setAverageNumberTeams(StatsFilter.average(nArray, count1));
			// Numero medio di stagioni disponibile
	        sc.setNumberAverageOfAvailableSeasons(StatsFilter.average(nArray2, count2));
	        // Durata media 
	        sc.setAverageDuration(StatsFilter.average(timeInDaysArray, count3));
		} catch (Throwable e) { 
			BaseException pe =  new BaseException(e);
			throw pe;	
		}
				
		return sc;
		
	}

}
