package it.univpm.Foot.filter;

import it.univpm.Foot.exceptions.BaseException;

/**
 * 
 * Classe BaseFilter che fornisce dei metodi per il filtraggio
 *
 */
public class BaseFilter {

	/**
	 * Costruttore di default
	 */
	public BaseFilter() {
	}
	/**
	 * Metodo di tipo static che restituisce true se le due stringhe sono uguali o str1 = * (carattere jolly)
	 * 
	 * @param str1 La prima stringa da confrontare
	 * @param str2 La seconda stringa da confrontare
	 * @throws BaseException Eccezione
	 * @return b Boolean 
	 */
	public static boolean stringController(String str1, String str2) throws BaseException{
		boolean  b = false;
		if (("*".equals(str1) || (str1!=null && str1.equals(str2)))) {
			    b = true;   
		}
		
		return b;	
	}	
	/**
	 * Metodo di tipo static 
	   in cui 
	   operator=0 significa =, 
	   operator=1 significa minore uguale, 
	   operator=2 significa maggiore uguale, 
	   -1 è il carattere jolly
	 * 
	 * @param l1 Primo numero passato
	 * @param l2 Secondo numero passato 
	 * @throws BaseException Eccezione
	 * @return b Boolean
	 */
	public static boolean minLongController(Long l1, Long l2) throws BaseException {		
		boolean  b = false;
		if ((l1==-1 || (l2!=null && l1.longValue()<=l2.longValue()))) {
			    b = true;   
		}
		
		return b;	
	}	
}
