package Burger;

public class VegBurger extends BurgerMain{
    String bread;
    String cheese;
    String green;
    String mayo;

    public VegBurger(String bread, String cheese, String green, String mayo) {
        this.bread = bread;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;
    }

    @Override
    public String toString() {
        return "VegBurger{" +
                "bread='" + bread + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                ", mayo='" + mayo + '\'' +
                '}';
    }
}
