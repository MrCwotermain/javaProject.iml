package Practice;

public class Gitare implements Tools{
    int strun = 6;

    @Override
    public void play() {
        System.out.println("грає гітара з кількістю "+strun+" струн");
    }
}
