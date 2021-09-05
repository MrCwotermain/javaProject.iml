package PracticeZoo;

import java.util.Scanner;

public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "Person=" + Person +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + animal +
                '}';
    }

    public Scanner getPerson() {
        return Person;
    }

    public void setPerson(Scanner person) {
        Person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Person(Scanner person, String name, int age, Animal animal) {
        Person = person;
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    Scanner Person = new Scanner(System.in);
    String name = Person.nextLine();
    int age = Person.nextInt();
     Animal animal;



}
