package core;

public class Conto {
    private int[] movimenti = null;
    private int saldo;
    private String iban;

    public Conto(String iban, int saldo){
        this.movimenti = new int[5];
        this.saldo = saldo;
        this.iban = iban;
    }

    public Conto(String iban){
        this.movimenti = new int[5];
        this.saldo = 0;
        this.iban = iban;
    }

    public void versamento(int importo){
        if(importo < 0){
            System.out.println("L'importo non può essere negativo");
            return;
        }
        this.saldo += importo;
        addMovimento(importo);
    }

    public void prelievo(int importo){
        if(importo < 0){
            System.out.println("L'importo non può essere negativo");
            return;
        }
        this.saldo -= importo;
        addMovimento(-importo);
    }

    private void addMovimento(int importo){
        System.arraycopy(this.movimenti, 0, this.movimenti, 1, this.movimenti.length-1);
        this.movimenti[0] = importo;
    }

    public int[] getMovimenti() {
        return movimenti;
    }

    public int getSaldo() {
        return saldo;
    }

    public String toString(){
        String movimenti = "";
        for(int i = 0; i < this.movimenti.length; i++){
            movimenti += String.format("Movimento %s: %s\n", i, this.movimenti[i]);
        }
        return(String.format("Iban: %s\n" +
                "Saldo: %s\n" +
                "%s", iban, saldo, movimenti));
    }
}
