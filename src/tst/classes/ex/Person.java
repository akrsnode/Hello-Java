package tst.classes.ex;

public class Person {

    public String name;
    public int age;

    public String street;
    public int houseNr;

    private static final String PESEL = "98092604420";

    public Person(String name, int age, String street, int houseNr) {
        this.name = name;
        this.age = age;
        this.street = street;
        this.houseNr = houseNr;
    }

    public Person(String name2) {
        name = name2;
    }

    public String getName() {
        return name;
    }
}
