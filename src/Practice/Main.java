package Practice;
//а) Определить интерфейс Printable, содержащий метод void print().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.
//        д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//        е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
//        который выводит на консоль названия только журналов.
//        Создать статический метод printBooks(Printable[] printable) в классе Book,
//        который выводит на консоль названия только книг. Используем оператор instanceof. Смотрите решение задачи в видео.
public class Main {
    public static void main(String[] args) {
Gitare g = new Gitare();
Baraban b =new Baraban();
Truba tr= new Truba();
Tools[] tools ={g,b,tr};
        for (Tools tool : tools) {
            tool.play();
        }
    }
}
