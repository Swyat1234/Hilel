package Burger;

public class Burger extends BurgerMain {
    String meat;
    String bread;
    String cheese;
    String green;
    String mayo;


    protected Burger(String meat, String bread, String cheese, String green, String mayo) {
        this.meat = meat;
        this.bread = bread;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "meat='" + meat + '\'' +
                ", bread='" + bread + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                ", mayo='" + mayo + '\'' +
                '}';
    }
}

