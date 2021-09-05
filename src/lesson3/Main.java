package lesson3;

import javax.net.ssl.HostnameVerifier;

public class Main {
    public static void main(String[] args) {
//final CarType sedan = CarType.valueOf("SEDAN");
//        System.out.println(sedan);
//        final CarType[] values = CarType.values();
//        for (CarType value : values) {
//            if (value.getUkrainianTranslation().equals("Хетчбек")) {
//                value.setUkrainianTranslation("hello");
//            }
//            System.out.println(value);
//        }
        Engine engine=new Engine(12,124);
        Car car = new Car("honda",24522,new Engine(2,356),CarType.HATCHBACK );
car.getEngine().startEngine();
    }
}
