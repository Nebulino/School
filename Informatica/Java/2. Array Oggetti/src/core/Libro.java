package core;

public class Libro {
    private String titolo;
    private String autore;
    private int numeroPagine;

    public Libro(String titolo, String autore, int numeroPagine){
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }
}
