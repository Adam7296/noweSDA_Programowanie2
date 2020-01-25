package pl.sda.academy.intermediate.basic.Basic2Lists;

public class Person {
    private String name;
    private String surmae;
    private String placeOfBirth;
    private int age;
    private long phone;

    public Person(String name, String surmae, String placeOfBirth, int age, long phone) {
        this.name = name;
        this.surmae = surmae;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurmae() {
        return surmae;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public int getAge() {
        return age;
    }

    public long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surmae='" + surmae + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    public void wyswietlListe(Person personAll) {
        System.out.println(personAll);
    }

    public void personTwentyYears(Person personAll) {
        if (personAll.getAge() > 20) {
            System.out.println(personAll.getName());
        }
    }

    public void phoneNumber(Person personAll) {
        if (personAll.getPhone() % 2 == 0) {
            System.out.println(personAll.getPhone());
        }
    }

    public void sumAge(Person personAll) {
        int suma = 0;
        suma += personAll.getAge();
        System.out.println(suma);
    }


    public void viewCopyList(Person personAll) {
        System.out.println(personAll);
    }

    public void sizeList(Person personAll) {
        System.out.println(personAll);
    }
}
