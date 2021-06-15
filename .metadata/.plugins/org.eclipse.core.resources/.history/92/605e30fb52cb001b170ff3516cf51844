package it.univpm.Foot.stats;

import java.util.Arrays;
import java.util.Vector;
import it.univpm.Foot.api.ChiamataScorers;
import it.univpm.Foot.exceptions.BaseException;
import it.univpm.Foot.filter.StatsFilter;
import it.univpm.Foot.model.AverageNameAndNumOfGoalsScorers;
import it.univpm.Foot.model.Scorers;
import it.univpm.Foot.model.StatsScorers;
/**
 * Classe che consente di determinare le statistiche sugli Scorers
 *
 */
public class StatsOnScorers {
	/**
	 * Costruttore di default
	 */
	public StatsOnScorers() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Metodo che consente di determinare la media dei Goal fatti,
	 * il numero massimo/minimo/medio di Goal per marcatore, 
	 * la media dei Goal per marcatore di ogni squadra
	 * @param _competition Fornisce la competizione
	 * 
	 * @return Un oggetto ssc (StatsScorers) che contine le statistiche sugli Scorers
	 */
	public static StatsScorers getResult(String _competition)throws BaseException {
		StatsScorers ssc = new StatsScorers();
		try {
			Vector<Scorers> scorersList = new Vector<Scorers>();
			// passo i caratteri jolly come minimo numero di goal e posizione
			scorersList = ChiamataScorers.chiamata(_competition, -1L, "*");			
			Scorers sc = new Scorers();
			
			String[] name = new String[scorersList.size()];
			String[] teamName = new String[scorersList.size()];
			int[] goals = new int[scorersList.size()];
			
			Vector<AverageNameAndNumOfGoalsScorers> anngsVector = new Vector<AverageNameAndNumOfGoalsScorers>();
			AverageNameAndNumOfGoalsScorers anngs = new AverageNameAndNumOfGoalsScorers();
			
			int pos = 0;
			for (int i = 0; i < scorersList.size(); i++) {
				sc = scorersList.get(i);
				//name[i] = sc.getName();
				teamName[i] = sc.getTeamName();
				goals[i] = sc.getNumberOfGoals().intValue();
				
				
				
				pos = StatsFilter.getPosTeamName(anngsVector, sc.getTeamName());
			
				
				System.out.println("name="+name[i]+"; teamName="+teamName[i]+"; goals="+goals[i]+"; pos="+pos);
				if (pos!=-1) {
					// modificare la somma dei goal
					anngs = anngsVector.get(pos);
					anngs.setNumberOfGoals(anngs.getNumberOfGoals()+goals[i]);
					anngs.setNumberScorers(anngs.getNumberScorers()+1);
					// replace
					anngsVector.set(pos, anngs);
				} else {
					// aggiungere al vettore
					anngs = new  AverageNameAndNumOfGoalsScorers();
					//anngs.setName(name[i]);
					anngs.setTeamName(teamName[i]);
					anngs.setNumberOfGoals(goals[i]);
					anngs.setNumberScorers(1);
					anngsVector.add(anngs);
				}
				
			}
			// devo impostare la media dei goal fatti
			for (int j = 0; j < anngsVector.size(); j++) {
				anngs = anngsVector.get(j);
				if (anngs.getNumberOfGoals()!=0 && anngs.getNumberScorers()!=0) {
					anngs.setAverageOfGoals(anngs.getNumberOfGoals()/anngs.getNumberScorers());
				} else {
					anngs.setAverageOfGoals(0);
				}
				// replace
				anngsVector.set(j, anngs);
			}
			
			System.out.println("teamName="+teamName);
			
			// calcoliamo la media dei goal fatti
			ssc.setAverageGoalsForScorer(StatsFilter.average(goals));
			// squadra con il numero maggiore di marcatori
			ssc.setTeamMaxScorers(StatsFilter.highestRepeated(teamName));
			// squadra con il numero minimo di marcatori
			ssc.setTeamMinScorers(StatsFilter.theLeastRepeated(teamName));
			// media di goal per marcatore
			ssc.setAverageGoalsForScorer(StatsFilter.average(goals));
	        // media di goal per marcatore per ogni squadra
			ssc.setAverageForTeamScorerVector(anngsVector);
		} catch (Throwable e) { 
			BaseException pe =  new BaseException(e);
			throw pe;	
		}
		
		return ssc;
		
	}

}
