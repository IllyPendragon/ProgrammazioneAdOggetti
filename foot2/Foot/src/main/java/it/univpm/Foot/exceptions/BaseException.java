package it.univpm.Foot.exceptions;

/**
 * Classe che descrive le eccezioni 
 * 
 */
public class BaseException extends Exception {
	
	/**
	 * Variabile funzionale alla classe Exception
	 */
	//parametro richiesto dell'interfaccia Serializable implementata dalla classe Exception
	private static final long serialVersionUID = 1L;
	
	/**
	 * Costruttore che attinge al costruttore della classe Exception
	 * 
	 * @param cause Rappresenta l'eccezione che causa l'eccezione corrente
	 */
	public  BaseException(Throwable cause)
	  {
		super(cause);
		}
	/**
	 * Costruttore che attinge al costruttore della classe Exception
	 * 
	 * @param message Rappresenta il messaggio visualizzato al momento di lancio dell'eccezione 
	 */
	public  BaseException(String message)
	  {
		super(message);
		}
	/**
	 * Costruttore che attinge al costruttore della classe Exception
	 *  
	 * @param message Rappresenta il messaggio visualizzato al momento di lancio dell'eccezione
	 * @param cause Rappresenta l'eccezione che causa l'eccezione corrente
	 */
    public BaseException(String message, Throwable cause) {
        super(message, cause);
        System.out.println(message);
    }
}
