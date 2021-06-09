package it.univpm.Foot.filter;


/**
 * Classe CompetitionsFilter che estende la classe BaseFilter
 * 
 */
public class CompetitionsFilter extends BaseFilter {

    /**
    * Costruttore di default
    */
	public CompetitionsFilter() {	
	}
    /**
     * Metodo di tipo static che Filtra il numero delle squadre
     *  Tra andata e ritorno abbiamo: la disposizione di 10,2 che è uguale a 2*N*(N-1) partite e che dovremmo dividere per N
                 NM = number matchs
				 NT = number teams
				 NM = 2(NT-1)
				 NM = 2 * NT * (NT-1) / NT
				 NT = (NM +2) / 2
     * 
     * @param currentMatchday Assegna il numero delle partite giocate
     * 
     * @return teamsNumber (numero delle squadre)
     */
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

