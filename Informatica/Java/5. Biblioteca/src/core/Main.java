package core;

import core.biblioteca.Biblioteca;
import core.biblioteca.Libro;
import core.prestiti.Prestiti;
import core.prestiti.Prestito;
import core.prestiti.Utente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        Libro libro = new Libro("titolo", "autore", 2005);
        biblio.addLibro(libro);
        Utente user = new Utente("Nome", "Cognome", 10);
        Prestiti registro = new Prestiti();
        Scanner scanner = new Scanner(System.in);
        int i = -1, check;
        while(i != 0){
            System.out.println("1. Aggiungi Libro\n2. Rimuovi Libro\n3. Aggiungi Prestito\n4. Chiudi Prestito\n5. Visualizza Prestiti\n0. Esci");
            i = scanner.nextInt();
            switch(i){
                case 1:
                    check = biblio.addLibro(libro);
                    if(check < 0){
                        System.out.println("Biblioteca piena");
                    }
                    else{
                        System.out.println("Libro aggiunto correttamente");
                    }
                    break;
                case 2:
                    check = biblio.removeLibro(scanner.nextInt());
                    if(check < 0){
                        System.out.println("Valore non valido");
                    }
                    else{
                        System.out.println("Libro rimosso correttamente");
                    }
                    break;
                case 3:
                    check = registro.aggiungiPrestito(new Prestito(user, libro));
                    if(check < 0){
                        System.out.println("Registro prestiti pieno");
                    }
                    else{
                        System.out.println("Prestito aggiunto correttamente");
                    }
                    break;
                case 4:
                    System.out.print("Inserisci l'id del prestito da chiudere: ");
                    check = registro.chiudiPrestito(scanner.nextInt());
                    if(check < 0){
                        System.out.println("Impossibile chiudere il prestito");
                    }
                    else{
                        System.out.println("Prestito chiuso correttamente");
                    }
                    break;
                case 5:
                    System.out.println(registro);
                    break;
                default:
                    System.out.println("Valore non valido");
                    break;
            }
        }
    }
}
