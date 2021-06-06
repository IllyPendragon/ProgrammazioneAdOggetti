package it.univpm.Foot.stats;

import java.util.Vector;

import it.univpm.Foot.api.ChiamataCompetitions;
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
		// TODO Auto-generated constructor stub
	}
	/**
	 * Metodo che consente di determinare il numero minimo/massimo/medio di squadre,
	 * la durata media delle competizioni e la quantità media di stagioni
	 * 
	 * @param _countryCode Fornisce il codice di nazionalità della competizione
	 * @param _competition Fornisce la competizione
	 * 
	 * @return Un oggetto sc (StatsCompetition) che contine le statistiche sulle competizioni
	 */
	public static StatsCompetitions getResult(String _countryCode, String _competition) {
		
		Vector<Competizioni> listaCompetizioni = new Vector<Competizioni>();
		listaCompetizioni = ChiamataCompetitions.chiamata(_countryCode, _competition);
		StatsCompetitions sc = new StatsCompetitions();
		
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
				} catch (Exception e) {
					System.out.println ("Errore nel calcolo del tempo in giorni!");
				}
			}
			
		}
		
		sc.setMinNumberTeams(StatsFilter.min(nArray));
		sc.setMaxNumberTeams(StatsFilter.max(nArray));
		sc.setAverageNumberTeams(StatsFilter.average(nArray, count1));
        sc.setNumberAverageOfAvailableSeasons(StatsFilter.average(nArray2, count2));
        sc.setAverageDuration(StatsFilter.average(timeInDaysArray, count3));
        
//		int low = Integer.MAX_VALUE;
//		int high = Integer.MIN_VALUE;
//		int sum = 0;
//		int num = 0;
//		int num2 = 0;
//		int num3 = 0;
//		long timeInDays = 0;
//		Long numberAverageOfAvailableSeasons = 0L;
//		
//		for (int i = 0; i < listaCompetizioni.size(); i++) {
//			co = listaCompetizioni.get(i);
//			if (co.getTeamsNumber()!=null) {
//				int n = co.getTeamsNumber().intValue();
//			    if(n > high)
//			        high = n;
//			    if(n < low)
//			        low = n;
//	            
//			    num++;
//			    sum += n;	
//			}
//			if (co.getNumberOfAvailableSeasons()!=null) {
//				numberAverageOfAvailableSeasons=numberAverageOfAvailableSeasons+co.getNumberOfAvailableSeasons();
//				num3++;
//			}
//				
//			if (co.getDataIniziale()!=null && co.getDataIniziale()!=null) {
//				try {
//					timeInDays = StatsFilter.timeInDays(co.getDataIniziale(), co.getDataFinale());
//					num2++;
//				} catch (Exception e) {
//					System.out.println ("Errore nel calcolo del tempo in giorni!");
//				}
//			}
//			
//		}
//		
//		sc.setMinNumberTeams(new Integer(low).longValue());
//		sc.setMaxNumberTeams(new Integer(high).longValue());
//        sc.setAverageNumberTeams(new Integer(sum / num).longValue());
//        sc.setAverageDuration(timeInDays / num2);
//        sc.setNumberAverageOfAvailableSeasons(numberAverageOfAvailableSeasons/num3);
		
		return sc;
		
	}

}
