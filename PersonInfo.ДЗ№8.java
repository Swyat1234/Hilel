public class Person {
    public String name;
    public String surname;
    public String town;
    public String telephone;


    public String getPersonInfo(){
        return "Зателофонувати громадянину " + name + " " + surname + " з міста " + town + " за телефоном: " + telephone;
    }
}
