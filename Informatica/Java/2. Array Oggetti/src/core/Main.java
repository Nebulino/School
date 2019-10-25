package core;

public class Main {
    public static void main(String[] args){
        Mensola mensola = new Mensola();
        Libro l1 = new Libro("Informatical", "Meini - Formichi", 180);
        Libro l2 = new Libro("Informatical2", "Meini - Formichi", 180);
        mensola.setVolume(l1, 17);
        mensola.setVolume(l1, 18);
        mensola.setVolume(l1, 19);
        for(int i = 0; i < 50; i++){
            int j = mensola.setVolume(l1);
            if(j >= 0){
                System.out.println(String.format("Libro messo nella posizione %s", j));
            }
            else {
                System.out.println("Posizione occupata");
            }
        }
    }
}
