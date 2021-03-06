package it.univpm.Foot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Vector;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import it.univpm.Foot.api.ChiamataCompetitions;
import it.univpm.Foot.model.Competizioni;

/**
 * Classe che testa il corretto funzionamento del metodo chiamata
 *
 */
public class TestChiamataCompetitions {
	/**
	 * Vettore di Competizioni
	 */
	Vector<Competizioni> result;
	/**
	 * Oggetto della classe Competizioni
	 */
	Competizioni compIta;
	/**
	 * Stringa contenente il risultato corretto
	 */
    String str;
    
	/**
	 * Inizializza i componenti che verranno utilizzati per testare i metodi
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {	
		compIta = new Competizioni();
		str = "Italy";
	}
	
	/**
	 * Distrugge ciò che è stato inizializzato nel metodo setUp
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {

	}
	
	/**
	 * Test che verifica il corretto funzionamento del metodo chiamata 
	 */
	@Test
	@DisplayName("Corretto funzionamento del metodo chiamata")
	void competitions () {
		try {
		    result = ChiamataCompetitions.chiamata("ITA", "SA");
		    compIta = (Competizioni) result.get(0);
			assertEquals(str,compIta.getNationality());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
