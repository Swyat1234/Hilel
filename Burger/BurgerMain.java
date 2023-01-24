package Burger;

public class BurgerMain {
    public static void main(String[] args) {
Burger burger = new Burger("meat","bread","cheese","green","mayo");
VegBurger vegBurger = new VegBurger("bread","cheese","green","mayo");
DoubleMeatBurger doubleMeatBurger = new DoubleMeatBurger("bread","cheese","green","mayo","doubleMeat");

        System.out.println(burger);
        System.out.println(vegBurger);
        System.out.println(doubleMeatBurger);

    }
}
