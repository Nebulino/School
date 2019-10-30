package core;

public class Autonoleggio {
    private final int DIM = 100;
    private Auto[] veicoli;

    public Autonoleggio(){
        this.veicoli = new Auto[DIM];
    }

    public int addVeicolo(Auto auto){
        for(int i = 0; i < DIM; i++){
            if(this.veicoli[i] == null){
                this.veicoli[i] = auto;
                return i;
            }
        }
        return -1;
    }
}
