package Practice;

public class Baraban implements Tools{
    int hight= 2;

    @Override
    public void play() {
        System.out.println("Грає барабан з "+hight+" дециметри");
    }
}
