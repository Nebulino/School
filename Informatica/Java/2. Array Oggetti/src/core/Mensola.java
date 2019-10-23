package core;

public class Mensola {
    private final int DIM = 50;
    private Libro[] volumi;

    public Mensola(){
        volumi = new Libro[DIM];
    }

    public Mensola(int dim){
        volumi = new Libro[dim];
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
}
