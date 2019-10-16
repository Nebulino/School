package core;

public class Main {
    public static void main(String[] args) {
        Conto uno = new Conto("ibanProva", 500);
        System.out.println(uno.getSaldo());
        uno.versamento(20);
        uno.prelievo(70);
        System.out.println(uno.getSaldo());
        System.out.println(uno);
        uno.prelievo(-100);
        System.out.println(uno.getSaldo());
    }
}
