package it.univpm.Foot;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import it.univpm.Foot.filter.StatsFilter;
/**
 * Classe che testa il corretto funzionamento del metodo highestRepeated
 *
 */
public class StatsFilterTest1 {

		StatsFilter stats;
		String[] stringArray =  { "name1", "name1", "name2", "name2", "name2", "name2", "name2", "name2", "name2", "name2", "name3", "name3", "name3","name4", "name4", "name4", "name4" };; 
        String result;
        String str;
        
		/**
		 * Inizializza i componenti che verranno utilizzati per testare i metodi
		 * @throws Exception
		 */
		@BeforeEach
		void setUp() throws Exception{
			stats = new StatsFilter();	
			str = "name2";
		}
		
		/**
		 * Distrugge ciò che è stato inizializzato nel metodo setUp
		 * @throws Exception
		 */
		@AfterEach
		void tearDown() throws Exception{

		}
		
		/**
		 * Test che verifica il corretto funzionamento del metodo theLeastRepeated  
		 */
		@Test
		@DisplayName("Corretto funzionamento del metodo highestRepeated")
		void highestRepeated() {
			String result = StatsFilter.highestRepeated(stringArray);
			assertEquals(str,result);
		}
		
}
