package lesson2;

public class Circle extends GeometricFigure {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int calculetePerimetr() {
        return r;
    }

    @Override
    public int calculeteSquare() {
        return r*r;
    }

    @Override
    public void draw() {
        System.out.println("circle becomes blue");
    }

    @Override
    public void defMethod() {
        super.defMethod();
    }
}
