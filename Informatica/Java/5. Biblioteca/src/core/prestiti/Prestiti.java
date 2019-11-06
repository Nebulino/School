package core.prestiti;

public class Prestiti {
    private Prestito[] prestiti;
    private final int DIM = 1000;

    public Prestiti(){
        prestiti = new Prestito[DIM];
    }

    // TODO: Da completare
    public int aggiungiPrestito(Prestito prestito){
        return 1;
    }

    public int chiudiPrestito(int numeroPrestito){
        for(int i = 0; i < DIM; i++){
            if(prestiti[i] != null && prestiti[i].getNumeroPrestito() == numeroPrestito){
                prestiti[i].chiudiPrestito();
                return 1;
            }
        }
        return -1;
    }
}
