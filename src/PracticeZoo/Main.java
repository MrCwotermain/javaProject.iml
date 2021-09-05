package PracticeZoo;
//Створити  Зооклуб.
//        В мейн методі створити меню, яке буде реалізовувати наступні функції:
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) вивести усіх тваринок конкретного власника
//        6) вивести на екран зооклуб.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> club= new LinkedList<>();
        Scanner Person = new Scanner(System.in);
        club.add ( Person.nextLine());
       
        System.out.println(club);
    }
}
