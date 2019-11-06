package core.prestiti;

import core.biblioteca.Libro;

import java.util.Calendar;

public class Prestito {
    private Utente utente;
    private Libro libro;
    private Calendar dataInizio;
    private Calendar dataFine;
    private int numeroPrestito;
    private final int RESTITUISCI_OK = 30;

    public Prestito(Utente utente, Libro libro){
        this.utente = utente;
        this.libro = libro;
        this.dataInizio = Calendar.getInstance();
        this.dataFine = null;
    }

    public void chiudiPrestito(){
        dataFine = Calendar.getInstance();
    }

    public int getNumeroPrestito() {
        return numeroPrestito;
    }
}
