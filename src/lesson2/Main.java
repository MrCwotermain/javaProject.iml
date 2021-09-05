package lesson2;

public class Main {
    public static void main(String[] args) {
//        Person p = new Person(1,"Taras", 26);
//       Worker w = new Worker(3,"Petro", 34, 342);
//        Student s = new Student(2, "oleg", 23,80,"cs-46");
//       s.method();
//       p.method();
//       w.method();
//       Person[] persons= {p,s,w};
//        for (Person person : persons) {
//            person.method();
//        }

//p.method();
//p.method("fsfs");
Triangre t = new Triangre(2,3,5);
Circle c = new Circle(4);

GeometricFigure[] figures = {t,c};
double totalSquare=0;
        for (GeometricFigure figure : figures) {
            totalSquare+=figure.calculeteSquare();
            figure.draw();
            t.defMethod();
        }
        System.out.println(totalSquare);
    }
}
