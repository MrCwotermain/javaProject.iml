package lesson2;

public class Triangre extends GeometricFigure  {
    private int a;

    @Override
    public void draw() {
        System.out.println("triangle becomes red");
    }

    private int b;

    public Triangre( int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int c;




    @Override
    public int calculetePerimetr() {
        return a+b+c;
    }

    @Override
    public int calculeteSquare() {
        return a*b*c;
    }



}
