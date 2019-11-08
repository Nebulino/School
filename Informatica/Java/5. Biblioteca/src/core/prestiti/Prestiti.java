package core.prestiti;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Prestiti {
    private Prestito[] prestiti;
    private final int DIM = 1000;

    public Prestiti(){
        prestiti = new Prestito[DIM];
    }

    public int aggiungiPrestito(Prestito prestito){
        for(int i = 0; i < DIM; i++){
            if(prestiti[i] == null){
                prestiti[i] = prestito;
                return 1;
            }
        }
        return -1;
    }

    public int chiudiPrestito(int numeroPrestito){
        for(int i = 0; i < DIM; i++){
            if(prestiti[i] != null && prestiti[i].getNumeroPrestito() == numeroPrestito){
                if(Calendar.getInstance().after(prestiti[i].getDataLimite())){
                    return -1;
                }
                prestiti[i].chiudiPrestito();
                return 1;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder lista = new StringBuilder();
        for(int i = 0; i < DIM; i ++){
            Prestito p = prestiti[i];
            if(p != null){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String dataInizio = dateFormat.format(p.getDataInizio().getTime());
                String dataFine = String.format("[%s]", dateFormat.format(p.getDataLimite().getTime()));
                if(p.getDataFine() != null){
                    dataFine = dateFormat.format(p.getDataFine().getTime());
                }
                lista.append(String.format("%s (%s / %s): %s\n", p.getNumeroPrestito(), dataInizio, dataFine, p.getLibro().getTitolo()));
            }
        }
        return lista.toString();
    }
}
