package it.univpm.Foot.filter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import it.univpm.Foot.model.AverageNameAndNumOfGoalsScorers;

public class StatsFilter extends BaseFilter {

	public StatsFilter() {
	}
	
	public static Long timeInDays(String dataIniziale, String dataFinale) throws Exception {
		// calcola il tempo in giorni tra la data finale e la data iniziale
		Date df = null;
		Date di = null;
		long timeInDays = 0;

		try {
			
			df=new SimpleDateFormat("yyyy-MM-dd").parse(dataFinale);
			di=new SimpleDateFormat("yyyy-MM-dd").parse(dataIniziale);
			timeInDays = timeInDays + ((df.getTime()-di.getTime())/1000/60/60/24);
			
		} catch (Exception e) {
			System.out.println ("Formato delle date incorretto!");
			throw e;
		}		

		return timeInDays;	
	}
	
	public static int timeInDaysInt(String dataIniziale, String dataFinale) throws Exception {
		// calcola il tempo in giorni tra la data finale e la data iniziale
		return (int) timeInDays(dataIniziale, dataFinale).intValue();	
	}	
	
	public static long min(int array[]) {
	    int result = Integer.MAX_VALUE;
	    for (int a : array) result = Math.min(result, a);
	    Long l2=Long.valueOf(result);
	    return l2.longValue();
	}

	public static long max(int array[]) {
	    int result = Integer.MIN_VALUE;
	    for (int a : array) result = Math.max(result, a);
	    Long l2=Long.valueOf(result);
	    return l2.longValue();
	}

	public static long sum(int array[]) {
	    int result = 0;
	    for (int a : array) result += a;
	    Long l2=Long.valueOf(result);
	    return l2.longValue();
	}

	public static long average(int array[]) {
		double d = (double)sum(array)/array.length;
	    Long l2=Long.valueOf((int) d);
	    return l2.longValue();
	}
	
	public static long average(int array[], int lenght) {
		double d = (double)sum(array)/lenght;
	    Long l2=Long.valueOf((int) d);
	    return l2.longValue();
	}
	
	public static String highestRepeated(String[] str) {
		// la stringa più ripetuta
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
	
	public static String theLeastRepeated(String[] str) {
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
	
	public static int getPosTeamName(Vector<AverageNameAndNumOfGoalsScorers> vet, String teamName) {
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