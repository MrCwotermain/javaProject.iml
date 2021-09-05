package lesson2;

public interface Drowable {
    int A =10;
    void draw();
    default void defMethod(){
        System.out.println("default method");
    }

}
