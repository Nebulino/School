package core;

public class Mensola {
    private final int DIM = 50;
    private Libro[] volumi;
    private int dim;

    public Mensola(){
        volumi = new Libro[DIM];
        dim = DIM;
    }

    public Mensola(int dim){
        volumi = new Libro[dim];
        this.dim = dim;
    }

    public Mensola(Libro[] volumi){
        this.volumi = volumi;
    }

    public int setVolume(Libro volume, int posizione){
        if((posizione < 0 || posizione > DIM) || this.volumi[posizione] != null){
            return -1;
        }
        this.volumi[posizione] = volume;
        return posizione;
    }

    public int setVolume(Libro volume){
        int i;
        for(i = 0; i < this.dim; i++){
            if(this.volumi[i] == null) {
                this.volumi[i] = volume;
                return i;
            }
        }
        return -1;
    }

    public int cercaPosLibro(String nome){
        int i;
        for(i = 0; i < this.dim; i++){
            if(this.volumi[i] != null) {
                if(this.volumi[i].getTitolo().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }
        return -1;
    }

    public Libro cercaLibro(String nome){
        int posizione = cercaPosLibro(nome);
        if(posizione >= 0){
            return this.volumi[posizione];
        }
        return null;
    }

    public int rimuoviLibro(String titolo){
        int posizione = cercaPosLibro(titolo);
        if(posizione >= 0){
            this.volumi[posizione] = null;
            return posizione;
        }
        return -1;
    }
}
