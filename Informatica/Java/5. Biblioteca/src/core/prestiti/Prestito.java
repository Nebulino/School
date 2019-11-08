package core.prestiti;

import core.biblioteca.Libro;

import java.util.Calendar;
import java.util.Date;

public class Prestito {
    private Utente utente;
    private Libro libro;
    private Calendar dataInizio;
    private Calendar dataFine;
    private Calendar dataLimite;
    private static int id;
    private int numeroPrestito;
    private final int RESTITUISCI_OK = 30;

    public Prestito(Utente utente, Libro libro){
        this.utente = utente;
        this.libro = libro;
        this.dataInizio = Calendar.getInstance();
        this.dataFine = null;
        this.dataLimite = Calendar.getInstance();
        dataLimite.add(Calendar.DAY_OF_MONTH, RESTITUISCI_OK);
        this.numeroPrestito = id;
        id++;
    }

    public void chiudiPrestito(){
        dataFine = Calendar.getInstance();
    }

    public int getNumeroPrestito() {
        return numeroPrestito;
    }

    Libro getLibro() {
        return libro;
    }

    public Calendar getDataInizio() {
        return dataInizio;
    }

    public Calendar getDataFine() {
        return dataFine;
    }

    public Calendar getDataLimite() {
        return dataLimite;
    }
}
