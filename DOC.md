Documentazione
==============

Operazioni a disposizione
-------------------------

Lista di operazioni disponibili all'utente

- `1` Inserimento dati
    - `1.1` Inserimento dei docenti assenti
        - `1.1.1` Inserire il nome del docente
        - `1.1.2` Inserire l'orario di uscita
    - `1.2` Inserimento dei docenti disponibili
        - `1.2.1` Accesso / Modifica lista docenti disponibili (presa da `.CSV`)
            - `1.2.1` Modifica docenti disponibili  
                - `1.2.1.10` Modifica disponibilità
                - `1.2.1.20` Imposta le cause della disponibilità
                    - `1.2.1.21` Cause : docente disponibile (La classe è in gita (non accompagnatore); Il docente ha un ora buca)     
                    - `1.2.1.22` Cause : docente non è disponibile (La classe è in gita (accompagnatore); ...)     
                - `1.2.1.30` Imposta l'orario della disponibilità (esempio: da 1a ora a ...; scelta ore)
    - `1.3` Aggiornamento del database `.CSV`
        - `1.3.1` Scegli file `.CSV` da caricare   
    - `1.4` Modifica del file `.CSV` con Excel `start excel "path to"`
- `2` Generare la soluzione

Gestione dell'orario
--------------------

Gestione automatica dell'orario dati gli input dell'operatore e i dati del database

- `1` Generazione della soluzione (soluzioni in ordine dalla migliore alla peggiore)
    - `1.1` Uscita anticipata della classe    
    - `1.2` Entrata posticipata della classe    
    - `1.3` Sostituzione del docente   
