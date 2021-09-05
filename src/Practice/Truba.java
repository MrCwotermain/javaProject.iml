package Practice;

public class Truba implements Tools {
    @Override
    public void play() {
        System.out.println("Грає треба з діаметром "+ diametr+" cантиметрів");
    }

    int diametr = 5;
}
