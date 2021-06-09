package it.univpm.Foot.exceptions;


public class BaseException extends Exception {
	
	//parametro richiesto dell'interfaccia Serializable implementata dalla classe Exception
	private static final long serialVersionUID = 1L;
	
	public  BaseException(Throwable cause)
	  {
		//t.printStackTrace();
		super(cause);
		} 
	public  BaseException(String message)
	  {
		//t.printStackTrace();
		super(message);
		}
	
    public BaseException(String message, Throwable cause) {
        super(message, cause);
        System.out.println(message);
    }
}
