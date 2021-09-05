package lesson1;

import java.util.Arrays;

public class User {
    private int id = 1;
    private String name = "John";
    private String surname = " MacArtur";
    private double weight = 85.2;
    private boolean status = true;
    private String[] skills = {"JS", "java"};
//    String[] phrases = new String[10];

    public User(int id, String name, String surname, double weight, boolean status, String[] skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.status = status;
        this.skills = skills;
    }

    public User() {

    }

    public void greeting() {
        System.out.println("hello my name is " + this.name + " "
                + this.surname);
    }

    public String greetingReturn() {
        return "hello my name is " + this.name + " "
                + this.surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", status=" + status +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
