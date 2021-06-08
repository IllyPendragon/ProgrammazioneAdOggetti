package it.univpm.Foot.exceptions;

public class WrongParam extends Exception {
	
	public  WrongParam ()
	  {
		super("Attenzione,il parametro è vuoto!! Puoi inserire solo: BL1,PL,SA,PD,FL1,DED,PPL,CL,WC");
		} 
  }
