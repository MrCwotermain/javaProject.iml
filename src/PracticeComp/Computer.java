package PracticeComp;

import lesson6.Person;

import java.util.Objects;

//Створити класс Компьютер з полями
//        - модель
//        - рік випуску
//        - об'єм пам'яті
//        - ціна
public class Computer {
    public Computer(String lg, int yearMade, int capacity, int price) {

    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", yearMade=" + yearMade +
                ", capacity=" + capacity +
                ", price=" + price +
                ", hardDrive=" + hardDrive +
                ", processor=" + processor +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Computer(String model, int yearMade, int capacity, int price, HardDrive hardDrive, Processor processor) {
        this.model = model;
        this.yearMade = yearMade;
        this.capacity = capacity;
        this.price = price;
        this.hardDrive = hardDrive;
        this.processor = processor;
    }

    String model;
    int yearMade;
    int capacity;
    int price;
    HardDrive hardDrive;
    Processor processor;
}
