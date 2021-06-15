package it.univpm.Foot;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import it.univpm.Foot.exceptions.BaseException;
import it.univpm.Foot.filter.StatsFilter;

/**
 * Classe che testa il corretto funzionamento dell'eccezione BaseException nel metodo timeInDays
 *
 */
public class TestException {
	/**
	 * Stringa contenente la data iniziale in un formato scorretto
	 */
    String dataIniziale;
    /**
	 * Stringa contenente la data finale in un formato scorretto
	 */
    String dataFinale;
    
	/**
	 * Inizializza i componenti che verranno utilizzati per testare i metodi
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {	
		dataIniziale = "15-03";
		dataFinale = "18-03";
	}
	
	/**
	 * Distrugge ciò che è stato inizializzato nel metodo setUp
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {

	}
	
	/**
	 * Test che verifica il corretto funzionamento dell'eccezione BaseException nel metodo timeInDays
	 */
	@Test
	@DisplayName("Corretta generazione dell'eccezione BaseException")
	void stateCodeTest() {	
		assertThrows(BaseException.class, () ->  StatsFilter.timeInDays(dataIniziale, dataFinale));
	}
}
