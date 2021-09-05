package lesson4;

import lesson2.Person;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list= new ArrayList<>();
//        list.add("Hello");
//        list.add("world");
//        list.add("oyy");
//        System.out.println(list);
//        for (String s : list) {
//            System.out.println(s);
//
//        }
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person(1,"Dimas",21));
//        personList.add(new Person(2,"Oleg", 23));
//        personList.add(new Person(3,"alla",43));
//        personList.add(new Person(4,"Ira",32));
//        for (Person person : personList) {
//            if(person.getName().endsWith("a")){
//                System.out.println(person);
//            }
//
//        }
//        for (Person person : personList) {
//            if(person.getId()%2!=0){
//                System.out.println(person);
//            }
//        }
//final Iterator<Person> iterator = personList.iterator();
//final Person next = iterator.next();
//    while (iterator.hasNext()){
//        final Person person =iterator.next();
//        if (person.getName().endsWith("a")) {
//            iterator.remove();
//        }
//    }
//        for (Person person : personList) {
//            System.out.println(person);
//        }
//        Set<String> set = new HashSet<>();
//        set.add("first");
//        set.add("second");
//        set.add("third");
//        System.out.println(set);
//        for (String s : set) {
//            System.out.println(s.hashCode());
//
//        }
        Set<String> set = new TreeSet<>();
        set.add("first");
        set.add("second");
        set.add("third");
        System.out.println(set);
    }
}
