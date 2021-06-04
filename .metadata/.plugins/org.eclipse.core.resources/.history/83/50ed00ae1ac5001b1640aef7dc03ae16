package it.univpm.Foot.filter;


/**
 * Classe che effettua un filtro sulle Competizioni
 * 
 * @author Ilaria Prencipe
 */
public class CompetitionsFilter extends BaseFilter {

	public CompetitionsFilter() {	
	}

	public static Long teamsNumberFilter(Long currentMatchday) {
		
		Long teamsNumber = null;
	    if (currentMatchday!=null) {
	    	    // Tra andata e ritorno abbiamo: la disposizione di 10,2 che è uguale a 2*N*(N-1) partite e che dovremmo dividere per N
                // NM = number matchs
				// NT = number teams
				// NM = 2(NT-1)
				// NM = 2 * NT * (NT-1) / NT
				// NT = (NM +2) / 2
			    teamsNumber =  (currentMatchday + 2)/2;   
		}
		
		return teamsNumber;	
	}
	
}

