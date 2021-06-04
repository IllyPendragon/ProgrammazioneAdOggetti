package it.univpm.Foot.filter;

public class BaseFilter {

	public BaseFilter() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean stringController(String str1, String str2) {
		// torna true se le 2 stringhe sono uguali o str1 = * (carattere jolly)
		boolean  b = false;
		if (("*".equals(str1) || (str1!=null && str1.equals(str2)))) {
			    b = true;   
		}
		
		return b;	
	}	
	
	public static boolean minLongController(Long l1, Long l2) {
		// operator=0 significa =, operator=1 significa <=, operator=2 significa >=
		// -1 è il carattere jolly
		boolean  b = false;
		if ((l1==-1 || (l2!=null && l1.longValue()<=l2.longValue()))) {
			    b = true;   
		}
		
		return b;	
	}	
}
