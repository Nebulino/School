package core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Mensola mensola = new Mensola();
        int i = -1;
        Scanner scanner = new Scanner(System.in);
        while(i != 0){ ;
            System.out.println("1. Inserisci libro\n2. Rimuovi libro\n3. Cerca posizione libro\n\n0. Esci");
            i = scanner.nextInt();
            switch (i){
                case 1:
                    System.out.print("Inserisci il titolo: ");
                    String titolo = scanner.next();
                    System.out.print("Inserisci l'autore: ");
                    String autore = scanner.next();
                    System.out.print("Inserisci il numero di pagine: ");
                    int pagine = scanner.nextInt();
                    int libro = mensola.setVolume(new Libro(titolo, autore, pagine));
                    if(libro >= 0){
                        System.out.println(String.format("Libro inserito in posizione %s", libro));
                    }
                    else{
                        System.out.println("Nessuna posizione disponibile");
                    }
                    break;
                case 2:
                    System.out.print("Inserisci il titolo: ");
                    int posizione = mensola.rimuoviLibro(scanner.next());
                    if(posizione >= 0){
                        System.out.println(String.format("Rimosso il libro in posizione %s", posizione));
                    }
                    else{
                        System.out.println("Libro non trovato");
                    }
                    break;
                case 3:
                    System.out.println("Inserisci il titolo: ");
                    int pos = mensola.cercaPosLibro(scanner.next());
                    if(pos >= 0){
                        System.out.println(String.format("Libro trovato in posizione %s", pos));
                    }
                    else{
                        System.out.println("Libro non trovato");
                    }
                    break;
                case 0:
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }
    }
}
