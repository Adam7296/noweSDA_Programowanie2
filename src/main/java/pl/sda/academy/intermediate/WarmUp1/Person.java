package pl.sda.academy.intermediate.WarmUp1;

public class Person {

    private String name;
    private String surname;
    private String placeOfBirth;
    private int age;
    private long phone;

    public Person(String name, String surname, String placeOfBirth, int age, long phone) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return
                name + " " + surname + " (ur. " + (2020 - age) + " r.)\n" +
                        "m." + " " + "ur.:" + " " + placeOfBirth + "\n" +
                        "tel:" + " " + phone + " ";
    }
}
