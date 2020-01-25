package pl.sda.academy.intermediate.basic.Basic2Lists;

import java.util.ArrayList;
import java.util.List;

public class Basic2Lists {
    public static void main(String[] args) {
        Person person = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person1 = new Person("Adam ", "Malysz", "Wisla", 42, 123456789);
        Person person2 = new Person("Ala", "Makota", "Warszawa", 15, 111222333);
        Person person3 = new Person("Juliusz", "Slowacki", "Krakow", 40, 102035040);
        Person person4 = new Person("Tomasz", "Kowalski", "Lodz", 12, 13342523);

        List<Person> lista = new ArrayList<>();
        lista.add(person);
        lista.add(person1);
        lista.add(person2);
        lista.add(person3);
        lista.add(person4);

        for (Person personAll : lista) {
            personAll.wyswietlListe(personAll);
        }

        System.out.println("===========================================================================================");
        for (Person personAll : lista) {
            personAll.personTwentyYears(personAll);
        }

        System.out.println("===========================================================================================");
        for (Person personAll : lista) {
            personAll.phoneNumber(personAll);
        }

        System.out.println("===========================================================================================");
        for (Person personAll : lista) {
            personAll.sumAge(personAll);
        }

        System.out.println("===========================================================================================");
        List<Person> CopyList = new ArrayList<Person>(lista);
        lista.remove(person2);
        for (Person personAll : lista) {
            personAll.viewCopyList(personAll);
        }

        System.out.println("===========================================================================================");
        for (Person personAll : lista) {
            personAll.sizeList(personAll);

        }


    }
}
