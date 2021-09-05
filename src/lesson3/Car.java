package lesson3;

public class Car {
    private String brand;
    private int price;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", engine=" + engine +
                ", carType=" + carType +
                '}';
    }

    private Engine engine;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Car(String brand, int price, Engine engine, CarType carType) {
        this.brand = brand;
        this.price = price;
        this.engine = engine;
        this.carType = carType;
    }

    private CarType carType;


}
