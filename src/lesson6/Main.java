package lesson6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Petro", "Ukrainian",LocalDate.of(1996, 11, 6)));
        list.add(new Person(2, "Ania","Ukrainian", LocalDate.of(1999, 11, 6)));
        list.add(new Person(3, "Dima","Polish", LocalDate.of(2004, 11, 6)));
        list.add(new Person(4, "Vova","Spain", LocalDate.of(1980, 11, 6)));
        list.add(new Person(5, "Taras","Spain", LocalDate.of(1991, 11, 6)));
//        Predicate<Person> personBorn1991 = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getBirthDate().getYear()==1991;
//            }
//        };
//final  boolean b= personBorn1991.test(new Person(1,"Petro", LocalDate.of(1991,11,6)) );
//        System.out.println(b);
//вивести всі елементи на екран
//        list.forEach(System.out::println);
//list.stream().forEach(System.out::println);


//   створити колекцію імен( витягнути їхні імена)
//        final List<String> names = list.stream()
//                .map(Person::getName)
//                .collect(Collectors.toList());
//        System.out.println(names);


//   посортувати по ід
//        list.stream().sorted((o1, o2) -> o1.getBirthDate().getYear()-o2.getBirthDate().getYear()   ).forEach(System.out::println);
//
//
//   витягнути усіх повнолітніх
//        final int currentYear = LocalDate.now().getYear();
//        final List<Person> adults = list.stream().filter(person -> currentYear -
//                person.getBirthDate().getYear() >= 18)
//                .collect(Collectors.toList());
//        adults.forEach(System.out::println);



//      вибрати три перших та повернути їх у зворотньому порядку
//        final List<Person> a = list.stream().filter(person -> person.getName().endsWith("a"))
//                .limit(2).peek(System.out::println)
//                .collect(Collectors.toList());


//     знайти найстаршу людину
//        final Optional<Person> min = list.stream().min((o1, o2) -> o1.getBirthDate()
//                .compareTo(o2.getBirthDate()));
//        System.out.println(min);


// погрупувати людейй по національності
//        final Map<String, List<Person>> collect = list.stream()
//                .collect(Collectors.groupingBy(Person::getNationality));
//collect.entrySet().forEach(System.out::println);
    }
}




