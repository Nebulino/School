package core;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Autonoleggio autonoleggio = new Autonoleggio();
        Scanner scanner = new Scanner(System.in);
        int check, scelta = -1, codice, numeroPosti;
        String targa, marca, modello;
        while(scelta != 0){
            System.out.println("1. Aggiungi auto\n0. Uscita");
            scelta = scanner.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("Inserisci il codice: ");
                    codice = scanner.nextInt();
                    System.out.println("Inserisci la targa: ");
                    targa = scanner.next();
                    System.out.println("Inserisci la marca: ");
                    marca = scanner.next();
                    System.out.println("Inserisci il modello: ");
                    modello = scanner.next();
                    check = autonoleggio.addVeicolo(new Auto(codice, targa, marca, modello, 5));
                    if(check >= 0){
                        System.out.println(String.format("Auto aggiunta nel posto %s", check));
                    }
                    else{
                        System.out.println("Nessun posto libero");
                    }
                    break;
                case 0:
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Valore non valido");
                    break;
            }
        }
    }
}
