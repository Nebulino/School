package core;

public class CD {
    private String autore;
    private String titolo;
    private int numeroBrani;

    public CD(String autore, String titolo, int numeroBrani){
        this.autore = autore;
        this.titolo = titolo;
        this.numeroBrani = numeroBrani;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getNumeroBrani() {
        return numeroBrani;
    }

    public boolean equals(CD cd){
        return autore.equals(cd.getAutore()) && titolo.equals(cd.getTitolo());
    }
}
