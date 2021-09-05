package PracticeComp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Створити список з 20 об'єктів.
        List<Computer> lists= new ArrayList<>();

        Computer comp1= (new Computer("Lg",2018,3,1200,
                new HardDrive("lоа",32,Type.HDD,Country.CHINA),
                new Processor("i7",4,124, Processor.Country.India)));
        Computer comp2= (new Computer("appe",2009,3,1200,
                new HardDrive("toshiba",353,Type.HDD,Country.INDIA),
                new Processor("i7",4,124, Processor.Country.India)));
        Computer comp3= (new Computer("samsung",2008,3,1200,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("i5",4,124, Processor.Country.India)));
        Computer comp4= (new Computer("appe",2019,3,1700,
                new HardDrive("toshiba",753,Type.SSD,Country.USA),
                new Processor("i7",4,124, Processor.Country.India)));
        Computer comp5= (new Computer("appe",2015,3,1200,
                new HardDrive("toshiba",753,Type.SSD,Country.USA),
                new Processor("5",4,124, Processor.Country.India)));
        Computer comp6= (new Computer("Lg",2007,3,1200,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("5",4,124, Processor.Country.India)));
        Computer comp7= (new Computer("samsung",2019,3,1200,
                new HardDrive("toshiba",753,Type.SSD,Country.USA),
                new Processor("i2",4,124, Processor.Country.India)));
        Computer comp8= (new Computer("Lg",2019,3,1200,
                new HardDrive("toshiba",753,Type.SSD,Country.USA),
                new Processor("i9",4,124, Processor.Country.India)));
        Computer comp9= (new Computer("Lenovo",2018,3,1200,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("i9",4,124, Processor.Country.India)));
        Computer comp10= (new Computer("Lg",2016,3,1200,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("i8",4,124, Processor.Country.India)));
        Computer comp11= (new Computer("appe",2015,4,1200,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("i7",4,124, Processor.Country.India)));
        Computer comp12= (new Computer("Lenovo",2014,3,1200,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("i5",4,124, Processor.Country.India)));
        Computer comp13= (new Computer("Lg",2019,3,1200,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("i3",4,124, Processor.Country.India)));
        Computer comp14= (new Computer("samsung",2013,3,1200,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("i3",4,124, Processor.Country.India)));
        Computer comp15= (new Computer("Lg",2012,3,1200,
                new HardDrive("lоа",32,Type.HDD,Country.CHINA),
                new Processor("i9",4,124, Processor.Country.India)));
        Computer comp16= (new Computer("Lenovo",2002,3,900,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("i7",4,124, Processor.Country.India)));
        Computer comp17= (new Computer("samsung",2011,3,1200,
                new HardDrive("lоа",32,Type.HDD,Country.CHINA),
                new Processor("i5",4,124, Processor.Country.India)));
        Computer comp18= (new Computer("Lenovo",2010,3,1200,
                new HardDrive("lоа",32,Type.HDD,Country.CHINA),
                new Processor("i3",4,124, Processor.Country.India)));
        Computer comp19= (new Computer("Dell",2008,3,1200,
                new HardDrive("toshiba", 543,Type.SSD,Country.KOREA),
                new Processor("i5",4,124, Processor.Country.India)));
        Computer comp20= (new Computer("Lenovo",2007,3,1200,
                new HardDrive("lоа",32,Type.HDD,Country.CHINA),
                new Processor("i3",4,124, Processor.Country.India)));
        lists.add(comp1);
        lists.add(comp2);
        lists.add(comp3);
        lists.add(comp4);
        lists.add(comp5);
        lists.add(comp6);
        lists.add(comp7);
        lists.add(comp8);
        lists.add(comp9);
        lists.add(comp10);
        lists.add(comp11);
        lists.add(comp12);
        lists.add(comp13);
        lists.add(comp14);
        lists.add(comp15);
        lists.add(comp16);
        lists.add(comp17);
        lists.add(comp18);
        lists.add(comp19);
        lists.add(comp20);
//        System.out.println(list);

        //
        //        Далі
//        1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        final List<String> collect = lists.stream().
//                map(Computer::getModel).collect(Collectors.toList());
//        System.out.println(collect);

//                final int currentYear = LocalDate.now().getYear();
//        final List<Computer> oldComp = lists.stream().filter(computer -> currentYear - computer.getYearMade() > 11)
//                .collect(Collectors.toList());
//        oldComp.forEach(System.out::println);


//        2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник SSD Китай
//        final int currentYear = LocalDate.now().getYear();
//        final List<Computer> oldComp = lists.stream().filter(computer -> currentYear - computer.getYearMade() > 11
//                && computer.getHardDrive().getCountry()==Country.CHINA)
//                .collect(Collectors.toList());
//        oldComp.forEach(System.out::println);

//        3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        та країну виробник дисків не Китай
//        final int currentYear = LocalDate.now().getYear();
//        final List<Computer> oldComp = lists.stream().filter(computer -> currentYear - computer.getYearMade() > 11
//                && computer.getHardDrive().getCountry()!=Country.CHINA)
//                .collect(Collectors.toList());
//        oldComp.forEach(System.out::println);
//        4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
//        final List<Computer> collect = lists.stream().filter(computer -> computer.getHardDrive().getCapacityDrive() > 500)
//                .collect(Collectors.toList());
//        collect.forEach(System.out::println);
//        5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
//        final List<Computer> computers = lists.stream().filter(computer -> computer.getHardDrive().getCapacityDrive() > 500
//                && computer.getProcessor().procType == "i7").collect(Collectors.toList());
//        computers.forEach(System.out::println);
//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//        та процессор і7 посортувати за ціною
//        final List<Computer> computers = lists.stream().filter(computer -> computer.getHardDrive().getCapacityDrive() > 500
//                && computer.getProcessor().procType == "i7").sorted((o1, o2) ->o1.getPrice()-o2.getPrice()).collect(Collectors.toList());
//        computers.forEach(System.out::println);
    }
}
