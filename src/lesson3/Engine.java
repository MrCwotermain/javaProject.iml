package lesson3;

public class Engine {
    private int volume;
    private int power;

    public int getVolume() {
        return volume;
    }
public void startEngine(){
    System.out.println(String.format("Engine is started with %s power", this.power));
}
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Engine(int volume, int power) {
        this.volume = volume;
        this.power = power;
    }
}
