package lesson2;

public abstract class GeometricFigure implements  Drowable{
//    private int perimeter;
//    private  int square;
//
//    public int getPerimeter() {
//        return perimeter;
//    }
//
//    public int getSquare() {
//        return square;
//    }
//
//    public GeometricFigure(int perimeter, int square) {
//        this.perimeter = perimeter;
//        this.square = square;
//    }
    public abstract int calculetePerimetr();
    public abstract int calculeteSquare();

    @Override
    public void draw() {

    }

    @Override
    public void defMethod() {
        Drowable.super.defMethod();
    }
}
