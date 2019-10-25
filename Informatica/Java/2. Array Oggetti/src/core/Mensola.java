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
}
