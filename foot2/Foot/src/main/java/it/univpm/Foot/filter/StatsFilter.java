package it.univpm.Foot.filter;

import java.text.SimpleDateFormat;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
import java.util.Vector;

import it.univpm.Foot.exceptions.BaseException;
import it.univpm.Foot.model.AverageNameAndNumOfGoalsScorers;

/**
 * Classe che estende la classe BaseFilter 
 * 
 *
 */
public class StatsFilter extends BaseFilter {

	/**
	 * Costruttore di default
	 */
	public StatsFilter() {
	}
	
	/**
	 * Metodo di tipo static che calcola il tempo in giorni tra la data finale e la data iniziale
	 * 
	 * @param dataIniziale Rappresenta la data iniziale
	 * @param dataFinale   Rappresenta la data finale
	 * @return timeInDays  Rirorna la data in giorni (Long)
	 * @throws BaseException Eccezione che visualizzerà : Formato delle date incorretto!
	 */
	public static Long timeInDays(String dataIniziale, String dataFinale) throws BaseException {
		Date df = null;
		Date di = null;
		long timeInDays = 0;

		try {
			
			df=new SimpleDateFormat("yyyy-MM-dd").parse(dataFinale);
			di=new SimpleDateFormat("yyyy-MM-dd").parse(dataIniziale);
			timeInDays = timeInDays + ((df.getTime()-di.getTime())/1000/60/60/24);
		} catch (Throwable e) { 
			BaseException pe =  new BaseException("Formato delle date incorretto!");
			throw pe;		
		}
		return timeInDays;	
	}
	
	/**
	 * Metodo di tipo static che calcola il tempo in giorni tra la data finale e la data iniziale
	 * 
	 * @param dataIniziale Rappresenta la data iniziale
	 * @param dataFinale   Rappresenta la data finale
	 * @throws BaseException Eccezione
	 * @return timeInDays  Rirorna la data in giorni(Int)
	 */
	public static int timeInDaysInt(String dataIniziale, String dataFinale) throws BaseException {
		return (int) timeInDays(dataIniziale, dataFinale).intValue();	
	}	
	/**
	 * Metodo di tipo static che restituisce il valore minimo di un array
	 * 
	 * @param array Array di int da analizzare
	 * @throws BaseException Eccezione
	 * @return l2 Valore minimo dell'array
	 */
	public static long min(int array[])throws BaseException {
	    int result = Integer.MAX_VALUE;
	    for (int a : array) result = Math.min(result, a);
	    Long l2=Long.valueOf(result);
	    return l2.longValue();
	}
	
	/**
	 * Metodo di tipo static che restituisce il valore massimo di un array
	 * 
	 * @param array Array di int da analizzare
	 * @throws BaseException Eccezione
	 * @return l2 Valore massimo dell'array
	 */
	public static long max(int array[])throws BaseException {
	    int result = Integer.MIN_VALUE;
	    for (int a : array) result = Math.max(result, a);
	    Long l2=Long.valueOf(result);
	    return l2.longValue();
	}
	/**
	 * Metodo di tipo static che restituisce la somma di un array
	 * 
	 * @param array Array di int da sommare
	 * @throws BaseException Eccezione
	 * @return l2 Somma 
	 */
	public static long sum(int array[])throws BaseException {
	    int result = 0;
	    for (int a : array) result += a;
	    Long l2=Long.valueOf(result);
	    return l2.longValue();
	}
    /**
     * Metodo di tip statis che restituisce la media di un array
     * 
     * @param array Array di int da analizzare
     * @throws BaseException Eccezione
     * @return l2 Numero medio
     */
	public static long average(int array[]) throws BaseException{
		double d = (double)sum(array)/array.length;
	    Long l2=Long.valueOf((int) d);
	    return l2.longValue();
	}
	
	/**
     * Metodo di tip statis che restituisce la media di un array
     * 
     * @param array Array di int da analizzare
     * @param lenght Fornisce la lunghezza dell'array
     * @throws BaseException Eccezione
     * @return l2 Numero medio
     */
	public static long average(int array[], int lenght) throws BaseException {
		double d = (double)sum(array)/lenght;
	    Long l2=Long.valueOf((int) d);
	    return l2.longValue();
	}
	
	/**
	 * Metodo di tipo static che cerca la stringa più ripetuta
	 * 
	 * @param str Array di String da analizzare
	 * @throws BaseException Eccezione
	 * @return bestString Ritorna la stringa più ripetuta 
	 */
	public static String highestRepeated(String[] str) throws BaseException{
	    String[] sorted = Arrays.copyOf(str, str.length);
	    Arrays.sort(sorted, 0, sorted.length, Comparator.reverseOrder());
	    String currentString = sorted[0];
	    String bestString = sorted[0];
	    int maxCount = 1;
	    int currentCount = 1;
	    for (int i = 1 ; i < sorted.length ; i++) {
	        if (currentString.equals(sorted[i])) {
	            currentCount++;
	        } else {
	            if (maxCount < currentCount) {
	                maxCount = currentCount;
	                bestString = currentString;
	            }
	            currentString = sorted[i];
	            currentCount = 1;
	        }
	    }
	    if (currentCount > maxCount) {
	        return currentString;
	    }
	    return bestString;
	}
	
	/**
	 *  Metodo di tipo static che cerca la stringa meno ripetuta
	 * 
	 * @param str Array di String da analizzare
	 * @throws BaseException Eccezione
	 * @return bestString Ritorna la stringa meno ripetuta
	 */
	public static String theLeastRepeated(String[] str)throws BaseException {
		// la stringa meno ripetuta
	    String[] sorted = Arrays.copyOf(str, str.length);
	    Arrays.sort(sorted, 0, sorted.length, Comparator.reverseOrder());
	    String currentString = sorted[0];
	    String bestString = sorted[0];
	    int minCount = 1000;
	    int currentCount = 1;
	    for (int i = 1 ; i < sorted.length ; i++) {
	        if (currentString.equals(sorted[i])) {
	            currentCount++;
	        } else {
	            if (minCount > currentCount) {
	                minCount = currentCount;
	                bestString = currentString;
	            }
	            currentString = sorted[i];
	            currentCount = 1;
	        }
	    }
	    if (currentCount < minCount) {
	        return currentString;
	    }
	    return bestString;
	}	
	
	/**
	 * Metodo di tipo static che analizza un Vettore AverageNameAndNumOfGoalsScorers
	 * 
	 * @param vet Vettore di AverageNameAndNumOfGoalsScorers
	 * @param teamName Nome della squadra
	 * @throws BaseException Eccezione
	 * @return j Se i nomi delle delle squadre sono uguali, -1 altrimenti 
	 */
	public static int getPosTeamName(Vector<AverageNameAndNumOfGoalsScorers> vet, String teamName) throws BaseException{
		AverageNameAndNumOfGoalsScorers a = new AverageNameAndNumOfGoalsScorers();
		for (int j = 0; j < vet.size(); j++) {
			a = vet.get(j);
			if (a.getTeamName().equals(teamName)) {
				return j;
			}
		}
		return -1;
	}
	

}
