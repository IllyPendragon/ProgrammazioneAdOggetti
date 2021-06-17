# ProgrammazioneAdOggetti
Progetto programmazione ad oggetti

<a name="su"></a>  
# FootBall-data RestApi  
1. [Introduzione all'Api](#intro)  
2. [Diagrammi UML](#uml)  
4. [Postman](#postman)  
5. [JSON](#js)  
6. [Rotte](#rotte)   
7. [Appendice](#app)  
8. [Autori](#autori)  
  
<a name="intro"></a>   
# Introduzione all'Api  
L'Api [FootBall-data](https://www.football-data.org/documentation/quickstart) fornisce informazioni riguardanti le principali competizioni calcistiche.  
Fornisce dati riguardanti le stagioni giocate dalle varie squadre, i punteggi ottenuti e i giocatori appartenenti alle determinate competizioni.  
Essa permetterà all'utente di filtrare i dati e ricevere statistiche precise.  
  
## Statistiche generali  
* Numero minimo, massimo, medio di squadre totali  
* Durata media delle competizioni  
* Quantità media di stagioni salvate per ogni competizione  
## Statistiche in base alla competizione  
* Numero stagioni salvate  
* Squadra con il numero minore/maggiore di marcatori  
* Media goal per marcatore  
* Media goal per marcatore di ogni squadra  
## Filtraggio  
* Tutti i ruoli dei marcatori  
* Un solo ruolo  
* Numero minimo di Goal fatti  
##### [Torna su^](#su)  
<a name="uml"></a>  
# Diagrammi UML  
Unified Modeling Language (UML) nasce come linguaggio standard per la creazione di modelli software nel 1997.  
UML si può definire come linguaggio semi-formale e grafico, utilizzato per specificare, visualizzare, costruire e documentare un sistema software.  
I diagrammi che fanno parte di UML possono essere:  
* [Diagrammi dei casi d'uso](#uso)  
* [Diagrammi delle classi](#classi)  
* [Diagrammi delle sequenze](#sqz)  
  
<a name="uso"></a>  
## Diagramma dei casi d'uso  
Questo diagramma definisce l'interazione dell'utente con il sistema, mostra la relazione tra l'utente e i differenti casi d'uso.  
  
I casi d'uso sono una successione di interazioni elementari compiute dall'utente al sistema e le conseguenti risposte del sistema.  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Football_0_0.jpg)  
<a name="classi"></a>  
## Diagramma delle classi  
Descrive le caratteristiche statiche e dinamiche delle componenti (classi) e delle relazioni che ci sono tra le classi (associazioni).  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Diagramma%20delle%20Classi%20Completo.jpg)  
* **API**  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Api.jpg)  
* **CONTROLLER**  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Controller.jpg)  
* **PARSER**  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Parser.jpg)  
* **MODEL**  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Model.jpg)  
* **FILTER**  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Filter.jpg)  
* **STATS**  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Stats.jpg)  
* **EXCEPTION**  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Exception.jpg)  
<a name="sqz"></a>  
## Diagramma delle sequenze  
Permette di definire le interazioni dinamiche fra le entità.  
  
# /competitions  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Sequence%20DiagramCompetitions.jpg)  
# /scorers  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Sequence%20DiagramScorers.jpg)  
# /statsCompetitions  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Sequence%20DiagramStatsCompetitions.jpg)  
# /statsScorers  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/UML/Sequence%20DiagramStatsOnScorers.jpg)  
##### [Torna su^](#su)  
<a name="postman"></a>  
# Postman  
Postman è un'applicazione che permette di costruire, testare e documentare Api più velocemente.Tramite Postman è possibile effettuare delle chiamate API senza dover modificare il codice dell’applicazione, fornendo, alla chiamata, un’utile interfaccia grafica.  
Tramite l'interfaccia grafica è possibile selezionare la tipologia di chiamata che si vuole effettuare e impostare dati per l'autorizzazione della chiamata.  
Possiamo effettuare diverse tipologie di chiamate:  
* Chiamata di tipo GET  
  
   Il metodo GET consiste nell’accodare all’indirizzo della pagina web (URL) i diversi parametri contenenti i dati che si vogliono trasmettere; all’URL originale viene quindi aggiunto alla fine un punto interrogativo seguito dai parametri e dai dati da tarsferire.  
    
* Chiama di tipo POST  
  
   Il metodo POST viene utilizzato impostando il parametro method come POST, i dati vengono inviati così con la richiesta HTTP senza essere visibili all’utente come      invece accade con il metodo GET; il metodo POST non ha limiti di dimensione delle informazioni scambiate.  
##### [Torna su^](#su)     
<a name="js"></a>     
# JSON  
JSON (JavaScript Object Notation) è un semplice formato per lo scambio di dati, facile da leggere e scrivere.  
È basato su due strutture:  
  * Un insieme di coppie nome/valore.  
  * Un elenco ordinato di valori.  
     
Un oggetto è una serie non ordinata di nomi/valori, inizia con {parentesi graffa sinistra e finisce con }parentesi graffa destra. Ogni nome è seguito da :due punti e le coppie di nome/valore sono separate da ,virgola.  
  
Un array è una raccolta ordinata di valori, comincia con [ parentesi quadra sinistra e finisce con ] parentesi quadra destra. I valori sono separati da ,virgola.  
  
Un valore può essere una stringa tra virgolette, o un numero, o vero (true) o falso (false) o nullo (null), o un oggetto o un array. Queste strutture possono essere annidate.  
##### [Torna su^](#su)  
<a name="rotte"></a>  
# Rotte  
Tipo | Rotta | Descrizione  
---- | ---- | ----  
GET | /competitions | Effettua analisi su un gruppo di competizioni  
GET | /scorers | Effettua un'analisi su un gruppo di marcatori  
GET | /statsCompetitions | Effettua una statistica in base alle competizioni  
GET | /statsScorers | Effettua una statistica in base ai marcatori  
  
# Parametri   
Nelle rotte è possibile inserire dei parametri del tipo "competition", "countryCode", "minNumberOfGoals" e "position", per definire le competizioni, i marcatori e per effettuare delle statistiche.  
  
# /competitions  
Rotta di tipo Get che descrive una competizione.  
Possiamo inserire due parametri:  
* coutryCode: Nel quale dobbiamo inserire il [codice](#code) di nazionalità della competizione  
* competition: Nel quale dobbiamo inserire il [codice](#code) della competizione  
* parametro jolly * : Inserendo tale parametro ottengo un array di tutte le competizioni   
* **Attenzione**: Se non si inserisce nessun parametro viene lanciata l'eccezione BaseException con il relativo messaggio: "Parametro vuoto!! Inserire almeno il carattere Jolly * "  
## Modello  
```  
" {  
        "nome": "Serie A",  
        "codice": "SA",  
        "dataIniziale": "2020-09-20",  
        "dataFinale": "2021-05-23",  
        "vincitore": "FC Internazionale Milano",  
        "nationality": "Italy",  
        "countryCode": "ITA",  
        "currentMatchday": 38,  
        "teamsNumber": 20,  
        "numberOfAvailableSeasons": 17  
    } "  
```  
Il JSON sopra riportato indica la rappresentazione utilizzata per definire una competizione. I campi rappresentano:  
  
* **nome** : nome della competizione  
* **codice** : codice competizione  
* **dataIniziale** : data iniziale della competizione  
* **dataFinale** : data finale della competizione  
* **vincitore** : vincitore della competizione  
* **nationality** : nazionalità della competizione  
* **countryCode** : codice di nazionalità della competizione  
* **currentMatchday** : giornata del match  
* **teamsNumber** : numero delle squadre  
* **numberOfAvailableSeasons** : numero stagioni disponibili  
## Risultato chiamata su Postman  
* *http://localhost:8080/competitions?countryCode=*&competition=**   
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/postman/RottaCompetitions.jpg)  
Il programma restituisce le competizioni elaborate sotto forma di un JSONArray.  
  
# /scorers  
Rotta di tipo Get che descrive un marcatore.  
Possiamo inserire diversi parametri:  
* competition: Nel quale dobbiamo inserire il [codice](#code) della competizione  
* minNumberOfGoals : Nel quale posso inserire un numero minimo di goal effettuati de marcatore 
* position : Nel quale posso inserire il [ruolo](#ruoli) del marcatore  
* parametro jolly -1 : Inserendo tale parametro in minNumberOfGoals ottengo un array di tutti i marcatori  
* parametro jolly * : Inserendo tale parametro in position e competition ottengo un array di tutti i marcatori per ogni ruolo  
* * **Attenzione**: Se non si inserisce nessun parametro in competition o position viene lanciata l'eccezione BaseException con il relativo messaggio: "I parametri competition o position sono vuoti!! Inserire almeno il carattere Jolly * "  
## Modello  
```  
" {   
        "name": "Cristiano Ronaldo",  
        "position": "Attacker",  
        "numberOfGoals": 29,  
        "teamName": "Juventus FC"  
    } "  
```  
Il JSON sopra riportato indica la rappresentazione utilizzata per definire i marcatori. I campi rappresentano:  
  
* **nome** : nome del marcatore 
* **position** : ruolo del marcatore  
* **numberOfGoals** : numero dei goal segnati dal marcatore  
* **teamName** : nome della squadra del marcatore  
## Risultato chiamata su Postman  
* *http://localhost:8080/scorers?competition=SA&minNumberOfGoals=-1&position=**  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/postman/RottaScorers.jpg)  
Il programma restituisce i marcatori elaborati sotto forma di un JSONArray.  
  
# /statsCompetitions  
Rotta di tipo Get che effettua delle statistiche sulle competizioni.  
Possiamo inserire due parametri:  
* coutryCode: Nel quale dobbiamo inserire il [codice](#code) di nazionalità della competizione  
* competition: Nel quale dobbiamo inserire il [codice](#code) della competizione  
* parametro jolly * : Inserendo tale parametro ottengo un array di statistiche su tutte le competizioni   
* **Attenzione**: Se non si inserisce nessun parametro viene lanciata l'eccezione BaseException con il relativo messaggio: "Parametro vuoto!! Inserire almeno il carattere Jolly * "  
## Modello  
```  
" {  
          
    "numCompetions": 153,  
    "averageDuration": 202,  
    "minNumberTeams": 0,  
    "maxNumberTeams": 24,  
    "averageNumberTeams": 11,  
    "numberAverageOfAvailableSeasons": 4  
  
    } "  
```  
Il JSON sopra riportato indica la rappresentazione utilizzata per definire le statistiche su una o tutte le competizioni. I campi rappresentano:  
  
* **numCompetions** : numero delle competizioni  
* **averageDuration** : media durata competizioni  
* **minNumberTeams** : numero minimo di squadre  
* **maxNumberTeams** : numero massimo di squadre  
* **averageNumberTeams** : numero medio di squadre  
* **numberAverageOfAvailableSeasons** : numero medio di stagioni disponibili  
## Risultato chiamata su Postman  
* *http://localhost:8080/statsCompetitions?countryCode=*&competition=**  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/postman/RottaStatsCompetition.jpg)  
Il programma restituisce le competizioni elaborate sotto forma di un JSONObject.  
  
# /statsScorers  
Rotta di tipo Get che effettua delle statistiche sui marcatori.  
Possiamo inserire un parametro:  
* competition: Nel quale dobbiamo inserire il [codice](#code) della competizione   
* **Attenzione**: Se non si inserisce nessun parametro o si inserisce un parametro errato viene lanciata l'eccezione BaseParam con il relativo messaggio: "Parametro vuoto o errato!! Puoi inserire solo: BL1,SA,PD,FL1,PPL,WC"  
## Modello  
```  
"  {  
    "teamMinScorers": "US Sassuolo Calcio",  
    "teamMaxScorers": "FC Internazionale Milano",  
    "averageGoalsForScorer": 20,  
    "averageForScorerVector": null,  
    "averageForTeamScorerVector": [  
        {  
            "name": null,  
            "teamName": "Juventus FC",  
            "numberOfGoals": 29,  
            "numberScorers": 1,  
            "averageOfGoals": 29  
        },  
        {  
            "name": null,  
            "teamName": "FC Internazionale Milano",  
            "numberOfGoals": 41,  
            "numberScorers": 2,  
            "averageOfGoals": 20  
        },  
        {  
            "name": null,  
            "teamName": "Atalanta BC",  
            "numberOfGoals": 22,  
            "numberScorers": 1,  
            "averageOfGoals": 22  
        },  
        {  
            "name": null,  
            "teamName": "ACF Fiorentina",  
            "numberOfGoals": 21,  
            "numberScorers": 1,  
            "averageOfGoals": 21  
        },  
        {  
            "name": null,  
            "teamName": "SS Lazio",  
            "numberOfGoals": 20,  
            "numberScorers": 1,  
            "averageOfGoals": 20  
        },  
        {  
            "name": null,  
            "teamName": "FC Crotone",  
            "numberOfGoals": 20,  
            "numberScorers": 1,  
            "averageOfGoals": 20  
        },  
        {  
            "name": null,  
            "teamName": "SSC Napoli",  
            "numberOfGoals": 19,  
            "numberScorers": 1,  
            "averageOfGoals": 19  
        },  
        {  
            "name": null,  
            "teamName": "US Sassuolo Calcio",  
            "numberOfGoals": 17,  
            "numberScorers": 1,  
            "averageOfGoals": 17  
        },  
        {  
            "name": null,  
            "teamName": "Cagliari Calcio",  
            "numberOfGoals": 16,  
            "numberScorers": 1,  
            "averageOfGoals": 16  
        }  
    ]  
  
    } "  
```  
Il JSON sopra riportato indica la rappresentazione utilizzata per definire le statistiche su una o tuttte le competizione. I campi rappresentano:  
  
* **teamMinScorers** : squadra con numero minimo di marcatori  
* **teamMaxScorers** : squadra con numero massimo di marcatori  
* **averageGoalsForScorer** : media Goal per marcatore  
* **averageForScorerVector** : media per marcatore(vettore)  
* **averageForTeamScorerVector** : media goal per marcatore per ogni squadra (vettore)  
     * **nome** : nome marcatore  
     * **teamName** : nome squadra del marcatore  
     * **numberOfGoals** : numero dei goal per marcatore di ogni squadra  
     * **numberScorers** : numero di marcatori per ogni squadra  
     * **averageOfGoals** : numero medio di Goal segnati per marcatore di ogni squadra   
## Risultato chiamata su Postman  
* *http://localhost:8080/statsScorers?competition=SA*  
  
![alt text](https://github.com/IllyPendragon/ProgrammazioneAdOggetti/blob/main/postman/RottaStatsScorers.jpg)  
Il programma restituisce le competizioni elaborate sotto forma di un JSONObject.  
##### [Torna su^](#su)  
<a name="app"></a>  
# Appendice  
<a name="code"></a>   
## Tabella dei League-Codes per le rotte \competition e \statsCompetition  
League-Code  | CountryCode | League  
---- | ---- | ----  
BL1 | Germany(DEU)  | Bundesliga   
PL | England(ENG) | Premiere League  
SA | Italy(ITA) | Serie A  
PD | Spain(ESP) | Primera Division  
FL1 | France(FRA) | Ligue 1  
DED | Netherlands(NLD) | Eredivisie  
PPL | Portugal(PRT) | Primeira Liga  
CL | Europe(EUR) | Champions-League   
WC | World(INT) | World-Cup  
  
**ATTENZIONE** : I codici delle nazioni e delle competizioni vanno inseriti tutti in maiuscolo!  
 
## Tabella dei League-Codes per le rotte \scorers e \statsScorers  
League-Code | League  
---- | ----   
BL1 |  Bundesliga    
SA | Serie A  
PD |  Primera Division  
FL1 | Ligue 1   
PPL |  Primeira Liga    
WC |  World-Cup  
  
**ATTENZIONE** : I codici delle competizioni vanno inseriti tutti in maiuscolo!  
  
<a name="ruoli"></a>  
## Tabella dei ruoli per la rotta \scorers 
Ruolo  | Param    
---- | ----   
Attaccante | Attacker     
Centrocampista | Midfielder   
Difensore | Defender   
##### [Torna su^](#su)  
<a name="autori"></a>  
# Autori  
* Ilaria Rita Prencipe  
* Marisonia Ferrandino  
##### [Torna su^](#su) 




