package core.biblioteca;

public class Biblioteca {
    private final int DIM = 1000;
    Libro[] libri;

    public Biblioteca(){
        libri = new Libro[DIM];
    }

    public int addLibro(Libro l){
        for(int i = 0; i < DIM; i++){
            if(libri[i] == null){
                libri[i] = l;
                return i;
            }
        }
        return -1;
    }

    public int removeLibro(int pos){
        if(pos < 0 || pos > DIM){
            return -1;
        }
        libri[pos] = null;
        return pos;
    }
}
