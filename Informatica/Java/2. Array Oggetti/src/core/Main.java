package core;

public class Main {
    public static void main(String[] args){
        Mensola mensola = new Mensola();
        Libro l1 = new Libro("Informatical", "Meini - Formichi", 180);
        Libro l2 = new Libro("Informatical2", "Meini - Formichi", 180);
        if(mensola.setVolume(l1, 5) > -1){
            System.out.println("Libro inserito correttamente");
        }
        else{
            System.out.println("Posizione già occupata");
        }
    }
}
