
public class Main {
    public static void main(String[] args) {
    Person johny = new Person();
    johny.name = "Johny";
    johny.surname = "Memo";
    johny.town = "Tokyo";
    johny.telephone = "1312";

    Person steve = new Person();
    steve.name = "Steve";
    steve.surname = "Hooman";
    steve.town = "Berlin";
    steve.telephone = "888888888";

    Person dave = new Person();
    dave.name = "Dave";
    dave.surname = "Johnson";
    dave.town = "Capetown";
    dave.telephone = "0000000000";

        System.out.println(dave.getPersonInfo());
        System.out.println(johny.getPersonInfo());
        System.out.println(steve.getPersonInfo());
    }
}



            









