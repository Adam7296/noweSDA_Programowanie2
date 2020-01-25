package pl.sda.academy.intermediate.basic.Basic9;

import pl.sda.academy.intermediate.basic.Basic2Lists.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic9Streams {
    public static void main(String[] args) {

        Stream<String> namesStream = Stream.of("John", "Marry", "George", "Paul", "Alice", "Ann");

        namesStream
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        List<String> namesList = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");
        namesList
                .stream()
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        List<String> namesList1 = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");
        namesList1
                .stream()
                .filter(name -> {
                    System.out.println("Filtering name: " + name);
                    return true;
                });   // brak operacji terminującej, wcześniejsza operacja pośrednia filter nie jest wykonana

        List<String> namesList2 = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");

        namesList2
                .stream()
                .filter(name -> {
                    System.out.println("Filtering name: " + name);
                    return true;
                })
                .forEach(name -> System.out.println("Now name is printed: " + name));
// operacja terminująca forEach dodana, wykonane obie operacje (filter i forEach) - wypisane 2 linie dla każdego imienia


        Stream<Integer> numbers = Stream.of(1, 2, 3).filter(number -> number > 1);

        numbers.forEach(System.out::println);
        System.out.println("---");
//        numbers.forEach(System.out::println);

        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);


        List<Person> allPersons = Arrays.asList(person1, person2, person3);
        allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)
                .filter(person -> person.getPlaceOfBirth().equals("Zgierz"))
                .forEach(person -> System.out.println("Person: " + person.getName() + " is adult." + "i mieszka w " + person.getPlaceOfBirth()));
        List<Person> allPerson2 = Arrays.asList(person1, person2, person3);
        allPerson2
                .stream()
                .filter(person -> person.getPhone() % 2 == 0)
                .forEach(person -> System.out.println("Podzielny tel przez 2 to: " + person.getPhone()));


        List<Person> allPersons2 = Arrays.asList(person1, person2, person3);
        allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)

                // do tej pory mamy strumień elementów typu Person
                .map(person -> person.getName()) // albo z wykorzystaniem referencji do metody: Person::getName
                // teraz mamy strumień typu String!

                .forEach(name -> System.out.println("Person: " + name + " is adult."));

        System.out.println("================koniec=============================");
        System.out.println("================koniec=============================");


    }
}
