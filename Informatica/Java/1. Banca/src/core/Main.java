package core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conto conto = new Conto("IbanProva");
        int i = -1;
        Scanner scanner = new Scanner(System.in);
        while(i != 0){
            System.out.println("1. Versamento\n2. Prelievo\n3. Resoconto\n\n0. Esci");
            i = scanner.nextInt();
            switch (i){
                case 1:
                    System.out.println("Inserisci la cifra da versare: ");
                    conto.versamento(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Inserisci la cifra da prelevare: ");
                    conto.prelievo(scanner.nextInt());
                    break;
                case 3:
                    System.out.println(conto);
                    break;
                default:
                    System.out.println("Valore non valido");
            }
        }
    }
}
