package Burger;

public class DoubleMeatBurger extends BurgerMain{
    String bread;
    String cheese;
    String green;
    String mayo;
    String doubleMeat;

    public DoubleMeatBurger(String bread, String cheese, String green, String mayo, String doubleMeat) {
        this.bread = bread;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;
        this.doubleMeat = doubleMeat;
    }

    @Override
    public String toString() {
        return "DoubleMeatBurger{" +
                "bread='" + bread + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                ", mayo='" + mayo + '\'' +
                ", doubleMeat='" + doubleMeat + '\'' +
                '}';
    }
}
