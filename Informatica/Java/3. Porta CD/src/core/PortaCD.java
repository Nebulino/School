package core;

public class PortaCD {
    private CD[] portaCD;
    private static final int NCD = 50;

    public PortaCD(){
        this.portaCD = new CD[NCD];
    }

    public CD getCD(int pos){
        return portaCD[pos];
    }

    public int setCD(int pos, CD cd){
        if(portaCD[pos] == null){
            return -1;
        }
        portaCD[pos] = cd;
        return 1;
    }

    public void killCD(int pos){
        portaCD[pos] = null;
    }

    public int confrontaCollezione(PortaCD collezione){
        int contacd = 0;
        for(int i = 0; i < NCD; i++){
            if(this.portaCD[i] != null){
                for(int j = 0; j < NCD; j++){
                    if(collezione.portaCD[j] != null){
                        if(this.portaCD[i].equals(collezione.portaCD[j])){
                            contacd++;
                        }
                    }
                }
            }
        }
        return contacd;
    }

    public int cercaPerTitolo(String titolo){
        for(int i = 0; i < NCD; i++){
            if(portaCD[i].getTitolo().equals(titolo)){
                return i;
            }
        }
        return -1;
    }
}
